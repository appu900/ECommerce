package com.luxlane.backend.config;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.crypto.SecretKey;
import java.io.IOException;
import java.util.List;


public class JwtValidator extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
      String jwt = request.getHeader(JwtConstant.JWT_HEADER);
      if(jwt != null){
          jwt = jwt.substring(7);
          try{
             SecretKey key = Keys.hmacShaKeyFor(JwtConstant.SECRETE_KEY.getBytes());
             Claims claims = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJwt(jwt).getBody();

             String email = String.valueOf(claims.get("email"));
             String authority = String.valueOf(claims.get("authority"));
              List<GrantedAuthority> auths = AuthorityUtils.commaSeparatedStringToAuthorityList(authority);
              Authentication authentication = new UsernamePasswordAuthenticationToken(email,null,auths);

              SecurityContextHolder.getContext().setAuthentication(authentication);

          }catch (Exception e){
              throw new BadCredentialsException("Invalid Token");
          }
      }

      filterChain.doFilter(request,response);

    }
}

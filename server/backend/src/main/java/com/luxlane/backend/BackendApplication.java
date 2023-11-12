package com.luxlane.backend;

import com.luxlane.backend.Service.*;
import com.luxlane.backend.config.JwtProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    public ProductService productService(){
        return new ProductServiceImp();
    }

    @Bean
    public CartService cartService(){
        return new CartServiceImp();
    }
    @Bean
    public CartItemService cartItemService(){
        return new CartItemServiceImp();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImp();
    }

    @Bean
    public RatingService ratingService(){
        return new RatingServiceImp();
    }







}

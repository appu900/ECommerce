package com.luxlane.backend.Service;

import com.luxlane.backend.Exception.UserException;
import com.luxlane.backend.Model.User;
import com.luxlane.backend.Repository.UserRepository;
import com.luxlane.backend.config.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepo;
    @Autowired
    JwtProvider jwtProvider;

    @Override
    public User findUserById(Long userid) throws UserException {
        Optional<User> user = userRepo.findById(userid);
        if(user.isPresent()){
            return user.get();
        }
        else{
            throw new UserException("User not found");
        }
    }

    @Override
    public User findUserProfileByJwt(String jwt) throws UserException {
        String email = jwtProvider.getEmailFromToken(jwt);
        User user = userRepo.findByEmail(email);
        if(user == null){
            throw new UserException("User not found with this email"+email);
        }
        return user;
    }
}

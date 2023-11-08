package com.luxlane.backend.Service;


import com.luxlane.backend.Exception.UserException;
import com.luxlane.backend.Model.User;

public interface UserService {

    public User findUserById(Long userid) throws UserException;
    public User findUserProfileByJwt(String jwt) throws UserException;


}

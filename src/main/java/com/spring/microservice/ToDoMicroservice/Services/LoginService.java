package com.spring.microservice.ToDoMicroservice.Services;

import com.spring.microservice.ToDoMicroservice.Models.User;
import com.spring.microservice.ToDoMicroservice.Utilities.UserNotFoundException;
import com.spring.microservice.ToDoMicroservice.Utilities.UserNotInDataBaaseException;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Map;
import java.util.Optional;

public interface LoginService {
    Optional<User> findUserFromDB(String email, String pwd) throws UserNotInDataBaaseException;

    String createJwt(String email, String name, Date date) throws UnsupportedEncodingException;

    Map<String, Object> verifyJwtAndGetData(HttpServletRequest request) throws UnsupportedEncodingException,
            UserNotFoundException;


}

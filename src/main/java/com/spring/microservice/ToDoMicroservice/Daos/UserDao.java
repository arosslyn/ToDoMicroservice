package com.spring.microservice.ToDoMicroservice.Daos;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<UserDao, String> {


    //name and the strategy of how we are going to get the name that we need.
    Optional<UserDao> findUserByemail(String email);
}

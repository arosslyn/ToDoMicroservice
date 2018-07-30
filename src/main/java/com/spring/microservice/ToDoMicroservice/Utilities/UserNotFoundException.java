package com.spring.microservice.ToDoMicroservice.Utilities;

public class UserNotFoundException extends Exception {

    //creating our constructor from the parent Exception class
    public UserNotFoundException(String message){
        super(message); // we pass the message to the parent class
    }

}

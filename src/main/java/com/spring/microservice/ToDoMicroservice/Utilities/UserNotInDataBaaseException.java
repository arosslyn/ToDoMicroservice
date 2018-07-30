package com.spring.microservice.ToDoMicroservice.Utilities;

public class UserNotInDataBaaseException extends Exception {

    // we are creating our custom constructor but passing on the parent(Exceptions) constructor as well
    public UserNotInDataBaaseException(String message){
        super(message); // passes a message from the exception parent class
    }
}

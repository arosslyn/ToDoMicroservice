package com.spring.microservice.ToDoMicroservice.Controllers;


import com.spring.microservice.ToDoMicroservice.Daos.ToDoDao;
import com.spring.microservice.ToDoMicroservice.Daos.UserDao;
import com.spring.microservice.ToDoMicroservice.Models.ToDo;
import com.spring.microservice.ToDoMicroservice.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired UserDao userDao; @Autowired ToDoDao toDoDao; @Autowired ToDo toDo;
    @Autowired User user;

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello! This is your first simple microservice";
    }
    @RequestMapping("/userInOutput")
    public User giveMeAUser(){
        return new User("rossyn@email.com", "Rosslyn", "passwordEncrypted" );
    }

    @RequestMapping("/toDoInInput1") // jackson library -> object.java -> json message
     public String toDoInInput1(ToDo toDo){
        return "ToDo Description: " + toDo.getDescription() + " , ToDo Priority: " + toDo.getPriority();
     }
}

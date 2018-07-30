package com.spring.microservice.ToDoMicroservice.Daos;

import com.spring.microservice.ToDoMicroservice.Models.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToDoDao extends JpaRepository<ToDo, Integer> {

    List<ToDo> findByfkUser(String email);
}

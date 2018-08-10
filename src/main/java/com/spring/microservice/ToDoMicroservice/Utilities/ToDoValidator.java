package com.spring.microservice.ToDoMicroservice.Utilities;

import com.spring.microservice.ToDoMicroservice.Models.ToDo;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ToDoValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return ToDo.class.equals(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        ToDo toDo = (ToDo) obj;
        String priority = toDo.getPriority();
        if(!"high".equals(priority) && !"low".equals(priority)){
            errors.rejectValue("priority", "Priority must be 'high' or 'low'!");
        }

    }
}

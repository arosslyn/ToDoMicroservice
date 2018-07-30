package com.spring.microservice.ToDoMicroservice.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "ToDo")
@AllArgsConstructor@NoArgsConstructor
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    @Column(name = "ID")
    private Integer id;


    @Column(name = "DESCRIPTION")
    @NotNull @NotEmpty @NotBlank
    @Getter @Setter
    private String description;


    @Column(name = "DATE")
    @Getter @Setter
    private Date date;


    @Column(name = "PRIORITY")
    @NotNull @NotEmpty @NotBlank
    @Getter @Setter
    private String priority;


    @Column(name = "FK_USER")
    @NotNull @NotEmpty @NotBlank
    @Getter @Setter
    private String fkUser;

    @PrePersist
    void getTimeOperation(){
        this.date = new Date();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}

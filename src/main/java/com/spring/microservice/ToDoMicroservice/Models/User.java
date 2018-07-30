package com.spring.microservice.ToDoMicroservice.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
@AllArgsConstructor @NoArgsConstructor
public class User {
    @Id
    @Getter@Setter
    @NotNull@NotBlank@NotEmpty
    @Column(name = "EMAIL")
    private String email;

    @Getter@Setter
    @Column(name = "NAME")
    @NotNull@NotBlank@NotEmpty
    private String name;

    @Getter@Setter
    @Column(name = "PASSWORD")
    @NotNull@NotBlank@NotEmpty
    private String password;

    public User(@NotNull @NotBlank @NotEmpty String email, @NotNull @NotBlank @NotEmpty String name, @NotNull @NotBlank @NotEmpty String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }
}

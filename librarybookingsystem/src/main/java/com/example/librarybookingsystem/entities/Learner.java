package com.example.librarybookingsystem.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Builder
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="learner")
public class Learner {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    // @NotBlank(message = "Username is mandatory")
    // @Column(name = "username")
    // private String title;

    // @NotBlank(message = "password is mandatory")
    // @Column(name = "password")
    // private String password;

    @NotBlank(message = "First name is mandatory")
    @Column(name = "first_name")
    private String firstName;

    @NotBlank(message = "Last name is mandatory")
    @Column(name = "last_name")
    private String lastName;

    @NotBlank(message = "email should be a valid address")      //change to @Email later
    @Column(name = "email")
    private String email;

    public Learner() {
        //parameterless constructor - Default Constructor
    }

    public Learner(String firstName, String lastName, String email){
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }    
}
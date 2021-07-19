package com.melnik.spring.springboot.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser")
    private String id;

    @Column(name = "email")
    private String email;


    public User() {
    }

    public User(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    public User() {
    }


    @Column(name="name",nullable=false )
    private String name;
    @Column(name="cin",nullable=false )
    private String cin;
    @Column(name="role",nullable=false )
    private Role role;
    // Getters and Setters

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCin() {
        return cin;
    }
    public Role getRole() {
        return role;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCin(String cin) {
        this.cin = cin;
    }
    public void setRole(Role role) {
        this.role = role;
    }

}

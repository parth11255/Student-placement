package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long prnNumber;
    
    @Column
    private String userName;

    // Getters and setters
    public Long getPrnNumber() {
        return prnNumber;
    }

    public void setPrnNumber(Long prnNumber) {
        this.prnNumber = prnNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

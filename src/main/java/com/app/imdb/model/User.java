package com.app.imdb.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table(name = "users")
@Builder
public class User extends BaseEntity{
    private String firstName;
    private String lastName;
    private Long userCode;
    private String email;
    private String phoneNumber;

    public User() {
    }

    public User(String firstName, String lastName, Long userCode, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userCode = userCode;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getUserCode() {
        return userCode;
    }

    public void setUserCode(Long userCode) {
        this.userCode = userCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

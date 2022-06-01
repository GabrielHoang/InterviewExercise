package com.exercise.dto;

import com.exercise.model.Sex;

import java.util.Date;

public class CustomerDto {
    private String firstname;
    private String lastName;
    private Sex sex;
    private Date dateOfBirth;
    private String id; //this is customer entity's external ID

    public CustomerDto(String firstname, String lastName, Sex sex, Date dateOfBirth, String id) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

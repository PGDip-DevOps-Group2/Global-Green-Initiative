package com.group2.GlobalGreenInitiative.entities;

import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long projectId;
    private String firstname;
    private String lastname;
    private String address;
    private String email;
    private String DOB;

    public Customer() {
    }

    public Customer(String firstname, String lastname, String address, String email, String DOB) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.email = email;
        this.DOB = DOB;
    }

    public long getProjectId() {
        return projectId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String email() {
        return email;
    }

    public String getDOB() {
        return DOB;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

}

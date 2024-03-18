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

    private boolean requirementOne;

    private boolean requirementTwo;

    private boolean requirementThree;


    @ManyToOne( cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST},
                fetch = FetchType.LAZY)
    @JoinColumn(name="grant_id")
    private Grant aGrant;

    public Customer() {
    }

    public Customer(String firstname, String lastname, String address, String email, boolean requirementOne, boolean requirementTwo, boolean requirementThree) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.email = email;
        this.requirementOne = requirementOne;
        this.requirementTwo = requirementTwo;
        this.requirementThree = requirementThree;
    }

    public Customer(String firstname, String lastname, String address, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.email = email;


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

    public Grant getaGrant() {
        return aGrant;
    }


    //This is never used and affecting unit test reporting

    /*
    public String email() {
        return email;
    }*/

    public boolean getRequirementOne() {
        return requirementOne;
    }

    public boolean getRequirementTwo() {
        return requirementTwo;
    }

    public boolean getRequirementThree() {
        return requirementThree;
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

    public void setaGrant(Grant aGrant) {
        this.aGrant = aGrant;
    }

    public void setRequirementOne(boolean requirementOne) {
        this.requirementOne = requirementOne;
    }

    public void setRequirementTwo(boolean requirementTwo) {
        this.requirementTwo = requirementTwo;
    }

    public void setRequirementThree(boolean requirementThree) {
        this.requirementThree = requirementThree;
    }
}

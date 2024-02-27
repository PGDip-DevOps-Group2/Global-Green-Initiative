package com.group2.GlobalGreenInitiative.entities;

import jakarta.persistence.*;
import com.group2.GlobalGreenInitiative.entities.Grant;

import java.util.List;

@Entity
public class Grant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long grantId;

    private String optionOne;
    private String optionTwo;

    @OneToMany(mappedBy="aGrant")
    private List<Customer> customer;

    public Grant() {
    }

    public Grant(String optionOne, String optionTwo) {
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
    }

    public long getGrantId() {
        return grantId;
    }

    public String getOptionOne() {
        return optionOne;
    }

    public String getOptionTwo() {
        return optionTwo;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setGrantId(long grantId) {
        this.grantId = grantId;
    }

    public void setOptionOne(String optionOne) {
        this.optionOne = optionOne;
    }

    public void setOptionTwo(String optionTwo) {
        this.optionTwo = optionTwo;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }
}

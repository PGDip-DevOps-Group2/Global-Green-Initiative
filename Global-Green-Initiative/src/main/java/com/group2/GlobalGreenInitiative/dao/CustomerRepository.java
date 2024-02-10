package com.group2.GlobalGreenInitiative.dao;

import com.group2.GlobalGreenInitiative.entities.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    @Override
    public List<Customer> findAll();

}

package com.group2.GlobalGreenInitiative.dao;

import com.group2.GlobalGreenInitiative.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}

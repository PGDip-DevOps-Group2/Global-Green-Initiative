package com.group2.GlobalGreenInitiative.dao;

import com.group2.GlobalGreenInitiative.entities.Grant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GrantRepository extends CrudRepository<Grant, Long> {

    @Override
    public List<Grant> findAll();
}

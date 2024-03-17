package com.group2.GlobalGreenInitiative.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    @Test
    void testGettersAndSetters() {
        // Arrange
        Customer customer = new Customer();

        // Act
        customer.setProjectId(1L);
        customer.setFirstname("John");
        customer.setLastname("Doe");
        customer.setAddress("123 Main St");
        customer.setEmail("john.doe@example.com");

        // Assert
        assertEquals(1L, customer.getProjectId());
        assertEquals("John", customer.getFirstname());
        assertEquals("Doe", customer.getLastname());
        assertEquals("123 Main St", customer.getAddress());
        assertEquals("john.doe@example.com", customer.getEmail());

    }

    @Test
    void testParameterizedConstructor() {
        // Arrange
        Customer customer = new Customer("John", "Doe", "123 Main St", "john.doe@example.com");

        // Assert
        assertEquals("John", customer.getFirstname());
        assertEquals("Doe", customer.getLastname());
        assertEquals("123 Main St", customer.getAddress());
        assertEquals("john.doe@example.com", customer.getEmail());

    }
}

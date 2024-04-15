package com.group2.GlobalGreenInitiative.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class CustomerTest {

    @Mock
    private Grant mockGrant;

    private Customer customer;

    @BeforeEach
    public void setUp() {
        customer = new Customer();
    }

    @Test
    public void testGettersAndSetters() {
        // Test data
        long projectId = 1L;
        String firstname = "John";
        String lastname = "Doe";
        String address = "123 Main St";
        String email = "john.doe@example.com";
        boolean requirementOne = true;
        boolean requirementTwo = false;
        boolean requirementThree = true;

        // Set data using setters
        customer.setProjectId(projectId);
        customer.setFirstname(firstname);
        customer.setLastname(lastname);
        customer.setAddress(address);
        customer.setEmail(email);
        customer.setRequirementOne(requirementOne);
        customer.setRequirementTwo(requirementTwo);
        customer.setRequirementThree(requirementThree);

        // Verify data using getters
        assertEquals(projectId, customer.getProjectId());
        assertEquals(firstname, customer.getFirstname());
        assertEquals(lastname, customer.getLastname());
        assertEquals(address, customer.getAddress());
        assertEquals(email, customer.getEmail());
        assertEquals(requirementOne, customer.getRequirementOne());
        assertEquals(requirementTwo, customer.getRequirementTwo());
        assertEquals(requirementThree, customer.getRequirementThree());
    }

    @Test
    public void testGetAGrant() {
        // Mock Grant
        Grant mockGrant = mock(Grant.class);

        // Set mock Grant
        customer.setaGrant(mockGrant);

        // Verify if the same Grant is returned
        assertEquals(mockGrant, customer.getaGrant());
    }

    @Test
    void testGrantAssociation() {
        MockitoAnnotations.openMocks(this);
        // Create a customer with all requirements
        customer = new Customer("Alice", "Smith", "123 Main St", "alice@email.com", true, true, true);

        customer.setaGrant(mockGrant);
        assertSame(mockGrant, customer.getaGrant());

        // Verify interactions with the Grant mock
        verify(mockGrant, never()).setCustomer(anyList());  // ... or other interactions
    }

    @Test
    void testConstructorWithoutRequirements() {
        Customer customerNoReq = new Customer("Bob", "Jones", "456 Elm St", "bob@email.com");
        assertFalse(customerNoReq.getRequirementOne());
        // ... other assertions
    }



}

package com.group2.GlobalGreenInitiative.entities;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GrantTest {
    @Mock
    private List<Customer> mockCustomers;
    private Grant grant;

    @BeforeEach
    public void setUp() {
        grant = new Grant();
    }

    @Test
    public void testGettersAndSetters() {
        // Test data
        long grantId = 1L;
        String optionOne = "Option One";
        String optionTwo = "Option Two";
        String optionThree = "Option Three";

        // Set data using setters
        grant.setGrantId(grantId);
        grant.setOptionOne(optionOne);
        grant.setOptionTwo(optionTwo);
        grant.setOptionThree(optionThree);

        // Verify data using getters
        assertEquals(grantId, grant.getGrantId());
        assertEquals(optionOne, grant.getOptionOne());
        assertEquals(optionTwo, grant.getOptionTwo());
        assertEquals(optionThree, grant.getOptionThree());
    }

    @Test
    public void testGetCustomer() {
        // Mock Customer list
        List<Customer> mockCustomerList = new ArrayList<>();
        Customer mockCustomer = mock(Customer.class);
        mockCustomerList.add(mockCustomer);

        // Set mock Customer list
        grant.setCustomer(mockCustomerList);

        // Verify if the same Customer list is returned
        assertEquals(mockCustomerList, grant.getCustomer());
    }

    @Test
    void testCustomerAssociation() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
        grant = new Grant();
        grant.setCustomer(mockCustomers);
        assertSame(mockCustomers, grant.getCustomer());

        // Verifying behavior
        verify(mockCustomers, never()).add(any(Customer.class)); // Or other interactions
    }

    @Test
    void testConstructor() {
        MockitoAnnotations.openMocks(this);

        String testOptionOne = "Energy Efficiency";
        String testOptionTwo = "Renewable Resources";
        String testOptionThree = "Conservation";

        grant = new Grant(testOptionOne, testOptionTwo, testOptionThree);

        assertNotNull(grant, "Grant object should not be null");
        assertEquals(testOptionOne, grant.getOptionOne());
        assertEquals(testOptionTwo, grant.getOptionTwo());
        assertEquals(testOptionThree, grant.getOptionThree());
    }
}



package com.group2.GlobalGreenInitiative.controller;

import com.group2.GlobalGreenInitiative.dao.CustomerRepository;
import com.group2.GlobalGreenInitiative.entities.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CustomerControllerTest {

    @InjectMocks
    private CustomerController customerController;

    @Mock
    private CustomerRepository customerRepository;

    @Mock
    private Model model;

    @Test
    void testDisplayCustomerForm() {
        // Act
        String viewName = customerController.displayCustomerForm(model);

        // Assert
        verify(model).addAttribute(eq("customer"), any(Customer.class));
    }

    @Test
    void testCreateCustomer() {
        // Arrange
        Customer customer = new Customer();
        // Act
        String viewName = customerController.createCustomer(customer, model);
        // Assert
        verify(customerRepository).save(customer);
    }
}
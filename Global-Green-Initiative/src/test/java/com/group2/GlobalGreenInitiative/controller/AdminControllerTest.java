package com.group2.GlobalGreenInitiative.controller;

import com.group2.GlobalGreenInitiative.dao.CustomerRepository;
import com.group2.GlobalGreenInitiative.dao.GrantRepository;
import com.group2.GlobalGreenInitiative.entities.Customer;
import com.group2.GlobalGreenInitiative.entities.Grant;
import org.junit.jupiter.api.Test; // Use JUnit 5 or update as needed
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AdminControllerTest {

    @Mock
    private Model model;
    @Mock
    private CustomerRepository customerRepo;

    @Mock
    private GrantRepository grantRepo;

    @InjectMocks
    private AdminController adminController;

    @Test
    void displayAdmin() {
        // Sample data
        List<Customer> customers = Arrays.asList(new Customer(), new Customer());
        List<Grant> grants = Arrays.asList(new Grant(), new Grant());

        // Set up mocks
        when(customerRepo.findAll()).thenReturn(customers);
        when(grantRepo.findAll()).thenReturn(grants);

        // Set up MockMvc for standalone testing
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(adminController).build();

        // Define behavior for getAttribute calls
        when(model.getAttribute("customers")).thenReturn(customers);
        when(model.getAttribute("grant")).thenReturn(grants);

        // Call the controller method
        String result = adminController.displayAdmin(model);


        // Assertions
        assertEquals("admin", result); // Verify the view name
        model.getAttribute("customers").equals(customers);
        model.getAttribute("grant").equals(grants);
    }
}
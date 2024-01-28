package com.group2.GlobalGreenInitiative.controller;

import com.group2.GlobalGreenInitiative.dao.GrantRepository;
import com.group2.GlobalGreenInitiative.entities.Grant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class GrantControllerTest {

    @InjectMocks
    private GrantController grantController;

    @Mock
    private GrantRepository grantRepository;

    @Mock
    private Model model;

    @Test
    void testDisplayGrantOptions() {

        // Act
        String viewName = grantController.displayGrantOptions(model);

        // Assert
        verify(model).addAttribute(eq("grant"), any(Grant.class));
        assertEquals("grant/grant", viewName);
    }

    @Test
    void testSaveGrantOptions() {
        // Arrange
        Grant grant = new Grant();

        // Act
        String viewName = grantController.saveGrantOptions(model, grant);

        // Assert
        verify(grantRepository).save(grant);
        assertEquals("redirect:/customers/new", viewName);
    }
}
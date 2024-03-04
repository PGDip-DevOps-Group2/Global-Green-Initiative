package com.group2.GlobalGreenInitiative.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@ExtendWith(SpringExtension.class)
@WebMvcTest(SubmittedController.class)
public class SubmittedControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void displaySubmitted_ShouldReturnCorrectView() throws Exception {
        mockMvc.perform(get("/submitted/new"))
                .andExpect(status().isOk())
                .andExpect(view().name("submitted/submitted"));
    }
}
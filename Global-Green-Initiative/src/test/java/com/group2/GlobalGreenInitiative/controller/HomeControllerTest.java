package com.group2.GlobalGreenInitiative.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeControllerTest {
    @Test
    public void testDisplayHomepage() {
        HomeController controller = new HomeController();

        String viewName = controller.displayHomepage();

        assertEquals("homepage/homepage", viewName);
    }
}

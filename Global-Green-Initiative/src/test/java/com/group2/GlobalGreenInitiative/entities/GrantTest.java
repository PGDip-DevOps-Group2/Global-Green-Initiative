package com.group2.GlobalGreenInitiative.entities;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrantTest {

    @Test
    void testGettersAndSetters() {
        // Arrange
        Grant grant = new Grant();

        // Act
        grant.setGrantId(1L);
        grant.setOptionOne("Option One");
        grant.setOptionTwo("Option Two");


        // Assert
        assertEquals(1L, grant.getGrantId());
        assertEquals("Option One", grant.getOptionOne());
        assertEquals("Option Two", grant.getOptionTwo());

    }

    @Test
    void testParameterizedConstructor() {
        // Arrange
        Grant grant = new Grant("Option One", "Option Two", "Option Three");

        // Assert
        assertEquals("Option One", grant.getOptionOne());
        assertEquals("Option Two", grant.getOptionTwo());

    }
}

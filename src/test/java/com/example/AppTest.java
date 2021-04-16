package com.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private App app;

    @BeforeEach
    void setup() {
        app = new App();
    }

    @Test
    @DisplayName("name should be 'neil armstrong'")
    public void nameTest() {
        assertEquals("neil armstrong", app.getName());
    }
}

package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTestAAA {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Setup executed");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown executed");
    }

    @Test
    public void testAdd() {
        // Arrange
        int a = 3, b = 7;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(10, result);
    }
}

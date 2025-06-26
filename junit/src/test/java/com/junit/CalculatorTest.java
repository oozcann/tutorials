package com.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testCalculatorAddMethod () {
        Calculator calculator = new Calculator();
        int resultFromCalculator = calculator.add(10, 20);

        assertEquals(30,resultFromCalculator);

    }
}

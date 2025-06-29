package com.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Calculator Operation Tests")
public class CalculatorTest {

    @Test
    @DisplayName("Calculator Add Method Testing")
    public void testCalculatorAddMethod () {
        Calculator calculator = new Calculator();
        int resultFromCalculator = calculator.add(10, 20);

        assertEquals(30,resultFromCalculator);

    }

    @Test
    @DisplayName("Calculator Subtraction Method Testing")
    public void testCalculatorSubtractionMethod () {
        Calculator calculator = new Calculator();
        int resultFromCalculator = calculator.subtract(10, 20);

        assertEquals(-10,resultFromCalculator);

    }

}

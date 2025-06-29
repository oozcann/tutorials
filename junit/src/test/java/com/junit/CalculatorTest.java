package com.junit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;

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
    @Test
    @Disabled("Disabled until solving bug")
    @DisplayName("Calculator Multiply Method Testing")
    public void testCalculatorMultiplyMethod () {
        Calculator calculator = new Calculator();
        int resultFromCalculator = calculator.multiply(10, 20);
        assertEquals(200,resultFromCalculator);
    }
    @Test
    @DisabledIf("com.junit.Calculator#disableTest")
    @DisplayName("Calculator Divide Method Testing")
    public void testCalculatorDivideMethod () {
        Calculator calculator = new Calculator();
        float resultFromCalculator = calculator.divide(20, 10);
        assertEquals(2,resultFromCalculator);
    }

}

package com.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorial() {
        Factorial factorial = new Factorial();

        int result = factorial.factorial(5);
        assertEquals(120,result);
    }
}
package com.junit;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAfterMethodTest {

    /**
     * @TestInstance(Lifecycle.PER_CLASS) bunu class'a eklersen sadece tek bir tane instance oluşur ve testler onun üzerinden yapılır.
     * Default davranışı @TestInstance(Lifecycle.PER_METHOD) şeklinde. Her test methodu için yeni bir instance oluşur.
     * Default davranıştayken @BeforeAll ve @AfterAll kullanman gerekiyorsa bu methodlar statik method olmalı.
     * Ama class'ı @TestInstance(Lifecycle.PER_CLASS) ile işaretlersen methodların statik olmasına gerek yoktur.
     * Per Class daha performanslıdır. Ama ihtiyaca göre per method da kullanılabilir.
     */

    @BeforeEach
    public void beforeEachTest () {
        System.out.println("BeforeEach Test runs!");
    }

    @AfterEach
    public void afterEachTest () {
        System.out.println("AfterEach Test runs!");
    }

    @BeforeAll
    public void beforeAllTest () {
        System.out.println("BeforeAll Test runs!");
    }

    @AfterAll
    public void afterAllTest () {
        System.out.println("AfterAll Test runs!");
    }

    @Test
    public void testFirst () {
        System.out.println("First test method runs!");
    }

    @Test
    public void testSecond () {
        System.out.println("Second test method runs!");
    }

}

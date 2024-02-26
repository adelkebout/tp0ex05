package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void testFactorialForN0() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void testFactorialForNGreaterThan0() {
        assertEquals(1, Factorial.factorial(1));
        assertEquals(2, Factorial.factorial(2));
        assertEquals(6, Factorial.factorial(3));
        assertEquals(24, Factorial.factorial(4));
    }

    @Test
    public void testFactorialForNegativeN() {
        Assertions.assertThrows(IllegalArgumentException.class,() -> Factorial.factorial(-1));
    }


}

package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testSumWithOne() {
        int actual = sumCalculator.sum(1);

        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testSumWithThree() {
        int actual = sumCalculator.sum(3);

        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void testSumWithZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}

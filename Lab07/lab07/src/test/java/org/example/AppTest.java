package org.example;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
@Tag("calculateTest")
public class AppTest 
{
    @Test
    public void whenGetAmountThenReturnAmountOTwoParameters() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.getAmount(2, 3));
    }

    @Test
    public void whenGetDifferenceThenReturnDifferenceOTwoParameters() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.getDifference(2, 3));
    }

    @Test
    public void whenGetProductThenReturnProductOTwoParameters() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.getProduct(2, 3));
    }

    @Test
    public void whenGetQuotientThenReturnQuotientOTwoParameters() {
        Calculator calculator = new Calculator();
        assertEquals(0.6666666666666666, calculator.getQuotient(2, 3));
    }

    @Test
    public void whenGetRemainderThenReturnRemainderOTwoParameters() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.getRemainder(2, 3));
    }
}

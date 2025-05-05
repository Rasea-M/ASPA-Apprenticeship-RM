package main.calculator.test;

import main.calculator.main.IntegerCalculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerCalculatorUnitTest {
    private static final IntegerCalculator calc = new IntegerCalculator();
    @Test
    public void testAddArray() {
        assertEquals(Integer.valueOf(12), calc.sum(1, 3, 6, 2));
    }

    @Test
    public void testAddSingle() {
        assertEquals(Integer.valueOf(1), calc.sum(1));
    }

    @Test
    public void testAddZeroLength() {
        assertEquals(Integer.valueOf(0), calc.sum());
    }

//    @Test
//    //Ask if it's normal to have to add null checks to every single method
//    public void testNull() {
//        assertNull(calc.sum((Integer) null));
//    }

    @Test
    public void testAddNegatives() {
        assertEquals(Integer.valueOf(-1), calc.sum(-1, 0, 2, -2));
    }

    @Test
    public void testSubtractArray() {
        assertEquals(Integer.valueOf(13), calc.subtract(26,10,3,0));
    }

    @Test
    public void testSubtractSingle() {
        assertEquals(Integer.valueOf(3), calc.subtract(3));
    }

    @Test
    public void testSubtractZeroLength() {
        assertEquals(Integer.valueOf(0), calc.subtract());
    }

    @Test
    public void testMultiplyArray() {
        assertEquals(Integer.valueOf(250), calc.multiply(5,5,5,2));
        assertEquals(Integer.valueOf(15054), calc.multiply(2,3,2509));
    }

    @Test
    public void testMultiplySingle() {
        assertEquals(Integer.valueOf(5), calc.multiply(5));
    }

    @Test
    public void testMultiplyZeroLength() {
        assertEquals(Integer.valueOf(0), calc.multiply(0));
    }

    @Test
    public void testDivide() {
        assertEquals(Integer.valueOf(6), calc.divide(6, 1));
        assertEquals(Integer.valueOf(6), calc.divide(12, 2));
        assertEquals(Integer.valueOf(6), calc.divide(13, 2));
    }
}

package main.calculator.test;

import main.calculator.main.IntegerCalculator;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class MockitoIntegerCalculatorUnitTest {

    static IntegerCalculator mockIntCalc;

    @BeforeClass
    public static void setUpClass() {
        mockIntCalc = mock(IntegerCalculator.class);
    }
}

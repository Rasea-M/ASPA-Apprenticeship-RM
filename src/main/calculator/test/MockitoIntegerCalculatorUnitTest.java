package main.calculator.test;

import main.calculator.main.IntegerCalculator;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class MockitoIntegerCalculatorUnitTest {

    @Mock
    private static IntegerCalculator mockIntCalc = mock(IntegerCalculator.class);

    @Test
    public void testAddSingle() {
        when(mockIntCalc.sum(2, 3, 7)).thenReturn(10);
        verify(mockIntCalc).sum(2, 3, 7);
    }
}

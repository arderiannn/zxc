package testproject;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testSum() {
        assertThat(Calculator.sum(2, 2)).isEqualTo(4);
    }

    @Test
    public void testSubtract() {
        assertThat(Calculator.subtract(3,2)).isEqualTo(1);
    }
    
    @Test
    public void testSum() {
        assertThat(Calculator.sum(3, 3)).isEqualTo(6);
    }

    @Test
    public void testSumAndSubtract() {
        int result1 = Calculator.sum(3, 5);
        int result2 = Calculator.subtract(8, 3);
        assertThat(result1 - result2).isEqualTo(6);
    }
}



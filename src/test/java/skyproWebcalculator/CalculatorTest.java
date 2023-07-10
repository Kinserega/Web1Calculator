package skyproWebcalculator;

import Calculator.Interface.Calculator;
import Calculator.skyproWebcalculator.CalculatorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    public void setUp() {
        calculator = new CalculatorImpl();
    }
    @Test
    public void operation() {
        assertEquals("1 + 2 = 3", calculator.plus(1,2));
        assertEquals("4 + 1 = 5", calculator.plus(4,1));

        assertEquals("5 - 2 = 3", calculator.minus(5,2));
        assertEquals("4 - 1 = 3", calculator.minus(4,1));

        assertEquals("1 * 3 = 3", calculator.multi(1,3));
        assertEquals("2 * 2 = 4", calculator.multi(2,2));

        assertEquals("3 / 1 = 3", calculator.delenie(3,1));
        assertEquals("6 / 2 = 3", calculator.delenie(6,2));
    }

    @Test
    public void checkNull() {
        Throwable exception = assertThrows(NullPointerException.class, () -> calculator.plus(null, 2));
        assertEquals("Введите корректно числа", exception.getMessage());
        Throwable exception1 = assertThrows(NullPointerException.class, () -> calculator.plus(1, null));
        assertEquals("Введите корректно числа", exception1.getMessage());
        Throwable exception2 = assertThrows(NullPointerException.class, () -> calculator.plus(null, null));
        assertEquals("Введите корректно числа", exception2.getMessage());

    }

    @Test
    void DelenieNaZero() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> calculator.delenie(2, 0));
        assertEquals("На ноль делить нельзя", exception.getMessage());
    }
}


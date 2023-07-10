package skyproWebcalculator;

import Calculator.Interface.Calculator;
import Calculator.skyproWebcalculator.CalculatorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class ParametrTest {
    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new CalculatorImpl();
    }
    public static Stream<Arguments> ParametersForTestPlus(){
        return Stream.of(
                Arguments.of("1 + 6 = 7", 1, 6),
                Arguments.of("10 + -9 = 1", 10, -9)
        );
    }
    @ParameterizedTest
    @MethodSource("ParametersForTestPlus")
    void plus(String expected, Integer num1, Integer num2) {
        String actual = calculator.plus(num1, num2);
        assertEquals(actual, expected);
    }
    public static Stream<Arguments> ParametersForTestMinus(){
        return Stream.of(
                Arguments.of("6 - 5 = 1", 1, 6),
                Arguments.of("10 - -9 = 19", 10, -9)
        );
    }
    @ParameterizedTest
    @MethodSource("ParametersForTestMinus")
    void minus(String expected, Integer num1, Integer num2) {
        String actual = calculator.minus(num1, num2);
        assertEquals(actual, expected);
    }
    public static Stream<Arguments> ParametersForTestDelenie(){
        return Stream.of(
                Arguments.of("6 / 6 = 1", 6, 6),
                Arguments.of("10 / 5 = 2", 10, 5)
        );
    }
    @ParameterizedTest
    @MethodSource("ParametersForTestDelenie")
    void Delenie(String expected, Integer num1, Integer num2) {
        String actual = calculator.delenie(num1, num2);
        assertEquals(actual, expected);
    }
    public static Stream<Arguments> ParametersForTestMulti(){
        return Stream.of(
                Arguments.of("6 * 6 = 36", 6, 6),
                Arguments.of("10 * 5 = 50", 10, 5)
        );
    }
    @ParameterizedTest
    @MethodSource("ParametersForTestMulti")
    void Multi(String expected, Integer num1, Integer num2) {
        String actual = calculator.multi(num1, num2);
        assertEquals(actual, expected);
    }
}

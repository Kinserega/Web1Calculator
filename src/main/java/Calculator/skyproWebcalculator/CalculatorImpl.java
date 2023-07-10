package Calculator.skyproWebcalculator;

import Calculator.Interface.Calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements Calculator {

    public String helloCalculator() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Введите корректно числа");

        }else return num1 + " + " + num2 +" = " + (num1+num2);
    }
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Введите корректно числа");

        } else return num1 + " - " + num2 + " = " + (num1 - num2);
    }
    public String multi(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Введите корректно числа");

        }else return num1 + " * " + num2 +" = " + (num1*num2);
    }
    public String delenie(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Введите корректно числа");
        } else if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя");
        } else return num1 + " / " + num2 +" = " + (num1/num2);
    }
}
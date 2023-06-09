package skyproWebcalculator;

import Interface.Calculator;
import org.springframework.stereotype.Service;

@Service
public abstract class CalculatorImpl implements Calculator {
    public String HelloCalculator() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    public String plus(String num1, String num2) {
        if (num1 == "" || num2 == "") {
            throw new NullPointerException("Введите корректно числа");

        }else return num1 + " + " + num2 +" = " + (Integer.parseInt(num1)+Integer.parseInt(num2));
    }
    public String minus(String num1, String num2) {
        if (num1 == "" || num2 == "") {
            throw new NullPointerException("Введите корректно числа");

        } else return num1 + " - " + num2 + " = " + (Integer.parseInt(num1) - Integer.parseInt(num2));
    }
    public String multi(String num1, String num2) {
        if (num1 == "" || num2 == "") {
            throw new NullPointerException("Введите корректно числа");

        }else return num1 + " + " + num2 +" = " + (Integer.parseInt(num1)*Integer.parseInt(num2));
    }
    public String delenie(String num1, String num2) {
        if (num1 == "" || num2 == "") {
            throw new NullPointerException("Введите корректно числа");
        } else if (Integer.parseInt(num2) == 0) {
            throw new NullPointerException("На ноль делить нельзя");
        } else return num1 + " / " + num2 +" = " + (Integer.parseInt(num1)/Integer.parseInt(num2));
    }
}
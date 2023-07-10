package Calculator.skyproWebcalculator;
import Calculator.Interface.Calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final Calculator helloCalculator;

    public CalculatorController(Calculator helloCalculator) {
        this.helloCalculator = helloCalculator;
    }

    @GetMapping
    public String helloCalculatorUser() {
        return helloCalculator.helloCalculator();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return helloCalculator.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return helloCalculator.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multi(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return helloCalculator.multi(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String delenie(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return helloCalculator.delenie(num1, num2);
    }
}


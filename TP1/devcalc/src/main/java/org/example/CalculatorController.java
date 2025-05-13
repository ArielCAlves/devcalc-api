package org.example;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService = new CalculatorService();

    @GetMapping("/add")
    public String add(@RequestParam(name = "a") String a, @RequestParam(name = "b") String b) {
        try {
            return calculatorService.add(a, b).stripTrailingZeros().toPlainString();
        } catch (Exception e) {
            return "Erro";
        }
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam(name = "a") String a, @RequestParam(name = "b") String b) {
        try {
            return calculatorService.subtract(a, b).stripTrailingZeros().toPlainString();
        } catch (Exception e) {
            return "Erro";
        }
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(name = "a") String a, @RequestParam(name = "b") String b) {
        try {
            return calculatorService.multiply(a, b).stripTrailingZeros().toPlainString();
        } catch (Exception e) {
            return "Erro";
        }
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(name = "a") String a, @RequestParam(name = "b") String b) {
        try {
            return calculatorService.divide(a, b).stripTrailingZeros().toPlainString();
        } catch (ArithmeticException e) {
            return "Erro: divisão por zero.";
        } catch (Exception e) {
            return "Erro";
        }
    }
}

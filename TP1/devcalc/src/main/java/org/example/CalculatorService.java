package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculatorService {

    public BigDecimal add(String a, String b) {
        return new BigDecimal(a).add(new BigDecimal(b));
    }

    public BigDecimal subtract(String a, String b) {
        return new BigDecimal(a).subtract(new BigDecimal(b));
    }

    public BigDecimal multiply(String a, String b) {
        return new BigDecimal(a).multiply(new BigDecimal(b));
    }

    public BigDecimal divide(String a, String b) {
        BigDecimal divisor = new BigDecimal(b);
        if (divisor.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return new BigDecimal(a).divide(divisor, 10, RoundingMode.HALF_UP);
    }
}

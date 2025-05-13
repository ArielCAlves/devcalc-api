package org.example;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test
    void testAdd() {
        BigDecimal result = service.add("10", "5");
        assertEquals(0, result.compareTo(new BigDecimal("15")));
    }

    @Test
    void testSubtract() {
        BigDecimal result = service.subtract("10", "5");
        assertEquals(0, result.compareTo(new BigDecimal("5")));
    }

    @Test
    void testMultiply() {
        BigDecimal result = service.multiply("10", "5");
        assertEquals(0, result.compareTo(new BigDecimal("50")));
    }

    @Test
    void testDivide() {
        BigDecimal result = service.divide("10", "5");
        assertEquals(0, result.compareTo(new BigDecimal("2")));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> service.divide("10", "0"));
    }
}

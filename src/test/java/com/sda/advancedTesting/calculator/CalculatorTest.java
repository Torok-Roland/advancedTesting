package com.sda.advancedTesting.calculator;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

import com.sda.advancedTesting.calculator.exceptions.TruncatedResultException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

//recunoaste ca este o clasa pentru testare
@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
    @Test
    void sumTest() {
        // given
        double a = 20;
        double b = 32;
        Calculator calc = new Calculator();

        //when
        double result = calc.sum(a, b);

        //then
        assertEquals(52, result);
    }

    @Test
    void subtractTest() {
        // given
        double a = 50;
        double b = 18;
        Calculator calc = new Calculator();

        //when
        double result = calc.subtract(a, b);

        //then
        assertEquals(32, result);
    }

    @Test
    void multiplyTest() {
        // given
        double a = 5;
        double b = 8;
        Calculator calc = new Calculator();

        //when
        double result = calc.multiply(a, b);
        //then

    }

    @Test
    void divideTest() {
        // given
        double a = 27;
        double b = 3;
        Calculator calc = new Calculator();

        //when
        double result = calc.divide(a, b);
        //then
        assertEquals(9, result);
    }
    @Test
    void moduloTest() {
        // given
        int a = 9;
        int b = 2;
        Calculator calc = new Calculator();

        //when
        double result = calc.modulo(a, b);
        //then
        assertEquals(1, result);
    }

    void multiplyThrowsTruncatedResultException() {
        // given
        double a = 1000;
        double b = Double.MAX_VALUE/(a-1);


        Calculator calculator = new Calculator();

        //  then when
        assertThatExceptionOfType(TruncatedResultException.class)
                .isThrownBy(
                        // lambda (paramtrii) -> {cod}
                        () -> calculator.multiply(a,b)
                );
    }

    @Test
    void divideIllegalArgumentException(){
        //given
        double a = 10;
        double b = 0;
        Calculator calculator = new Calculator();

        //when
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
                () -> calculator.divide(a,b)
        ).withMessage("Division by 0 is not supported!");

    }
}

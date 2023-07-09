package com.sda.advancedTesting.calculator;

import static org.junit.jupiter.api.Assertions.*;

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
        double result = calc.sum(a,b);

        //then
        assertEquals(52,result);

    }
}

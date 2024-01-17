package ru.neoflex.practice.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcControllerTest {
    private CalcController calculator;
    @BeforeEach
    void setUp() { //Создание калькулятора перед каждым тестом
        calculator = new CalcController();
    }

    @Test //Тест суммы калькулятора
    void plus() {
        int sum = calculator.plus(1,2);
        Assertions.assertEquals(3, sum);

    }

    @Test //Тест разности калькулятора
    void minus() {
        int dif = calculator.minus(2,1);
        Assertions.assertEquals(1, dif);
    }
}
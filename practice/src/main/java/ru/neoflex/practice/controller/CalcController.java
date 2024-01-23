package ru.neoflex.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.neoflex.practice.entity.Calculation;
import ru.neoflex.practice.repository.CalculationRepository;

import java.util.List;

@RestController
public class CalcController {
    private CalculationRepository calculationRepository;
    private Calculation calculation;
    private int result;

    //Метод суммы
    @GetMapping("/plus/{a}/{b}")
    public int plus(@PathVariable("a") int a, @PathVariable("b") int b) {
        result = a + b;
        calculation = new Calculation(result);
        calculationRepository.save(calculation);
        return result;
    }
    //Метод разности
    @GetMapping("/minus/{a}/{b}")
    public int minus(@PathVariable("a") int a, @PathVariable("b") int b) {
        result = a - b;
        calculation = new Calculation(result);
        calculationRepository.save(calculation);
        return result;
    }

    @GetMapping("/calculations")
    public List <Calculation> getAllCalculations(){
        return calculationRepository.findAll();
    }

}
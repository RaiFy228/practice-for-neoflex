package ru.neoflex.practice.controller;

import org.springframework.web.bind.annotation.*;
import ru.neoflex.practice.entity.Calculation;
import ru.neoflex.practice.repository.CalculationRepository;

import java.util.List;

@RestController
public class CalcController {
    private final CalculationRepository calculationRepository;
    //Внедрение репозитория в CalcController
    public CalcController(CalculationRepository calculationRepository) {
        this.calculationRepository = calculationRepository;
    }

    // Метод суммы
    @GetMapping("/plus/{a}/{b}")
    public int plus(@PathVariable("a") int a, @PathVariable("b") int b) {
        int result = a + b;
        calculationRepository.save(new Calculation(result));
        return result;
    }
    // Метод разности
    @GetMapping("/minus/{a}/{b}")
    public int minus(@PathVariable("a") int a, @PathVariable("b") int b) {
        int result = a - b;
        calculationRepository.save(new Calculation(result));
        return result;
    }

    @GetMapping("/calculations")
    public List <Calculation> getAllCalculations(){
        return calculationRepository.findAll();
    }
}
package ru.neoflex.practice.entity;

import jakarta.persistence.*;
import lombok.Getter;
@Getter
@Entity
@Table(name = "Calculations")
public class Calculation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private int result;
    public Calculation(int result) {
        this.result = result;
    }
    public Calculation() {

    }
}
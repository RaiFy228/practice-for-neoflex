package ru.neoflex.practice.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Calculations")
public class Calculation {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    @Setter
    private int result;
    public Calculation() {

    }
    public Calculation(int result) {
        this.result = result;
    }
    @Column(name = "result", nullable = false)
    public int getResult(){
        return result;
    }
}

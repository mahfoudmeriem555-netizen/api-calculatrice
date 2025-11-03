package com.example.calculatrice.service;

import com.example.calculatrice.entites.Nombres;
import org.springframework.stereotype.Service;

@Service
public class CalculService {
    // méthode qui fait la somme
    public double additionner(Nombres nombres) {
        return nombres.getA() + nombres.getB();
    }
}


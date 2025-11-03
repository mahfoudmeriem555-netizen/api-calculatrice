package com.example.calculatrice.entites;

public class Nombres {
    private double a;
    private double b;

    // Constructeur vide (obligatoire pour Spring)
    public Nombres() {}

    // Constructeur avec paramètres
    public Nombres(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Getters et Setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}


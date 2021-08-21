package com.example.Calculadora.DTO;

public class Multiplication {
    private double a, b;

    public Multiplication() { super(); }

    public Multiplication(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() { return a; }

    public void setA(double a) { this.a = a; }

    public double getB() { return b; }

    public void setB(double b) { this.b = b; }
}

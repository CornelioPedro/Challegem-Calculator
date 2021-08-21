package com.example.Calculadora.DTO;

public class Subtraction {
    private double a, b;



    public Subtraction() { super();}

    public Subtraction(double a, double b) {
        super();
        this.a = a;
        this.b = b;
    }

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

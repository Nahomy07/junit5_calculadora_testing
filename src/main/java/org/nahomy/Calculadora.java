package org.nahomy;

public class Calculadora {

    private double valorA;
    private double valorB;

    public Calculadora(double valorA, double valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public Calculadora() {}

    public double getValorA() {
        return valorA;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    public double sumar(){return valorA + valorB;}
    public double restar(){return valorA - valorB;}
    public double multiplicar(){return valorA * valorB;}
    //public double dividir(){return  valorA / valorB;}
    public double dividir(double valorA, double valorB){
        if (valorB != 0) {
            return valorA / valorB;
        }
        else {
            throw new ArithmeticException("No se puede dividir por cero");
        }
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "valorA=" + valorA +
                ", valorB=" + valorB +
                '}';
    }
}

package org.nahomy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() {
        Calculadora calculadora = new Calculadora();
        double sumaActual = calculadora.restar(20.0,4.0);
        double respuestaEsperada = 24.0;
        assertEquals(respuestaEsperada,sumaActual);
    }

    @Test
    void restar() {
        Calculadora calculadora = new Calculadora();
        double restaActual = calculadora.restar(20.0,4.0);
        double respuestaEsperada = 16.0;
        assertEquals(respuestaEsperada,restaActual);
    }

    @Test
    void multiplicar() {
        Calculadora calculadora = new Calculadora();
        double multiplicacionActual = calculadora.multiplicar(20.0,4.0);
        double respuestaEsperada = 80.0;
        assertEquals(respuestaEsperada, multiplicacionActual);
    }

    @Test
    void dividir() {
        Calculadora calculadora = new Calculadora();
        double divisionActual = calculadora.dividir(20.0, 4.0);
        double respuestaEsperada = 5.0;
        assertEquals(respuestaEsperada, divisionActual);
    }


}

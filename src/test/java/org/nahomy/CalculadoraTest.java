package org.nahomy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() {
    }

    @Test
    void restar() {
    }

    @Test
    void multiplicar() {
    }

    @Test
    void dividir() {
        Calculadora calculadora = new Calculadora();
        double divisionActual = calculadora.dividir(20.0, 4.0);
        double respuestaEsperada = 5.0;
        assertEquals(respuestaEsperada, divisionActual);
    }
}
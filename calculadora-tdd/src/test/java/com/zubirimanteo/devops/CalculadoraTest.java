package com.zubirimanteo.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    void sumaTest() {
        // 1. Preparación (Arrange)
        Calculadora calc = new Calculadora();
        // 2. Ejecución (Act)
        int resultado = calc.suma(2, 3);
        // 3. Verificación (Assert)
        assertEquals(4, resultado, "La suma 2 + 3 debería ser 5");
    }
    @Test 
    void restaTest(){
        Calculadora calc = new Calculadora();
        int resul = calc.resta(10,4);
        assertEquals(6, resul);
    }
    @Test 
    void multipilicacionTest(){
        Calculadora calc = new Calculadora();
        int resultado = calc.multipilicacion(5,5);
        assertEquals(25, resultado);
    }
}
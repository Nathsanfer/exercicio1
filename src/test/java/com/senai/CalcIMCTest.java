package com.senai;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcIMCTest {
    
    @Test
    public void testarIMC () {
        CalcIMC calc = new CalcIMC();
        double resultado = calc.calcularIMC(77.85, 1.8);
        assertEquals(24.02, resultado, 0.01);
    }

}

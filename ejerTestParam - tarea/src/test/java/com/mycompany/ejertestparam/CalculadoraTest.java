/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejertestparam;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

/**
 *
 * @author CHELO
 */
@RunWith(Parameterized.class)

public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {2, 4}, {1, 0}, {5, 1}
        });
    }

    @Parameter(0)
    public int a;
    @Parameter(1)
    public int b;
    Calculadora cal = new Calculadora();

    @Test
    public void testSuma() {
        int esperado = a + b;
        assertEquals(esperado, cal.suma(a, b));
    }

    @Test
    public void testResta() {
        int esperado = a - b;
        assertEquals(esperado, cal.resta(a, b));
    }

    @Test
    public void testMultimplicacion() {
        int esperado = a * b;
        assertEquals(esperado, cal.multimplicacion(a, b));
    }

    @Test
    public void testDivision() {
        try{
            int resultado = a/b;
            assertEquals(resultado, cal.division(a, b));
        }catch(Exception e){
            System.out.println(e.getMessage());
            assertEquals("No se puede dividir entre 0",e.getMessage());
        }
    }

   
}

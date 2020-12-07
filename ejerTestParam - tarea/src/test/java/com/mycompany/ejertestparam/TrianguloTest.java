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

public class TrianguloTest {
    
    public TrianguloTest() {
    }
    
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {1,1,1},{1,2,1},{1,2,3}
        });
    } 
    @Parameter(0)
    public int lado1;
    @Parameter(1)
    public int lado2;
    @Parameter(2)
    public int lado3;
    Triangulo triangulo = new Triangulo();
    
    @Test
    public void testTipoTriangulo() {
        String esp1="Equilatero";
        String esp2="Isoceles";
        String esp3="Escaleno";
        
        if(lado1 == lado2 && lado2 == lado3){
            assertEquals(esp1, triangulo.tipoTriangulo(lado1, lado2, lado3));
        }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            assertEquals(esp2, triangulo.tipoTriangulo(lado1, lado2, lado3));
        }else if(lado1 != lado2 || lado1 != lado3 || lado2 != lado3){
            assertEquals(esp3, triangulo.tipoTriangulo(lado1, lado2, lado3));
        }
        
        
        
        
    }
    
}

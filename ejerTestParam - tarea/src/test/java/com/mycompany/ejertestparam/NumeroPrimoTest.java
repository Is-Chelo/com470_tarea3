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
public class NumeroPrimoTest {
    
    public NumeroPrimoTest() {
    }
    
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {20, false},{2, true},{13, true}
        });
    } 
    
    @Parameter(0)
    public int valor1;
    @Parameter(1)
    public boolean valor2;
    
    NumeroPrimo primo = new NumeroPrimo();
    
    @Test
    public void testValidate() {
        
        boolean resultado = primo.validate(valor1);    
        assertEquals(valor2, resultado);     
        
    }
    
}

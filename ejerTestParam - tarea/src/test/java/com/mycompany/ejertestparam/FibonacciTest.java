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
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author CHELO
 */
@RunWith(Parameterized.class)
public class FibonacciTest {
    
    public FibonacciTest() {
    }
    
    @Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {1},{3},{5}
        });
    }
    
    @Parameter(0)
    public int v1;
    
    
    Fibonacci fibo = new Fibonacci();

    @Test
    public void testBibonacci() {
        String esp1 = "0,1,1";
        String esp2 = "0,1,1,2,3";
        String esp3 = "0,1,1,2,3,5";
        String resultado = fibo.bibonacci(v1);
        
        if(v1==1){
            assertEquals(esp1, resultado);
        }
        if(v1==3){
            assertEquals(esp2, resultado);
        }
        if(v1==5){
            assertEquals(esp3, resultado);
        }
        

    }
    
}

package com.guilhermeeiti;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Testes unitarios para a classe Planilha
 */
public class PlanilhaTest 
    extends TestCase
{
    public void testDeveRetornarFosforoIdealIgualA9() {
        Planilha planilha = new Planilha();
        planilha.setTexturaSolo(1);
        double resultadoEsperado = 9.0;
        
        double resultado = planilha.getFosforoIdeal();
        
        assertEquals(resultadoEsperado, resultado, 0);
    }
    
    public void testDeveRetornarFosforoIdealIgualA12() {
        Planilha planilha = new Planilha();
        planilha.setTexturaSolo(2);
        double resultadoEsperado = 12.0;
        
        double resultado = planilha.getFosforoIdeal();
        
        assertEquals(resultadoEsperado, resultado, 0);
    }
    
    public void testDeveRetornarPotassioIdealIgualA035() {
        Planilha planilha = new Planilha();
        planilha.setTexturaSolo(1);
        double resultadoEsperado = 0.35;
        
        double resultado = planilha.getPotassioIdeal();
        
        assertEquals(resultadoEsperado, resultado, 0);
    }
     
      public void testDeveRetornarPotassioIdealIgualA025() {
        Planilha planilha = new Planilha();
        planilha.setTexturaSolo(2);
        double resultadoEsperado = 0.25;
        
        double resultado = planilha.getPotassioIdeal();
        
        assertEquals(resultadoEsperado, resultado, 0);
    }

}

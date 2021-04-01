/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilhermeeiti;

import junit.framework.TestCase;

/**
 *
 * @author eiti
 */
public class CorrecaoFosforoTest 
    extends TestCase 
{
    public void testNecessidadeAdicionar() {
        Planilha planilha = new Planilha(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
        CorrecaoFosforo correcaoFosforo = new CorrecaoFosforo(planilha, FonteFosforo.SUPERFOSFATO_SIMPLES, 10, 70, 1260.00);
        
        assertEquals(1.4100000000000001, correcaoFosforo.getNecessidadeAdicionar(), 0);
    }
    
    public void testQuantidadeAplicar() {
        Planilha planilha = new Planilha(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
        CorrecaoFosforo correcaoFosforo = new CorrecaoFosforo(planilha, FonteFosforo.SUPERFOSFATO_SIMPLES, 10, 70, 1260.00);
        
        assertEquals(51.25238095238096, correcaoFosforo.getQuantidadeAplicar(), 0);
    }
    
    public void testCustoHectar() {
        Planilha planilha = new Planilha(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
        CorrecaoFosforo correcaoFosforo = new CorrecaoFosforo(planilha, FonteFosforo.SUPERFOSFATO_SIMPLES, 10, 70, 1260.00);
        
        assertEquals(64.578, correcaoFosforo.getCustoHectar(), 0);
    }
    
    public void testItemCorrecaoFosforo() {
        Planilha planilha = new Planilha(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
        CorrecaoFosforo correcaoFosforo = new CorrecaoFosforo(planilha, FonteFosforo.SUPERFOSFATO_SIMPLES, 10, 70, 1260.00);
       
        assertEquals(5.125238095238096, correcaoFosforo.getItemCorrecaoFosforo().getValor(), 0);
        assertEquals("Enxofre", correcaoFosforo.getItemCorrecaoFosforo().getNome());
    }
    
    public void testItemCorrecaoFosforo2() {
        Planilha planilha = new Planilha(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
        CorrecaoFosforo correcaoFosforo = new CorrecaoFosforo(planilha, FonteFosforo.SUPERFOSFATO_SIMPLES, 10, 70, 1260.00);
       
        assertEquals(14.35066666666667, correcaoFosforo.getItemCorrecaoFosforo2().getValor(), 0);
        assertEquals("Calcio", correcaoFosforo.getItemCorrecaoFosforo2().getNome());
    }
}
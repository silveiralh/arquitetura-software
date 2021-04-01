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
public class CorrecaoPotassioTest 
    extends TestCase 
{
    public void testNecessidadeAdicionar() {
        Planilha planilha = new Planilha(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(planilha, FontePotassio.CLORETO_DE_POTASSIO, 2.8, 1000.00);
        
        assertEquals(0.21092000000000002, correcaoPotassio.getNecessidadeAdicionar(), 0);
    }
    
    public void testQuantidadeAplicar() {
        Planilha planilha = new Planilha(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(planilha, FontePotassio.CLORETO_DE_POTASSIO, 2.8, 1000.00);
        
        assertEquals(401.4753103448276, correcaoPotassio.getQuantidadeAplicar(), 0);
    }
    
    public void testCustoHectar() {
        Planilha planilha = new Planilha(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(planilha, FontePotassio.CLORETO_DE_POTASSIO, 2.8, 1000.00);
        
        assertEquals(401.47531034482756, correcaoPotassio.getCustoHectar(), 0);
    }
    
    public void testItemCorrecaoFosforo() {
        Planilha planilha = new Planilha(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(planilha, FontePotassio.SULFATO_DE_POTASSIO, 2.8, 1000.00);
       
        assertEquals(76.1258953846154, correcaoPotassio.getItemCorrecaoPotassio().getValor(), 0);
        assertEquals("Enxofre", correcaoPotassio.getItemCorrecaoPotassio().getNome());
    }
    
    public void testItemCorrecaoFosforo2() {
        Planilha planilha = new Planilha(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(planilha, FontePotassio.SULFATO_DE_POTASSIO_E_MAGNESIO, 2.8, 1000.00);
       
        assertEquals(190.51828363636366, correcaoPotassio.getItemCorrecaoPotassio2().getValor(), 0);
        assertEquals("Magnesio", correcaoPotassio.getItemCorrecaoPotassio2().getNome());
    }
}
package com.guilhermeeiti;

import junit.framework.TestCase;

/**
 * Testes unitarios para a classe Solo
 */
public class SoloTest 
    extends TestCase
{
    // Teste realizado com base nos valores do exemplo de solo preenchida numero 3
    public void testValoresIdeaisArgiloso() {
        Solo solo = new Solo(TexturaSolo.ARGILOSO, 10.23, 0.82, 12.45, 3.47, 1.10, 0.00, 5.15, 30.7);
        
        assertEquals(9.0, solo.getFosforoIdeal(), 0);
        assertEquals(0.35, solo.getPotassioIdeal(), 0);
        assertEquals(6.0, solo.getCalcioIdeal(), 0);
        assertEquals(1.5, solo.getMagnesioIdeal(), 0);
        assertEquals(9.0, solo.getEnxofreIdeal(), 0);
        assertEquals(0.0, solo.getAluminioIdeal(), 0);
    }
    
    public void testValoresIdeaisTexturaMedia() {
        Solo solo = new Solo(TexturaSolo.TEXTURA_MEDIA, 10.23, 0.82, 12.45, 3.47, 1.10, 0.00, 5.15, 30.7);
        
        assertEquals(12.0, solo.getFosforoIdeal(), 0);
        assertEquals(0.25, solo.getPotassioIdeal(), 0);
        assertEquals(4.0, solo.getCalcioIdeal(), 0);
        assertEquals(1.0, solo.getMagnesioIdeal(), 0);
        assertEquals(6.0, solo.getEnxofreIdeal(), 0);
        assertEquals(0.0, solo.getAluminioIdeal(), 0);
    }
    
    public void testSomaBase() {
        Solo solo = new Solo(TexturaSolo.TEXTURA_MEDIA, 10.23, 0.82, 12.45, 3.47, 1.10, 0.00, 5.15, 30.7);
        
        assertEquals(16.74, solo.getSomaBase(), 0);
    }
    
    public void testCTCTotal() {
        Solo solo = new Solo(TexturaSolo.TEXTURA_MEDIA, 10.23, 0.82, 12.45, 3.47, 1.10, 0.00, 5.15, 30.7);
        
        assertEquals(21.89, solo.getCTCTotal(), 0);
    }
    
    public void testSaturacaoPorBases() {
        Solo solo = new Solo(TexturaSolo.TEXTURA_MEDIA, 10.23, 0.82, 12.45, 3.47, 1.10, 0.00, 5.15, 30.7);
        
        assertEquals(76.47327546825034, solo.getSaturacaoPorBases(), 0);
    }
    
    public void testMOPercentual() {
        Solo solo = new Solo(TexturaSolo.TEXTURA_MEDIA, 10.23, 0.82, 12.45, 3.47, 1.10, 0.00, 5.15, 30.7);
        
        assertEquals(3.07, solo.getMOPercentual(), 0);
    }
    
     public void testCarbono() {
        Solo solo = new Solo(TexturaSolo.TEXTURA_MEDIA, 10.23, 0.82, 12.45, 3.47, 1.10, 0.00, 5.15, 30.7);
        
        assertEquals(17.848837209302324, solo.getCarbono(), 0);
    }
}

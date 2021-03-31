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
    // Teste realizado com base nos valores do exemplo de planilha preenchida numero 3
    public void testValoresIdeaisArgiloso() {
        Planilha planilha = new Planilha(TexturaSolo.ARGILOSO, 10.23, 0.82, 12.45, 3.47, 1.10, 0.00, 5.15);
        
        assertEquals(9.0, planilha.getFosforoIdeal(), 0);
        assertEquals(0.35, planilha.getPotassioIdeal(), 0);
        assertEquals(6.0, planilha.getCalcioIdeal(), 0);
        assertEquals(1.5, planilha.getMagnesioIdeal(), 0);
        assertEquals(9.0, planilha.getEnxofreIdeal(), 0);
        assertEquals(0.0, planilha.getAluminioIdeal(), 0);
    }
    
    public void testValoresIdeaisTexturaMedia() {
        Planilha planilha = new Planilha(TexturaSolo.TEXTURA_MEDIA, 10.23, 0.82, 12.45, 3.47, 1.10, 0.00, 5.15);
        
        assertEquals(12.0, planilha.getFosforoIdeal(), 0);
        assertEquals(0.25, planilha.getPotassioIdeal(), 0);
        assertEquals(4.0, planilha.getCalcioIdeal(), 0);
        assertEquals(1.0, planilha.getMagnesioIdeal(), 0);
        assertEquals(6.0, planilha.getEnxofreIdeal(), 0);
        assertEquals(0.0, planilha.getAluminioIdeal(), 0);
    }
    
    public void testSomaBase() {
        Planilha planilha = new Planilha(TexturaSolo.TEXTURA_MEDIA, 10.23, 0.82, 12.45, 3.47, 1.10, 0.00, 5.15);
        
        assertEquals(16.74, planilha.getSomaBase(), 0);
    }
}

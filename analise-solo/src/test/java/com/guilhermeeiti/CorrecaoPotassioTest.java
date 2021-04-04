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
        extends TestCase {

    public void testNecessidadeAdicionar() {
        Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(solo, FontePotassio.CLORETO_DE_POTASSIO, 2.8, 1000.00);

        assertEquals(0.21092000000000002, correcaoPotassio.getNecessidadeAdicionar(), 0);
    }

    public void testQuantidadeAplicar() {
        Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(solo, FontePotassio.CLORETO_DE_POTASSIO, 2.8, 1000.00);

        assertEquals(401.4753103448276, correcaoPotassio.getQuantidadeAplicar(), 0);
    }

    public void testCustoHectar() {
        Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(solo, FontePotassio.CLORETO_DE_POTASSIO, 2.8, 1000.00);

        assertEquals(401.47531034482756, correcaoPotassio.getCustoHectar(), 0);
    }

    public void testItemCorrecaoFosforo() {
        Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(solo, FontePotassio.SULFATO_DE_POTASSIO, 2.8, 1000.00);

        assertEquals(76.1258953846154, correcaoPotassio.getItemCorrecaoPotassio().getValor(), 0);
        assertEquals("Enxofre", correcaoPotassio.getItemCorrecaoPotassio().getNome());
    }

    public void testItemCorrecaoFosforo2() {
        Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(solo, FontePotassio.SULFATO_DE_POTASSIO_E_MAGNESIO, 2.8, 1000.00);

        assertEquals(190.51828363636366, correcaoPotassio.getItemCorrecaoPotassio2().getValor(), 0);
        assertEquals("Magnesio", correcaoPotassio.getItemCorrecaoPotassio2().getNome());
    }
}

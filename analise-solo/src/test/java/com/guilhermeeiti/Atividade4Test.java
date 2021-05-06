package com.guilhermeeiti;

import com.guilhermeeiti.classes.CorrecaoFosforo;
import com.guilhermeeiti.classes.CorrecaoPotassio;
import com.guilhermeeiti.classes.Solo;
import com.guilhermeeiti.enums.FonteFosforo;
import com.guilhermeeiti.enums.FontePotassio;
import com.guilhermeeiti.enums.TexturaSolo;
import junit.framework.TestCase;

public class Atividade4Test extends TestCase {
	Solo solo =  new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
	CorrecaoFosforo correcaoFosforo = new CorrecaoFosforo(solo, FonteFosforo.SUPERFOSFATO_SIMPLES, 12, 70, 1260.00);
	CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(solo, FontePotassio.CLORETO_DE_POTASSIO, 3, 2500.00);
	
	@org.junit.Test
	public void testTeoresDoSolo() {
		
		//Assertions dos valores de fosforo, potassio, calcio, magnesio, enxofre e aluminio ideiais
		assertEquals(9.0, solo.getFosforoIdeal(), 0);
		assertEquals(0.35, solo.getPotassioIdeal(), 0);
		assertEquals(6.0, solo.getCalcioIdeal(), 0);
		assertEquals(1.5, solo.getMagnesioIdeal(), 0);
		assertEquals(9.0, solo.getEnxofreIdeal(), 0);
		assertEquals(0.0, solo.getAluminioIdeal(), 0);
		
		//Assertions dos campos Scmol, CTCmol, VAtual, TeorMO e Carbono
		assertEquals(7.54, solo.getSomaBase(), 0);
		assertEquals(12.89 , solo.getCTCTotal(), 0);
		assertEquals(58.494957331264544, solo.getSaturacaoPorBases(), 0);
		assertEquals(3.07, solo.getMOPercentual(), 0);
		assertEquals(17.848837209302324, solo.getCarbono(), 0);
	}
	
	@org.junit.Test
	public void testCorrRecupFosforo() {
		
		//Assertions quantidade a aplicar, custo 
		assertEquals(123.95079365079366, correcaoFosforo.getQuantidadeAplicar(), 0);
		assertEquals(156.178, correcaoFosforo.getCustoHectar(), 0);
		
		//Assertions dos campos ItemCorreçãoFosforo 
        assertEquals(12.395079365079365, correcaoFosforo.getItemCorrecaoFosforo().getValor(), 0);
        assertEquals("Enxofre", correcaoFosforo.getItemCorrecaoFosforo().getNome());
        
        //Assertions dos campos ItemCorreçãoFosforo2
        assertEquals(34.70622222222223, correcaoFosforo.getItemCorrecaoFosforo2().getValor(), 0);
        assertEquals("Calcio", correcaoFosforo.getItemCorrecaoFosforo2().getNome());
	}
	
	@org.junit.Test
	public void testCorrRecupPotassio() {
		
		//Assertions quantidade a aplicar, custo 
		assertEquals(450.5462068965517, correcaoPotassio.getQuantidadeAplicar(), 0);
		assertEquals(1126.3655172413792, correcaoPotassio.getCustoHectar(), 0);
		
		//Assertions dos campos ItemCorreçãoPotassio
		assertEquals(0.0, correcaoPotassio.getItemCorrecaoPotassio().getValor(), 0);
        assertEquals("", correcaoPotassio.getItemCorrecaoPotassio().getNome());
        
        //Assertions dos campos ItemCorreçãoPotassio2
        assertEquals(0.0, correcaoPotassio.getItemCorrecaoPotassio2().getValor(), 0);
        assertEquals("", correcaoPotassio.getItemCorrecaoPotassio2().getNome());
		
	}
	
}


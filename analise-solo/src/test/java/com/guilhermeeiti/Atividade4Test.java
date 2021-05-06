package com.guilhermeeiti;

import static org.junit.Assert.*;

import com.guilhermeeiti.classes.Solo;
import com.guilhermeeiti.enums.TexturaSolo;

public class Atividade4Test {

	@org.junit.Test
	public void testTeoresDoSolo() {
		
		Solo solo =  new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
		
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

}

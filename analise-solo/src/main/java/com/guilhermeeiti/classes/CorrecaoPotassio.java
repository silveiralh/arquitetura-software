/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilhermeeiti.classes;

import com.guilhermeeiti.enums.FontePotassio;
import com.guilhermeeiti.classes.ItemCorrecaoPotassio;
import com.guilhermeeiti.classes.Solo;

/**
 *
 * @author eiti
 */
public class CorrecaoPotassio {
    private Solo solo;
    private FontePotassio fontePotassio;
    private double participacaoCTCDesejada;
    private double valorTonPotassio;
    
    public CorrecaoPotassio(Solo solo, FontePotassio fontePotassio, double participacaoCTCDesejada, double valorTonPotassio) {
        this.solo = solo;
        this.fontePotassio = fontePotassio;
        this.participacaoCTCDesejada = participacaoCTCDesejada;
        this.valorTonPotassio = valorTonPotassio;
    }
    
    public double getParticipacaoCTCAtual() {
        return (solo.getPotassio() / (solo.getSomaBase() + solo.getAcidezPotencial())) * 100;
    }
    
    public double getParticipacaoCTCAposCorrecao() {
        return this.participacaoCTCDesejada > 0.001 ? this.participacaoCTCDesejada : 0.00;
    }
    
    public double getParticipacaoCTCIdeal() {      
       return this.solo.getTexturaSolo().getParticipacaoCTCIdeal();
    }
    
    public ItemCorrecaoPotassio getItemCorrecaoPotassio() {   
        return this.fontePotassio.getItemCorrecaoPotassio(this.getQuantidadeAplicar());
    }
    
    public ItemCorrecaoPotassio getItemCorrecaoPotassio2() {   
        return this.fontePotassio.getItemCorrecaoPotassio2(this.getQuantidadeAplicar());
    }
    
    
    public double getNecessidadeAdicionar() {
      return (this.solo.getPotassio() * this.participacaoCTCDesejada / this.getParticipacaoCTCAtual()) - this.solo.getPotassio();
    }
    
    public double getQuantidadeAplicar() {      
        return (this.getNecessidadeAdicionar() * 39.1 * 10 * 2 * 1.2 * 100 / 0.85 / 100) * 100 / this.fontePotassio.getValor();
    }   
    
    public double getCustoHectar() {
      return (this.valorTonPotassio * this.getQuantidadeAplicar() * 2.42 / 1000) / 2.42;
    }           
}

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
    
    public double getValorFontePotassio() {
    switch(this.fontePotassio) {
        case CLORETO_DE_POTASSIO: 
            return 58.0;
        case SULFATO_DE_POTASSIO: 
            return 52.0;   
        case SULFATO_DE_POTASSIO_E_MAGNESIO: 
            return 22.0; 
        default:
            return 0.0;
    }
  }
    
    public double getParticipacaoCTCAtual() {
        return (solo.getPotassio() / (solo.getSomaBase() + solo.getAcidezPotencial())) * 100;
    }
    
    public double getParticipacaoCTCAposCorrecao() {
        if (this.participacaoCTCDesejada > 0.001) {
            return this.participacaoCTCDesejada;
        }
        
        return 0.0;
    }
    
    public double getParticipacaoCTCIdeal() {      
       switch(solo.getTexturaSolo()) {
           case ARGILOSO:
               return 3.0;
           case TEXTURA_MEDIA:
               return 3.0;
           default:
               return 0.0;
       }
    }
    
    public ItemCorrecaoPotassio getItemCorrecaoPotassio() {   
        switch(this.fontePotassio) { 
            case SULFATO_DE_POTASSIO: 
                return new ItemCorrecaoPotassio("Enxofre", this.getQuantidadeAplicar() * 0.17);   
            case SULFATO_DE_POTASSIO_E_MAGNESIO: 
                return new ItemCorrecaoPotassio("Enxofre", this.getQuantidadeAplicar() * 0.22);   
            default:
                return null;
        }
    }
    
    public ItemCorrecaoPotassio getItemCorrecaoPotassio2() {   
        switch(this.fontePotassio) { 
            case SULFATO_DE_POTASSIO_E_MAGNESIO: 
                return new ItemCorrecaoPotassio("Magnesio", this.getQuantidadeAplicar() * 0.18);   
            default:
                return null;
        }
    }
    
    
    public double getNecessidadeAdicionar() {
      return (this.solo.getPotassio() * this.participacaoCTCDesejada / this.getParticipacaoCTCAtual()) - this.solo.getPotassio();
    }
    
    public double getQuantidadeAplicar() {      
        return (this.getNecessidadeAdicionar() * 39.1 * 10 * 2 * 1.2 * 100 / 0.85 / 100) * 100 / getValorFontePotassio();
    }   
    
    public double getCustoHectar() {
      return (this.valorTonPotassio * this.getQuantidadeAplicar() * 2.42 / 1000) / 2.42;
    }           
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilhermeeiti;

/**
 *
 * @author eiti
 */
public class CorrecaoPotassio {
    private Planilha planilha;
    private FontePotassio fontePotassio;
    private double participacaoCTCDesejada;
    private double valorTonPotassio;
    
    CorrecaoPotassio(Planilha planilha, FontePotassio fontePotassio, double participacaoCTCDesejada, double valorTonPotassio) {
        this.planilha = planilha;
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
        return (planilha.getPotassio() / (planilha.getSomaBase() + planilha.getAcidezPotencial())) * 100;
    }
    
    public double getParticipacaoCTCAposCorrecao() {
        if (this.participacaoCTCDesejada > 0.001) {
            return this.participacaoCTCDesejada;
        }
        
        return 0.0;
    }
    
    public double getParticipacaoCTCIdeal() {      
       switch(planilha.getTexturaSolo()) {
           case ARGILOSO:
               return 3.0;
           case TEXTURA_MEDIA:
               return 3.0;
           default:
               return 0.0;
       }
    }
    
    public double getNecessidadeAdicionar() {
      return (this.planilha.getPotassio() * this.participacaoCTCDesejada / this.getParticipacaoCTCAtual()) - this.planilha.getPotassio();
    }
    
    public double getQuantidadeAplicar() {      
        return (this.getNecessidadeAdicionar() * 39.1 * 10 * 2 * 1.2 * 100 / 0.85 / 100) * 100 / getValorFontePotassio();
    }   
    
    public double getCustoHectar() {
      return (this.valorTonPotassio * this.getQuantidadeAplicar() * 2.42 / 1000) / 2.42;
    }           
}

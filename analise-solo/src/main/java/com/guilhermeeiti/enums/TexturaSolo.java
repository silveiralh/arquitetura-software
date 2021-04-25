/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilhermeeiti.enums;

/**
 *
 * @author eiti
 */
public enum TexturaSolo {
    ARGILOSO(1, 3.0),
    TEXTURA_MEDIA(2, 3.0);
    
    private int codigo;
    private double participacaoCTCIdeal;
    
    TexturaSolo(int codigo, double participacaoCTCIdeal) {
        this.codigo = codigo;
        this.participacaoCTCIdeal = participacaoCTCIdeal;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public double getParticipacaoCTCIdeal() {
        return this.participacaoCTCIdeal;
    }    
}

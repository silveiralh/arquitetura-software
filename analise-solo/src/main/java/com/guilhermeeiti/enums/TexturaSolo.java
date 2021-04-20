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
    ARGILOSO(1),
    TEXTURA_MEDIA(2);
    
    private int codigo;
    
    TexturaSolo(int codigo) {
        this.codigo = codigo;
    }
    
    int getCodigo() {
        return this.codigo;
    }
}

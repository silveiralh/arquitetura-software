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
public enum FontePotassio {
    CLORETO_DE_POTASSIO(1),
    SULFATO_DE_POTASSIO(2),
    SULFATO_DE_POTASSIO_E_MAGNESIO(3);
    
    private int codigo;
    
    FontePotassio(int codigo) {
        this.codigo = codigo;
    }
    
    int getCodigo() {
        return this.codigo;
    }
}

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
public enum FonteFosforo {
    SUPERFOSFATO_SIMPLES(1),
    SUPERFOSFATO_TRIPLO(2),
    MAP(3),
    DAP(4),
    YOORIN(5),
    FOSFATO_ARAD(6),
    FOSFATO_GAFSA(7),
    FOSFATO_DAOUI(8),
    FOSF_PATOS_MINAS(9),
    ESCORIA_DE_THOMAS(10),
    ACIDO_FOSFORICO(11),
    MULTIF_MAGNESIANO(12);
    
    private int codigo;
    
    FonteFosforo(int codigo) {
        this.codigo = codigo;
    }
    
    int getCodigo() {
        return this.codigo;
    }
}

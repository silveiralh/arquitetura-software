/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilhermeeiti.enums;

import com.guilhermeeiti.classes.ItemCorrecaoPotassio;

/**
 *
 * @author eiti
 */
public enum FontePotassio {
    CLORETO_DE_POTASSIO(1, 58.0),
    SULFATO_DE_POTASSIO(2, 52.0) {
        @Override
        public ItemCorrecaoPotassio getItemCorrecaoPotassio(double quantidadeAplicar) {
            return new ItemCorrecaoPotassio("Enxofre", quantidadeAplicar * 0.17);  
        };
    },
    SULFATO_DE_POTASSIO_E_MAGNESIO(3, 22.0) {
        @Override
        public ItemCorrecaoPotassio getItemCorrecaoPotassio(double quantidadeAplicar) {
            return new ItemCorrecaoPotassio("Enxofre", quantidadeAplicar * 0.22); 
        };
        @Override
        public ItemCorrecaoPotassio getItemCorrecaoPotassio2(double quantidadeAplicar) {
            return new ItemCorrecaoPotassio("Magnesio", quantidadeAplicar * 0.18);  
        }
    };
    
    private int codigo;
    private double valor;
    
    FontePotassio(int codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public double getValor() {
        return this.valor;
    }
    
    public ItemCorrecaoPotassio getItemCorrecaoPotassio(double quantidadeAplicar) {
        return null;
    }
    
    public ItemCorrecaoPotassio getItemCorrecaoPotassio2(double quantidadeAplicar) {
        return null;
    }              
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilhermeeiti.enums;

import com.guilhermeeiti.classes.ItemCorrecaoFosforo;

/**
 *
 * @author eiti
 */
public enum FonteFosforo {
    SUPERFOSFATO_SIMPLES(1, 18.0) {
        @Override
        public ItemCorrecaoFosforo getItemCorrecaoFosforo(double quantidadeAplicar) {   
            return new ItemCorrecaoFosforo("Enxofre", (((quantidadeAplicar * 2.42) * 0.1) / 2.42));
        };
        @Override
        public ItemCorrecaoFosforo getItemCorrecaoFosforo2(double quantidadeAplicar) {   
            return new ItemCorrecaoFosforo("Calcio", ((quantidadeAplicar * 2.42) * 0.28) / 2.42);
        };
    },
    SUPERFOSFATO_TRIPLO(2, 41.0) {
        @Override
        public ItemCorrecaoFosforo getItemCorrecaoFosforo2(double quantidadeAplicar) {   
            return new ItemCorrecaoFosforo("Calcio", ((quantidadeAplicar * 2.42) * 0.2) / 2.42);
        };
    },
    MAP(3, 48.0) {
        @Override
        public ItemCorrecaoFosforo getItemCorrecaoFosforo2(double quantidadeAplicar) {   
            return new ItemCorrecaoFosforo("Nitrogenio", ((quantidadeAplicar * 2.42) * 0.09) / 2.42);
        };
    },
    DAP(4, 45.0) {
        @Override
        public ItemCorrecaoFosforo getItemCorrecaoFosforo2(double quantidadeAplicar) {   
            return new ItemCorrecaoFosforo("Nitrogenio", ((quantidadeAplicar * 2.42) * 0.16) / 2.42);
        };
    },
    YOORIN(5, 18.0) {
        @Override
        public ItemCorrecaoFosforo getItemCorrecaoFosforo(double quantidadeAplicar) {   
            return new ItemCorrecaoFosforo("Magnesio", quantidadeAplicar * 0.15);
        };
        @Override
        public ItemCorrecaoFosforo getItemCorrecaoFosforo2(double quantidadeAplicar) {   
            return new ItemCorrecaoFosforo("Calcio", ((quantidadeAplicar * 2.42) * 0.28) / 2.42);
        };
    },
    FOSFATO_ARAD(6, 33.0) {
        @Override
        public ItemCorrecaoFosforo getItemCorrecaoFosforo2(double quantidadeAplicar) {   
            return new ItemCorrecaoFosforo("Calcio", ((quantidadeAplicar * 2.42) * 0.52) / 2.42);
        };
    },
    FOSFATO_GAFSA(7, 29.0) {
        @Override
        public ItemCorrecaoFosforo getItemCorrecaoFosforo2(double quantidadeAplicar) {   
            return new ItemCorrecaoFosforo("Calcio", ((quantidadeAplicar * 2.42) * 0.52) / 2.42);
        };
    },
    FOSFATO_DAOUI(8, 32.0) {
        @Override
        public ItemCorrecaoFosforo getItemCorrecaoFosforo2(double quantidadeAplicar) {   
            return new ItemCorrecaoFosforo("Calcio", ((quantidadeAplicar * 2.42) * 0.45) / 2.42);
        };
    },
    FOSF_PATOS_MINAS(9, 24.0) {
        @Override
        public ItemCorrecaoFosforo getItemCorrecaoFosforo2(double quantidadeAplicar) {   
            return new ItemCorrecaoFosforo("Calcio", ((quantidadeAplicar * 2.42) * 0.28) / 2.42);
        };
    },
    ESCORIA_DE_THOMAS(10, 18.5) {
        @Override
        public ItemCorrecaoFosforo getItemCorrecaoFosforo2(double quantidadeAplicar) {   
            return new ItemCorrecaoFosforo("Calcio", ((quantidadeAplicar * 2.42) * 0.44) / 2.42);
        };
    },
    ACIDO_FOSFORICO(11, 52.0) {
        @Override
        public ItemCorrecaoFosforo getItemCorrecaoFosforo2(double quantidadeAplicar) {   
            return new ItemCorrecaoFosforo("", 0.00);
        };
    },
    MULTIF_MAGNESIANO(12, 18.0) {
        @Override
        public ItemCorrecaoFosforo getItemCorrecaoFosforo(double quantidadeAplicar) {   
            return new ItemCorrecaoFosforo("Enxofre", (((quantidadeAplicar * 2.42) * 0.11) / 2.42));
        };
        @Override
        public ItemCorrecaoFosforo getItemCorrecaoFosforo2(double quantidadeAplicar) {   
            return new ItemCorrecaoFosforo("CALCIO", ((quantidadeAplicar * 2.42) * 0.18) / 2.42);
        };
    };
    
    private int codigo;
    private double valor;
    
    FonteFosforo(int codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public double getValor() {
        return this.valor;
    }
    
    public ItemCorrecaoFosforo getItemCorrecaoFosforo(double quantidadeAplicar) {
        return null;
    };
    
    public abstract ItemCorrecaoFosforo getItemCorrecaoFosforo2(double quantidadeAplicar);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilhermeeiti.classes;

import com.guilhermeeiti.interfaces.ValorIdeal;

/**
 *
 * @author eiti
 */
public class CalculaValorIdeal {
    public double getFosforoIdeal(ValorIdeal valorIdeal) {
        return valorIdeal.getFosforoIdeal();
    }

    public double getPotassioIdeal(ValorIdeal valorIdeal) {
        return valorIdeal.getPotassioIdeal();
    }

    public double getCalcioIdeal(ValorIdeal valorIdeal) {
        return valorIdeal.getCalcioIdeal();
    }
    
    public double getMagnesioIdeal(ValorIdeal valorIdeal) {
        return valorIdeal.getMagnesioIdeal();
    }
    
    public double getEnxofreIdeal(ValorIdeal valorIdeal) {
        return valorIdeal.getEnxofreIdeal();
    }
}


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
public class TexturaMedia implements ValorIdeal {
    @Override
    public double getFosforoIdeal() {
        return 12.0;
    }
    
    @Override
    public double getPotassioIdeal() {
        return 0.25;
    }

    @Override
    public double getCalcioIdeal() {
        return 4.0;
    }
    
    @Override
    public double getMagnesioIdeal() {
        return 1.0;
    }
    
    @Override
    public double getEnxofreIdeal() {
        return 6.0;
    }
}

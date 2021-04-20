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
public class Argiloso implements ValorIdeal {
    @Override
    public double getFosforoIdeal() {
        return 9.0;
    }
    
    @Override
    public double getPotassioIdeal() {
        return 0.35;
    }

    @Override
    public double getCalcioIdeal() {
        return 6.0;
    }
    
    @Override
    public double getMagnesioIdeal() {
        return 1.5;
    }
    
    @Override
    public double getEnxofreIdeal() {
        return 9.0;
    }
}

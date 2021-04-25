/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilhermeeiti.classes;

/**
 *
 * @author eiti
 */
public class ItemCorrecaoFosforo {
    private String nome;
    private double valor;
    
    public ItemCorrecaoFosforo(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public double getValor() {
        return this.valor;
    }
}

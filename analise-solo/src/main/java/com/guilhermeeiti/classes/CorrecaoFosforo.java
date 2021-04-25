/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilhermeeiti.classes;

import com.guilhermeeiti.enums.FonteFosforo;
import com.guilhermeeiti.classes.ItemCorrecaoFosforo;
import com.guilhermeeiti.classes.Solo;

/**
 *
 * @author eiti
 */
public class CorrecaoFosforo {
  private Solo solo;
  private FonteFosforo fonteFosforo;   
  private double teorFosforoAtingir;
  private double eficienciaFosforo;
  private double valorTonFosforo;
  
  public CorrecaoFosforo(Solo solo, FonteFosforo fonteFosforo, double teorFosforoAtingir, double eficienciaFosforo, double valorTonFosforo) {
    this.solo = solo;
    this.fonteFosforo = fonteFosforo;
    this.teorFosforoAtingir = teorFosforoAtingir;
    this.eficienciaFosforo = eficienciaFosforo;
    this.valorTonFosforo = valorTonFosforo;
  }
 
  public ItemCorrecaoFosforo getItemCorrecaoFosforo() {   
    return this.fonteFosforo.getItemCorrecaoFosforo(this.getQuantidadeAplicar());
  }
  
  public ItemCorrecaoFosforo getItemCorrecaoFosforo2() {   
    return this.fonteFosforo.getItemCorrecaoFosforo2(this.getQuantidadeAplicar());
  }
  
  public double getNecessidadeAdicionar() {
      return (this.teorFosforoAtingir - this.solo.getFosforo());
  }
  
  public double getQuantidadeAplicar() {   
      return (this.getNecessidadeAdicionar() * 2 * 2.29) / (this.eficienciaFosforo / 100) * (100 / this.fonteFosforo.getValor());
  }           
  
  public double getCustoHectar() {
      return ((this.valorTonFosforo * (this.getQuantidadeAplicar() * 2.42)) / 1000) / 2.42;
  }
}

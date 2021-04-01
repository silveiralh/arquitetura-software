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
public class CorrecaoFosforo {
  private Planilha planilha;
  private FonteFosforo fonteFosforo;   
  private double teorFosforoAtingir;
  private double eficienciaFosforo;
  private double valorTonFosforo;
  
  CorrecaoFosforo(Planilha planilha, FonteFosforo fonteFosforo, double teorFosforoAtingir, double eficienciaFosforo, double valorTonFosforo) {
    this.planilha = planilha;
    this.fonteFosforo = fonteFosforo;
    this.teorFosforoAtingir = teorFosforoAtingir;
    this.eficienciaFosforo = eficienciaFosforo;
    this.valorTonFosforo = valorTonFosforo;
  }
  
  public double getValorFonteFosforo() {
    switch(this.fonteFosforo) {
        case SUPERFOSFATO_SIMPLES: 
            return 18.0;
        case SUPERFOSFATO_TRIPLO: 
            return 41.0;   
        case MAP: 
            return 48.0; 
        case DAP: 
            return 45.0; 
        case YOORIN: 
            return 18.0; 
        case FOSFATO_ARAD: 
            return 33.0; 
        case FOSFATO_GAFSA: 
            return 29.0;
        case FOSFATO_DAOUI: 
            return 32.0; 
        case FOSF_PATOS_MINAS: 
            return 24.0; 
        case ESCORIA_DE_THOMAS: 
            return 18.5; 
        case ACIDO_FOSFORICO: 
            return 52.0; 
        case MULTIF_MAGNESIANO: 
            return 18.0; 
        default:
            return 0.0;
    }
  }
  
  public ItemCorrecaoFosforo getItemCorrecaoFosforo() {   
    switch(this.fonteFosforo) {
        case SUPERFOSFATO_SIMPLES: 
            return new ItemCorrecaoFosforo("Enxofre", (((this.getQuantidadeAplicar() * 2.42) * 0.1) / 2.42));
        case YOORIN:
            return new ItemCorrecaoFosforo("Magnesio", this.getQuantidadeAplicar() * 0.15);
        case MULTIF_MAGNESIANO:
            return new ItemCorrecaoFosforo("Enxofre", (((this.getQuantidadeAplicar() * 2.42) * 0.11) / 2.42));
        default: 
            return null;
    }
  }
  
  public ItemCorrecaoFosforo getItemCorrecaoFosforo2() {   
    switch(this.fonteFosforo) {
        case SUPERFOSFATO_SIMPLES:
            return new ItemCorrecaoFosforo("Calcio", ((this.getQuantidadeAplicar() * 2.42) * 0.28) / 2.42);
        case SUPERFOSFATO_TRIPLO:
            return new ItemCorrecaoFosforo("Calcio", ((this.getQuantidadeAplicar() * 2.42) * 0.2) / 2.42);
        case MAP:
            return new ItemCorrecaoFosforo("Nitrogenio", ((this.getQuantidadeAplicar() * 2.42) * 0.09) / 2.42);
        case DAP:
            return new ItemCorrecaoFosforo("Nitrogenio", ((this.getQuantidadeAplicar() * 2.42) * 0.16) / 2.42);
        case YOORIN: 
            return new ItemCorrecaoFosforo("Calcio", ((this.getQuantidadeAplicar() * 2.42) * 0.28) / 2.42);
        case FOSFATO_ARAD: 
            return new ItemCorrecaoFosforo("Calcio", ((this.getQuantidadeAplicar() * 2.42) * 0.52) / 2.42);
        case FOSFATO_GAFSA: 
            return new ItemCorrecaoFosforo("Calcio", ((this.getQuantidadeAplicar() * 2.42) * 0.52) / 2.42);
        case FOSFATO_DAOUI: 
            return new ItemCorrecaoFosforo("Calcio", ((this.getQuantidadeAplicar() * 2.42) * 0.45) / 2.42);
        case FOSF_PATOS_MINAS: 
            return new ItemCorrecaoFosforo("Calcio", ((this.getQuantidadeAplicar() * 2.42) * 0.28) / 2.42);
        case ESCORIA_DE_THOMAS: 
            return new ItemCorrecaoFosforo("Calcio", ((this.getQuantidadeAplicar() * 2.42) * 0.44) / 2.42);
        case ACIDO_FOSFORICO: 
            return new ItemCorrecaoFosforo("", 0.00);
        case MULTIF_MAGNESIANO:
               return new ItemCorrecaoFosforo("CALCIO", ((this.getQuantidadeAplicar() * 2.42) * 0.18) / 2.42);
        default: 
            return null;
    }
  }
  
  public double getNecessidadeAdicionar() {
      return (this.teorFosforoAtingir - this.planilha.getFosforo());
  }
  
  public double getQuantidadeAplicar() {   
      return (this.getNecessidadeAdicionar() * 2 * 2.29) / (this.eficienciaFosforo / 100) * (100 / this.getValorFonteFosforo());
  }           
  
  public double getCustoHectar() {
      return ((this.valorTonFosforo * (this.getQuantidadeAplicar() * 2.42)) / 1000) / 2.42;
  }
}

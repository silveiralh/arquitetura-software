package com.guilhermeeiti.classes;

import com.guilhermeeiti.enums.TexturaSolo;

public class Solo {
    private TexturaSolo texturaSolo;
    private double fosforo;
    private double potassio;
    private double calcio;
    private double magnesio;
    private double enxofre;
    private double aluminio;
    private double acidezPotencial;
    private double mo;
    
    public Solo(TexturaSolo texturaSolo, double fosforo, double potassio, double calcio, double magnesio, double enxofre, double aluminio, double acidezPotencial, double mo) {
        this.texturaSolo = texturaSolo;
        this.fosforo = fosforo;
        this.potassio = potassio;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.enxofre = enxofre;
        this.aluminio = aluminio;
        this.acidezPotencial = acidezPotencial;
        this.mo = mo;
    }
    
    public TexturaSolo getTexturaSolo() {
        return this.texturaSolo;
    }
    
    public double getFosforo() {
        return this.fosforo;
    }
    
    public double getPotassio() {
        return this.potassio;
    }
    
    public double getCalcio() {
        return this.calcio;
    }
    
    public double getMagnesio() {
        return this.magnesio;
    }
    
    public double getEnxofre() {
        return this.enxofre;
    }
    
    public double getAluminio() {
        return this.aluminio;
    }
    
    public double getAcidezPotencial() {
        return this.acidezPotencial;
    }
    
    public double getFosforoIdeal() {
        switch(this.texturaSolo) {
            case ARGILOSO:
                return new CalculaValorIdeal().getFosforoIdeal(new Argiloso());
            case TEXTURA_MEDIA:
                return new CalculaValorIdeal().getFosforoIdeal(new TexturaMedia());
            default:
                return 0.0;   
        }
    }

    public double getPotassioIdeal() {  
        switch(this.texturaSolo) {
            case ARGILOSO:
               return new CalculaValorIdeal().getPotassioIdeal(new Argiloso());
            case TEXTURA_MEDIA:
               return new CalculaValorIdeal().getPotassioIdeal(new TexturaMedia());
            default:
               return 0.0;
        }
    }
    
    public double getCalcioIdeal() {        
        switch(this.texturaSolo) {
            case ARGILOSO:
                return new CalculaValorIdeal().getCalcioIdeal(new Argiloso());
            case TEXTURA_MEDIA:
                return new CalculaValorIdeal().getCalcioIdeal(new TexturaMedia());
            default:
                return 0.0;
        }
    }
    
    public double getMagnesioIdeal() {
        switch(this.texturaSolo) {
            case ARGILOSO:
                return new CalculaValorIdeal().getMagnesioIdeal(new Argiloso());
            case TEXTURA_MEDIA:
                return new CalculaValorIdeal().getMagnesioIdeal(new TexturaMedia());
            default:
                return 0.0;
        }
    }
    
    public double getEnxofreIdeal() {
        switch(this.texturaSolo) {
            case ARGILOSO:
                return new CalculaValorIdeal().getEnxofreIdeal(new Argiloso());
            case TEXTURA_MEDIA:
                return new CalculaValorIdeal().getEnxofreIdeal(new TexturaMedia());
            default:
                return 0.0;
        }
    }
    
    public double getAluminioIdeal() {        
        return 0.0;
    }
    
    public double getSomaBase() {
        return (this.potassio + this.calcio + this.magnesio);
    }

    public double getCTCTotal() {
        return (getSomaBase() + getAcidezPotencial());
    }
    
    public double getSaturacaoPorBases() {
        return (100 * getSomaBase() / getCTCTotal());
    }
    
    public double getMOPercentual() {
        return (this.mo / 10);
    }
    
    public double getCarbono() {
        return (10 * (getMOPercentual() / 1.72));
    }
}

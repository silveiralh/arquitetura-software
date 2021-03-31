package com.guilhermeeiti;

public class Planilha {
    private TexturaSolo texturaSolo;
    private double fosforo;
    private double potassio;
    private double calcio;
    private double magnesio;
    private double enxofre;
    private double aluminio;
    private double acidezPotencial;
    
    public void setTexturaSolo(TexturaSolo texturaSolo) {
        this.texturaSolo = texturaSolo;
    }
    
    public TexturaSolo getTexturaSolo() {
        return this.texturaSolo;
    }
    
    public void setFosforo(double fosforo) {
        this.fosforo = fosforo;
    }
    
    public double getFosforo() {
        return this.fosforo;
    }
    
    public void setPotassio(double potassio) {
        this.potassio = potassio;
    }
    
    public double getPotassio() {
        return this.potassio;
    }
        
    public void setCalcio(double calcio) {
        this.calcio = calcio;
    }
    
    public double getCalcio() {
        return this.calcio;
    }
    
    public void setMagnesio(double magnesio) {
        this.magnesio = magnesio;
    }
    
    public double getMagnesio() {
        return this.magnesio;
    }
    
    public void setEnxofre(double enxofre) {
        this.enxofre = enxofre;
    }
    
    public double getEnxofre() {
        return this.enxofre;
    }
    
    public void setAluminio(double aluminio) {
        this.aluminio = aluminio;
    }
    
    public double getAluminio() {
        return this.aluminio;
    }
        
    public void setAcidezPotencial(double acidezPotencial) {
        this.acidezPotencial = acidezPotencial;
    }
    
    public double getAcidezPotencial() {
        return this.acidezPotencial;
    }
    
    public double getFosforoIdeal() {
        switch(this.texturaSolo) {
            case ARGILOSO:
                return 9.0;
            case TEXTURA_MEDIA:
                return 12.0;
            default:
                return 0.0;   
        }
    }

    public double getPotassioIdeal() {  
        switch(this.texturaSolo) {
            case ARGILOSO:
                return 0.35;
            case TEXTURA_MEDIA:
                return 0.25;
            default:
                return 0.0;
        }
    }
    
    public double getCalcioIdeal() {        
        switch(this.texturaSolo) {
            case ARGILOSO:
                return 6.0;
            case TEXTURA_MEDIA:
                return 4.0;
            default:
                return 0.0;
        }
    }
    
    public double getMagnesioIdeal() {
        switch(this.texturaSolo) {
            case ARGILOSO:
                return 1.5;
            case TEXTURA_MEDIA:
                return 1.0;
            default:
                return 0.0;
        }
    }
    
    public double getEnxofreIdeal() {
        switch(this.texturaSolo) {
            case ARGILOSO:
                return 9.0;
            case TEXTURA_MEDIA:
                return 6.0;
            default:
                return 0.0;
        }
    }
    
    public double getAluminioIdeal() {        
        return 0.0;
    }
}

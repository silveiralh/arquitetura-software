package com.guilhermeeiti;

public class Planilha {
    private int texturaSolo;
    private double fosforo;
    private double potassio;
    private double calcio;
    private double magnesio;
    private double enxofre;
    private double aluminio;
    private double acidezPotencial;
    
    public void setTexturaSolo(int texturaSolo) {
        this.texturaSolo = texturaSolo;
    }
    
    public double getTexturaSolo() {
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
        if (this.texturaSolo == 1) {
            return 9.0;
        } else if (this.texturaSolo == 2) {
            return 12.0;
        }
        
        return 0.0;
    }

    public double getPotassioIdeal() {
        if (this.texturaSolo == 1) {
            return 0.35;
        } else if (this.texturaSolo == 2) {
            return 0.25;
        }
        
        return 0.0;
    }
    
    public double getCalcioIdeal() {
        if (this.texturaSolo == 1) {
            return 6.0;
        } else if (this.texturaSolo == 2) {
            return 4.0;
        }
        
        return 0.0;
    }
    
    public double getMagnesioIdeal() {
        if (this.texturaSolo == 1) {
            return 1.5;
        } else if (this.texturaSolo == 2) {
            return 1.0;
        }
        
        return 0.0;
    }
    
    public double getEnxofreIdeal() {
        if (this.texturaSolo == 1) {
            return 9.0;
        } else if (this.texturaSolo == 2) {
            return 6.0;
        }
        
        return 0.0;
    }
    
    public double getAluminioIdeal() {        
        return 0.0;
    }
}

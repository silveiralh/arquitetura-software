package com.guilhermeeiti;

public class App 
{
	public static void main( String[] args )
	{
            Planilha planilha1;
            planilha1 = new Planilha();
            
            planilha1.setTexturaSolo(1);
            planilha1.setFosforo(8.59);
            planilha1.setPotassio(0.15);
            planilha1.setCalcio(5.76);
            planilha1.setMagnesio(1.63);
            planilha1.setEnxofre(3.67);
            planilha1.setAluminio(0.00);
            
            System.out.println("Teste do Exemplo 1:");
            System.out.println("Fosforo: " + planilha1.getFosforo() + " Fosforo ideal: " + planilha1.getFosforoIdeal());
            System.out.println("Potassio: " + planilha1.getPotassio() + " Potassio ideal: " + planilha1.getPotassioIdeal());
            System.out.println("Calcio: " + planilha1.getCalcio() + " Calcio ideal: " + planilha1.getCalcioIdeal());
            System.out.println("Magnesio: " + planilha1.getMagnesio() + " Potassio ideal: " + planilha1.getMagnesioIdeal());
            System.out.println("Enxofre: " + planilha1.getEnxofre() + " Enxofre ideal: " + planilha1.getEnxofreIdeal());
            System.out.println("Aluminio: " + planilha1.getAluminio() + " Aluminio ideal: " + planilha1.getAluminioIdeal());
            
            Planilha planilha2;
            planilha2 = new Planilha();
            
            planilha2.setTexturaSolo(1);
            planilha2.setFosforo(10.58);
            planilha2.setPotassio(0.41);
            planilha2.setCalcio(6.94);
            planilha2.setMagnesio(2.87);
            planilha2.setEnxofre(2.31);
            planilha2.setAluminio(0.00);
            
            System.out.println("");
            System.out.println("Teste do Exemplo 2:");
            System.out.println("Fosforo: " + planilha2.getFosforo() + " Fosforo ideal: " + planilha2.getFosforoIdeal());
            System.out.println("Potassio: " + planilha2.getPotassio() + " Potassio ideal: " + planilha2.getPotassioIdeal());
            System.out.println("Calcio: " + planilha2.getCalcio() + " Calcio ideal: " + planilha2.getCalcioIdeal());
            System.out.println("Magnesio: " + planilha2.getMagnesio() + " Potassio ideal: " + planilha2.getMagnesioIdeal());
            System.out.println("Enxofre: " + planilha2.getEnxofre() + " Enxofre ideal: " + planilha2.getEnxofreIdeal());
            System.out.println("Aluminio: " + planilha2.getAluminio() + " Aluminio ideal: " + planilha2.getAluminioIdeal());
            
            Planilha planilha3;
            planilha3 = new Planilha();
            
            planilha3.setTexturaSolo(1);
            planilha3.setFosforo(10.23);
            planilha3.setPotassio(0.82);
            planilha3.setCalcio(12.45);
            planilha3.setMagnesio(3.47);
            planilha3.setEnxofre(1.10);
            planilha3.setAluminio(0.00);
            
            System.out.println("");
            System.out.println("Teste do Exemplo 3:");
            System.out.println("Fosforo: " + planilha3.getFosforo() + " Fosforo ideal: " + planilha3.getFosforoIdeal());
            System.out.println("Potassio: " + planilha3.getPotassio() + " Potassio ideal: " + planilha3.getPotassioIdeal());
            System.out.println("Calcio: " + planilha3.getCalcio() + " Calcio ideal: " + planilha3.getCalcioIdeal());
            System.out.println("Magnesio: " + planilha3.getMagnesio() + " Potassio ideal: " + planilha3.getMagnesioIdeal());
            System.out.println("Enxofre: " + planilha3.getEnxofre() + " Enxofre ideal: " + planilha3.getEnxofreIdeal());
            System.out.println("Aluminio: " + planilha3.getAluminio() + " Aluminio ideal: " + planilha3.getAluminioIdeal());
	}
        
}


package br.com.bandtec.srp;

import java.util.Scanner;

//Indo contra o primeiro princípio SOLID
//Instanciando as variáveis como private (utilizando orientação ao objeto) na mesma classe que contém o método main
public class Modelo {
    
    private double altura;
    private double peso;
    private double imc;
    
    public Modelo(double altura, double peso){
        this.altura = altura;
        this.peso = peso;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return this.altura;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return this.peso;
    }
    
    public void calculoIMC(){
        this.imc = this.peso/(this.altura*this.altura);        
    }
    public double getIMC(){
        return this.imc;
    }
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a sua altura?");
        double altura = leitor.nextDouble();
        System.out.println("Qual o seu peso?");
        double peso = leitor.nextDouble();
        Modelo model = new Modelo(altura, peso);        
        model.calculoIMC();
        System.out.println("Seu IMC é "+model.getIMC());
        
    }    
    
}

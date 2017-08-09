
package app;

import modelo.CaixaEletronico;


public class AppCaixasEletronicos {
    
    public static void main(String[] args) {
        
        //instanciando (criando) objetos do tipo CaixaEletronico
        CaixaEletronico caixaA = new CaixaEletronico();
        CaixaEletronico caixaB = new CaixaEletronico();
        
        caixaA.depositar(100);
        caixaB.depositar(800);
        
        caixaA.sacar(50);
        caixaB.sacar(1000);
        
        System.out.println("Quais os bancos do B?"+caixaB.bancosDisponiveis());
    }
    
}

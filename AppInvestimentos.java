package app;

import modelo.Acoes;
import java.util.Scanner;

public class AppInvestimentos {
   
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Acoes acoes01 = new Acoes();
        System.out.print("Informe o titular: ");
        acoes01.alterarTitular(leitor.nextLine());
        for(int i=0; i<3; i++){
            acoes01.render();
        }
        System.out.println("Saldo atual: "+acoes01.recuperarSaldo());
        
    }
    

}
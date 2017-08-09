package app;

import modelo.Eleicao;
import java.util.Scanner;

public class AppVotacao {    

    public static void main(String[] args) {      

        Scanner leitor = new Scanner(System.in);
        Eleicao eleicao1 = new Eleicao();
        for(int i = 0; i < 10; i++){
            System.out.println("Voto "+(i+1)+" - Deseja votar em quem?\n"
                    + "1- Candidato 1\n"
                    + "2- Candidato 2\n"
                    + "3- Branco\n"
                    + "4- Nulo");
            int voto = leitor.nextInt();
            switch(voto){
                case 1:
                    eleicao1.candidato01();
                    break;
                case 2:
                    eleicao1.candidato02();
                    break;
                case 3:
                    eleicao1.branco();
                    break;
                case 4:
                    eleicao1.nulo();
                    break;
            }            
        }
        eleicao1.encerrarVotacao();
        System.out.println("Vencedor: "+eleicao1.getResultado()+
                "\nCandidato 1: "+eleicao1.votos1()+" votos\n"+
                "Candidato 2: "+eleicao1.votos2()+" votos\n"+
                "Em branco: "+eleicao1.votosBrancos()+" votos\n"+
                "Nulos: "+eleicao1.votosNulos()+" votos\n");
    }
    
}
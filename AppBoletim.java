
package app;
import modelo.Boletim;
import java.util.Scanner;

public class AppBoletim {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Boletim boletim1 = new Boletim();
        System.out.print("Boletim 1 - Informe a 1ª nota: ");
        double notaOne = leitor.nextDouble();
        boletim1.alteracaoNota1(notaOne);
        System.out.print("Boletim 1 - Informe a 2ª nota: ");
        double notaTwo = leitor.nextDouble();
        boletim1.alteracaoNota2(notaTwo);
        System.out.println("Boletim 1 - Média: "+boletim1.getMedia()+". Resultado: "+boletim1.getResultado());
        Boletim boletim2 = new Boletim();
        System.out.print("Boletim 2 - Informe a 1ª nota: ");
        double notaUm = leitor.nextDouble();
        boletim2.alteracaoNota1(notaUm);
        System.out.print("Boletim 2 - Informe a 2ª nota: ");
        double notaDois = leitor.nextDouble();
        boletim2.alteracaoNota2(notaDois);
        System.out.println("Boletim 2 - Média: "+boletim2.getMedia()+". Resultado: "+boletim2.getResultado());
    }
    
}

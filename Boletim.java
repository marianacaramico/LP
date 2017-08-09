
package modelo;


public class Boletim {
    
    private double nota1;
    private double nota2;
    private double media;
    private String resultado;
    
    public void alteracaoNota1(double nota01){
        this.nota1 = nota01;
        this.calculoMedia();
    }
    public void alteracaoNota2(double nota02){
        this.nota2 = nota02;
        this.calculoMedia();
    }
    private void calculoMedia(){
        this.media = (this.nota1 + this.nota2)/2.0;
        if(this.media>=5) this.resultado = "Aprovado";
        else this.resultado = "Reprovado";
    }
    public double getMedia(){
        return this.media;
    }
    public String getResultado(){
        return this.resultado;
    }
        
    
}

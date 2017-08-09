package modelo;


public class Eleicao {
  
    private int candidato1;
    private int candidato2;
    private int brancos;
    private int nulos;
    private String resultado;    

    public void candidato01(){
        this.candidato1++;
    }
    public void candidato02(){
        this.candidato2++;
    }
    public void branco(){
        this.brancos++;
    }
    public void nulo(){
        this.nulos++;
    }
    public void encerrarVotacao(){
        if(this.candidato1 > this.candidato2) this.resultado = "Candidato 1";
        else if(this.candidato1 < this.candidato2) this.resultado = "Candidato 2";
        else this.resultado = "Empate";
    }
    public int votos1(){
        return this.candidato1;
    }
    public int votos2(){
        return this.candidato2;
    }
    public int votosBrancos(){
        return this.brancos;
    }
    public int votosNulos(){
        return this.nulos;
    }    
    public String getResultado(){
        return this.resultado;
    }

}
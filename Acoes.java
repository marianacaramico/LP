package modelo;


public class Acoes {
   
    private String titular;
    private double saldo;
   
    public void alterarTitular(String novoTitular){
        this.titular = novoTitular; 
    }
    public String recuperarTitular(){
        return this.titular;
    }
    public double recuperarSaldo(){
        return this.saldo;
    }
    public void render(){
        double random = Math.random()*400 - 200;
        random = Math.round(random);
        this.saldo += this.saldo*random/100;
    }
  
   
}


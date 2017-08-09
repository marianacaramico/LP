
package modelo;


public class CaixaEletronico {
    
    //atributos de instância PRIVADOS ("características")
    private String bancos;
    private int horarioInicio;
    private int horarioFim;
    private double dinheiro;
    
    //métodos públicos ("comportamentos")
    public void sacar(double valorSaque){
        if(this.dinheiro >= valorSaque){
            this.dinheiro -= valorSaque;
            System.out.println("R$"+valorSaque+" sacado com sucesso. Saldo: "+this.dinheiro);
        }
        else System.out.println("Valor solicitado não pode ser sacado.");
    }
    public void depositar(double valorDeposito){
        this.dinheiro += valorDeposito;
        System.out.println("R$"+valorDeposito+" depositado com sucesso. Saldo: "+this.dinheiro);
    }
    public void transferir(double valorTransf){
        if(this.dinheiro >= valorTransf){
            this.dinheiro -= valorTransf;    
            System.out.println("R$"+valorTransf+" transferido com sucesso. Saldo: "+this.dinheiro);
        }
        else System.out.println("Valor solicitado não pode ser transferido");
    }
    public void configurarBancos(String novosBancos){
        this.bancos = novosBancos;
    }
    public String bancosDisponiveis(){
        return this.bancos != null ? this.bancos : "Nenhum";
    }
}

package Exercicio3ContaCorrente;

public class ContaCorrente {
    private int numConta;
    private String titular;
    private double saldo;

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
    public ContaCorrente(int numConta,String titular,double saldo){
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente: " +
                "\n"+"numConta= " + numConta +
                "\n"+"titular= " + titular +
                "\n"+"Saldo= " + saldo ;
    }

    public void deposito(double valorDeposito){
        if (valorDeposito<0){
            throw new IllegalArgumentException("Valor de Deposito invalido");
        }
        this.saldo+=valorDeposito;
        System.out.println("Deposito Realizado com Sucesso!");
        System.out.println("Novo saldo: "+saldo);
    }
    public void saque(double valorSaque){
        if(getSaldo()<valorSaque){
            throw new IllegalArgumentException("Saldo Insuficiente");
        }
//        double novoSaldo = getSaldo()-valorSaque;
        this.saldo -=valorSaque;
        System.out.println("Saque Realizado com Sucesso!");
        System.out.println("Novo saldo: "+saldo);
    }



}


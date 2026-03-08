package Exercicio6Cofre;

public class Cofre {
    private int senha;
    private double saldo;
    private int senhaDigitada;

    public double getSaldo() {
        return saldo;
    }

    public int getSenha() {
        return senha;
    }

    public int getSenhaDigitada() {
        return senhaDigitada;
    }
    public Cofre(int senha,double saldo){
        this.saldo=saldo;
        this.senha=senha;

    }

    void abrirCofre(int senhaDigitada) {
        if (getSenha() == senhaDigitada) {
            System.out.println("Cofre Aberto com sucesso!" + "\n" + "Senha autenticada!");

        }
        if (getSenha() != senhaDigitada) {
            throw new IllegalArgumentException("Acesso ao cofre Negado!");
        }

    }
    void consultarSaldo(int senhaDigitada) {
        if (getSenha() == senhaDigitada) {
            System.out.println("Senha autenticada! " + "\n" + "Seu saldo é de: " + saldo);
        }

        if (getSenha() != senhaDigitada) {
            throw new IllegalArgumentException("Senha invalida!");
        }

    }

}

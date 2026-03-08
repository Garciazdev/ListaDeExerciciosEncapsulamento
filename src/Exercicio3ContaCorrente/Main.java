package Exercicio3ContaCorrente;

public class Main {

    public static void main(String[] args) {
    ContaCorrente contaCorrente = new ContaCorrente(23131,"Erik",2300);
        System.out.println(contaCorrente);
        contaCorrente.deposito(300);
        contaCorrente.saque(3600);
    }
}

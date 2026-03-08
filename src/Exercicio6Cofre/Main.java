package Exercicio6Cofre;

public class Main {
    public static void main(String[] args) {
        Cofre cofre = new Cofre(1234,2500);
        cofre.abrirCofre(1234);
        System.out.println("-------------------"+"\n");
            cofre.consultarSaldo(200);

    }
}

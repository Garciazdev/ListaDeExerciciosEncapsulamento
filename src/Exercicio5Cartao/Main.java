package Exercicio5Cartao;

public class Main {
    public static void main(String[] args) {
    CartaoCredito cartaoCredito = new CartaoCredito(3123123,2300);

        cartaoCredito.realizarCompra(100);
        System.out.println("Compra Realizada com sucesso!");

        System.out.println(cartaoCredito);
        cartaoCredito.realizarCompra(100);
        System.out.println("Compra Realizada com sucesso!");
        System.out.println(cartaoCredito);


        cartaoCredito.PagarFatura(100);
        if(cartaoCredito.getFatura()<=0){
            System.out.println("Fatura paga com sucesso!");
        }else{
            System.out.println("Fatura paga com sucesso!");
            System.out.println("Restam: R$ "+cartaoCredito.getFatura());
        }

    }
}

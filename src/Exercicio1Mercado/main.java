package Exercicio1Mercado;

public class main {
    public static void main(String[] args) {
        Produto produto = new Produto("Abacaxi",5,30);
        System.out.println(produto);
        produto.aumentarEstoque();
        produto.Diminuirstoque();
    }

}

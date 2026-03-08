package Exercio7Pedido;

public class Main {
    public static void main(String[] args) {
    Pedido pedido = new Pedido(200);
    pedido.adicionarProduto("prego","marreta","Lixadeira");
    pedido.criarPedido();
    pedido.enviarPedido();
    pedido.cancelarPedido();
        pedido.enviarPedido();

        System.out.println(pedido);
    }
}

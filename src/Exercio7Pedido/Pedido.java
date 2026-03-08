package Exercio7Pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int idPedido;
    private List<String> listaDeProdutos;
    private StatusPedido status;

    public int getIdPedido() {
        return idPedido;
    }

    public List<String> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public Pedido(int idPedido){
        listaDeProdutos = new ArrayList<>();
        this.idPedido = idPedido;

    }
    void adicionarProduto(String p1,String p2,String p3){
        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);
        listaDeProdutos.add(p3);

    }
    void criarPedido() {
        if (status == StatusPedido.CRIADO) {
            status = StatusPedido.CRIADO;
        }
    }
    void pagarPedido() {
        if (status == StatusPedido.CANCELADO) {
            throw new IllegalArgumentException("PEDIDO NÃO PODE SER PAGO!");
        } if(status == StatusPedido.PAGO) {
            throw new IllegalArgumentException("PEDIDO CONSTA PAGO!");
        }
        status = StatusPedido.PAGO;

    }
    void enviarPedido(){
        if(status == StatusPedido.ENVIADO){
            throw new IllegalArgumentException("PEDIDO JA ENVIADO!");
        }

        status = StatusPedido.ENVIADO;
    }
    void cancelarPedido() {
        if (status != StatusPedido.CANCELADO) {
            status = StatusPedido.CANCELADO;
        }

    }

    @Override
    public String toString() {
        return "Pedido: " +
                "\n"+"idPedido=" + getIdPedido() +
                "\n"+"listaDeProdutos=" + listaDeProdutos +
                "\n"+"status=" + status +
                "\n"+"----------------------";
    }
}

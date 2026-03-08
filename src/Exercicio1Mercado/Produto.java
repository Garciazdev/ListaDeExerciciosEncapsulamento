package Exercicio1Mercado;

import java.util.Scanner;

public class Produto {
    private String nomeProduto;
    private double preço;
    private int quantiadade;
    Scanner sc = new Scanner(System.in);


    public Produto(String nomeProduto, double preço, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.preço = preço;
        this.quantiadade = quantidade;
        if (preço < 0) {
            System.out.println("Preço invalido");
            System.exit(0);
        }
        if (quantidade < 0) {
            System.out.println("Quantidade invalida");
            System.exit(0);
        }

    }

    @Override
    public String toString() {
        return "Produto: " +
                "nomeProduto: '" + nomeProduto+
                ", preço: " + preço +
                ", quantiadade: " + quantiadade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQuantiadade() {
        return quantiadade;
    }

    public void setQuantiadade(int quantiadade) {
        this.quantiadade = quantiadade;
    }


    public void aumentarEstoque(){
        System.out.println("Digite a quantidade de produtos que vão entrar");
        int novaQuantidade = sc.nextInt();
        novaQuantidade = getQuantiadade()+novaQuantidade;
        System.out.println("Novos produto adicionados ao estoque!");
        System.out.println("Nova quantidade no estoque é de: "+novaQuantidade+" "+getNomeProduto()+"s");
        setQuantiadade(novaQuantidade);
    }
    public void Diminuirstoque(){
        System.out.println("Digite a quantidade de produtos que vão ser retirados");
        int novaQuantidade = sc.nextInt();
        novaQuantidade = getQuantiadade()-novaQuantidade;
        System.out.println("Produtos retirado do estoque!");
        System.out.println("Nova quantidade no estoque é de: "+novaQuantidade+" "+getNomeProduto()+"s");
        setQuantiadade(novaQuantidade);
    }


}

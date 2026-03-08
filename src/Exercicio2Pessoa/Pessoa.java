package Exercicio2Pessoa;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private int idade;



    public void setIdade(int idade) {
        if(idade<0){
            throw new IllegalArgumentException("Não existe idade negativa!");
        }
        if(idade>=130){
            throw new IllegalArgumentException("Idade Invalida");
        }
        this.idade = idade;

    }


    public void setNome(String nome) {
        Objects.requireNonNull(nome,"Variavel não pode ser nula");
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome vazio!");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
    public Pessoa(String nome, int idade){
        setIdade(idade);
        setNome(nome);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idade=" + getIdade() + " anos"+
                ", nome='" + getNome() + '\'' +
                '}';
    }
}

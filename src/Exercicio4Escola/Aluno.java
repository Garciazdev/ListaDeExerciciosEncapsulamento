package Exercicio4Escola;

public class Aluno {
    private final String nome;
    private final double nota1;
    private final double nota2;


    public String getNome() {
        return nome;
    }

    public double getNota1() {

        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public  double getMedia() {
        return(nota1+nota2)/2;
    }

    public Aluno(String nome, double nota1, double nota2){
        if (nota2 < 0 && nota2 > 10) {
            throw new IllegalArgumentException("Nota Invalida");
        }
            if(nota1<0 || nota1>10){
                throw new IllegalArgumentException("Nota Invalida");
            }
        this.nome=nome;
        this.nota1=nota1;
        this.nota2=nota2;
    }

    @Override
    public String toString() {
        return "Aluno: " +
                "\n"+"nome= " + nome +
                "\n"+"nota1= " + nota1 +
                "\n"+"nota2=" + nota2 +
                "\n"+ "media=" + getMedia()
                ;
    }
}

package Exercicio5Cartao;

public class CartaoCredito {
    private final int numeroCartao;
    private double limite;
    private  double fatura;

    public CartaoCredito(int numeroCartao, double limite){
        this.numeroCartao=numeroCartao;
        this.limite=limite;

    }

    public double getFatura() {
        return fatura;
    }

    public double getLimite() {
        return limite;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }


    void realizarCompra(double valorCompra){

        if(valorCompra<=0){
            throw new IllegalArgumentException("Valor invalido");
        }
        if(valorCompra>limite){
            throw new IllegalArgumentException("Limite insuficiente");
        }else{
            this.fatura=getFatura()+valorCompra;

            limite -=valorCompra;
            }
    }



    void PagarFatura(double valorPago){
        if(valorPago>fatura){
            throw new IllegalArgumentException("Valor maior que a fatura");
        }
        if(valorPago<0){
            throw new IllegalArgumentException("Valor invalido");
        }else{
            this.fatura-=valorPago;
        }
    }
    @Override
    public String toString() {
        return "CartãoDeCredito: " +
                "\n"+"fatura= " + getFatura() +
                "\n"+"numeroCartão= " + numeroCartao +
                "\n"+"limite= " + limite +
                "\n"+"-------------------------";
    }





}

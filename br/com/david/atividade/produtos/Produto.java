package br.com.david.atividade.produtos;

public class Produto implements Vendavel {
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return Math.ceil(getPreco() * quantidade);
    }
}

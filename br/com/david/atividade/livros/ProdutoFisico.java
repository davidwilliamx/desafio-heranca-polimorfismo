package br.com.david.atividade.livros;

public class ProdutoFisico implements Calculavel {
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() - 0.15 * getPreco();
    }
}

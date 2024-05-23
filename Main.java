import br.com.david.atividade.calculadoraretangulo.CalculadoraSalaRetangular;
import br.com.david.atividade.conversormoeda.ConversorMoeda;
import br.com.david.atividade.conversortemperatura.ConversorTemperaturaPadrao;
import br.com.david.atividade.livros.Livro;
import br.com.david.atividade.livros.ProdutoFisico;
import br.com.david.atividade.produtos.Produto;
import br.com.david.atividade.produtos.Servico;
import br.com.david.atividade.tabuada.TabuadaMultiplicacao;

public class Main {
    public static void main(String[] args) {

        ConversorMoeda conversorMoeda = new ConversorMoeda();
        System.out.println("R$" + conversorMoeda.converterDolarParaReal(50.0));

        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        System.out.println(calculadoraSalaRetangular.calcularArea(10.0, 20.0) + " cm");
        System.out.println(calculadoraSalaRetangular.calcularPerimetro(10.0, 20.0) + " cm");

        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.mostrarTabuada(5);
        tabuadaMultiplicacao.mostrarTabuada(2);

        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
        System.out.println(conversorTemperaturaPadrao.celsiusParaFahrenheit(10.0) + " Fahrenheit");
        System.out.println(conversorTemperaturaPadrao.fahrenheitParaCelsius(50.0) + " Celsius");

        Livro livro = new Livro();
        livro.setPreco(150.0);
        System.out.println("O valor original é R$ " +livro.getPreco() + " reais");
        System.out.println("Preço final com Desconto R$ " + livro.calcularPrecoFinal() + " reais");

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPreco(100.0);
        System.out.println("O valor original é R$ " + produtoFisico.getPreco() + " reais");
        System.out.println("Preço final com Desconto R$ " + produtoFisico.calcularPrecoFinal() + " reais.");

        Produto televisao = new Produto();
        televisao.setPreco(1000.0);
        System.out.println("O valor da televisão é R$ " + televisao.getPreco() + " reais");
        System.out.println("Preço final R$ " + televisao.calcularPrecoTotal(5) + " reais.");

        Servico servico = new Servico();
        servico.setPreco(100.0);
        System.out.println("O valor do servico é R$ " + servico.getPreco() + " reais");
        System.out.println("Preço final R$ " + servico.calcularPrecoTotal(5) + " reais.");
    }
}

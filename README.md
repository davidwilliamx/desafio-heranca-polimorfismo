# Desafio Alura Heranca e Polimorfismo

Vamos explorar os fundamentos das interfaces no Java. Em uma interface, todos os métodos são automaticamente públicos, eliminando a necessidade da palavra reservada public em suas declarações. Além disso, assim como na herança, é possível aplicar o polimorfismo por meio de interfaces, proporcionando flexibilidade e coesão no código.

Para fixar melhor seu aprendizado, propomos uma lista de atividades práticas (não obrigatórias). Prontos para colocar esse conhecimento em prática?

1. Crie uma classe `br.com.david.atividade.conversormoeda.ConversorMoeda` que implementa uma interface `br.com.david.atividade.conversormoeda.ConversaoFinanceira` com o método `converterDolarParaReal()` para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.

2. Crie uma classe `CalculadoraSalaRetangular` que implementa uma interface `CalculoGeometrico` com os métodos `calcularArea()` e `calcularPerimetro()` para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.

3. Crie uma classe `TabuadaMultiplicacao` que implementa uma interface `Tabuada` com o método `mostrarTabuada()` para exibir a tabuada de um número. A classe deve receber o número como parâmetro.

4. Crie uma interface `ConversorTemperatura` com os métodos `celsiusParaFahrenheit()` e `fahrenheitParaCelsius()`. Implemente uma classe `ConversorTemperaturaPadrao` que implementa essa interface com as fórmulas de conversão e exibe os resultados.

5. Crie uma interface `br.com.david.atividade.livros.Calculavel` com um método double `calcularPrecoFinal()`. Implemente essa interface nas classes `br.com.david.atividade.livros.Livro` e `br.com.david.atividade.livros.ProdutoFisico`, cada uma retornando o preço final considerando descontos ou taxas adicionais.

6. Crie uma interface `Vendavel` com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes `br.com.david.atividade.produtos.Produto` e `Servico`, cada uma fornecendo a sua própria lógica de cálculo de preço.

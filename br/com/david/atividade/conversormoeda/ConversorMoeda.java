package br.com.david.atividade.conversormoeda;

public class ConversorMoeda implements ConversaoFinanceira {
    public double converterDolarParaReal(double dolar) {
        return dolar * 5.156;
    }
}

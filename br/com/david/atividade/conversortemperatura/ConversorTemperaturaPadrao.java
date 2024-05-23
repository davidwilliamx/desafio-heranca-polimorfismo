package br.com.david.atividade.conversortemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public double celsiusParaFahrenheit(double celsius) {
        return Math.ceil(celsius * 1.8 + 32);
    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        return Math.ceil((fahrenheit - 32) / 1.8);
    }
}

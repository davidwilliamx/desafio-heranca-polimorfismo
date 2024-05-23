package br.com.david.atividade.tabuada;

public class TabuadaMultiplicacao implements Tabuada{

    public int mostrarTabuada(int num) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        return num;
    }
}

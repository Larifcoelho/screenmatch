package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;


    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Movie m) {
//        this.tempoTotal += m.getDuracaoEmMinutos();
//
//    }
//    public void inclui (Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }
//
//}
        public void inclui (Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
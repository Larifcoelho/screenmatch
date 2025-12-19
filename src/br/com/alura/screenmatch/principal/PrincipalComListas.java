package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Movie meuFilme = new Movie("LariLand", 2025);
    Serie lost = new Serie("Lost", 2000);
    Movie outroFilme = new Movie("Nerve", 2014);
    var filmeDaLari = new Movie("Boo, Bitch", 2022);

    ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDaLari);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println(item);
}
    }
    }
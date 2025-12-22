package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {

        Movie meuFilme = new Movie("LariLand", 2025);
        meuFilme.avalia(10);
        Movie outroFilme = new Movie("Nerve", 2014);
        outroFilme.avalia(9);
        var filmeDaLari = new Movie("Boo, Bitch", 2022);
        filmeDaLari.avalia(6);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDaLari);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println(item.getName());
            if (item instanceof Movie filme && filme.getClassificacao() > 2 ) {
                System.out.println("Classificação em estrelas " + filme.getClassificacao());

            }
        }
        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Adam Sandler");
        buscaPorArtistas.add("Selena Gomez");
        buscaPorArtistas.add("Marina Ruy Barbosa");
        buscaPorArtistas.add("Cauã Reymond");
        System.out.println(buscaPorArtistas);

        Collections.sort(buscaPorArtistas);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtistas);
        System.out.println("Lista de títulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);

    }
}
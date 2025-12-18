import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Movie meuFilme = new Movie();
        meuFilme.setName( "LariLand");
        meuFilme.setAnoDeLancamento(2025);
        meuFilme.setDuracaoEmMinutos (180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
       // meuFilme.somaAvaliacoes = 10;
        // meuFilme.totalDeAvaliacoes= 1;
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setName("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Movie outroFilme = new Movie();
        outroFilme.setName( "Nerve");
        outroFilme.setAnoDeLancamento(2014);
        outroFilme.setDuracaoEmMinutos (200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui (meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie((lost));
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDaLari = new Movie();
        filmeDaLari.setDuracaoEmMinutos(200);
        filmeDaLari.setName(" Boo, Bitch ");
        filmeDaLari.setAnoDeLancamento(2022);
        filmeDaLari.avalia(10);

        ArrayList<Movie> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDaLari);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getName());
        System.out.println(listaDeFilmes);

    }




}
package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Movie extends Titulo implements Classificavel {
    private String diretor;


    public Movie(String name, int anoDeLancamento) {
        super(name, anoDeLancamento);
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        // se pegaMedia() retorna double e você quer dividir por 2 e então truncar:
        return (int) (pegaMedia() / 2);}

        @Override
                public String toString() {
            return "Filme: " + this.getName() + "(" + this.getAnoDeLancamento()+ ")";
        }
    }

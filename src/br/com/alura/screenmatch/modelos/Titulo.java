package br.com.alura.screenmatch.modelos;

public class Titulo {

        private String name;
        private int anoDeLancamento;
        private boolean incluidoNoPlano;
        private double somaAvaliacoes;
        private int TotalDeAvaliacoes;
        private int duracaoEmMinutos;

        public boolean isIncluidoNoPlano() {
            return incluidoNoPlano;
        }

        public String getName() {
            return name;
        }

        public int getAnoDeLancamento() {
            return anoDeLancamento;
        }

        public int getDuracaoEmMinutos() {
            return duracaoEmMinutos;
        }

        public int getTotalDeAvaliacoes(){
            return TotalDeAvaliacoes;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAnoDeLancamento(int anoDeLancamento) {
            this.anoDeLancamento = anoDeLancamento;
        }

        public void setIncluidoNoPlano(boolean incluidoNoPlano) {
            this.incluidoNoPlano = incluidoNoPlano;
        }

        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }

        public void exibeFichaTecnica() {
            System.out.println("Nome do Filme: " + name);
            System.out.println("Ano de Lançamento: " + anoDeLancamento);
        }

        public void avalia(double nota){
            somaAvaliacoes += nota;
            TotalDeAvaliacoes ++;
        }

        public double pegaMedia(){
            return somaAvaliacoes / TotalDeAvaliacoes;
        }
    }



package br.com.cineapp.model;

public class Filme {

    private String nome;
    private String genero;
    private int duracao;
    private int anoLancamento;
    
    public Filme (){
        this.nome = "";
        this.genero = "";
        this.duracao = 0;
        this.anoLancamento = 0;
    }

    public Filme(String nome, String genero, int duracao, int anoLancamento) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }   
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    
}

package br.com.bandtec.projeto01;

public class Fruta {

    private String nome;
    private Double preco;

    public Fruta(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

}

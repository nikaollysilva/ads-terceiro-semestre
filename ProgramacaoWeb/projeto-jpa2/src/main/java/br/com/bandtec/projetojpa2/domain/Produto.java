package br.com.bandtec.projetojpa2.domain;

import javax.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codProduto;

    @Column(nullable = false, length = 38)
    private String nome;

    @Column(nullable = false, length = 10)
    private String unidade;

    public Produto() {
    }

    public Produto(String nome, String unidade, Double preco) {
        this.nome = nome;
        this.unidade = unidade;
        this.preco = preco;
    }

    @Column(name = "preco_produto")
    private Double preco;

    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

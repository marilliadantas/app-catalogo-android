package com.example.apploja;

public class Produto {
    private String nome;
    private String descricao;
    private String preco;
    private int imagem;

    public Produto(String nome, String descricao, String preco, int imagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPreco() {
        return preco;
    }

    public int getImagem() {
        return imagem;
    }
}
package com.exemplo.demo.entities;

public class Produto {
    private  long id;
    private String nome;
    private double preco;
    private Departamento departamento;

    public Produto() {
    }

    public Produto(long id, String nome, double preco, Departamento departamento) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.departamento = departamento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}

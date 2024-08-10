// src/entity/Produto.java
package entity;

import entity.actions.interfaces.CalcularStrategy;
import entity.actions.interfaces.EstoqueStrategy;
import entity.actions.produto.BuscarProdutoPorCodigo;

public class Produto {
    private String codigo;
    private String nome;
    private double preco;
    private double quantidadeEstoque;
    private CalcularStrategy calcularStrategy;
    private EstoqueStrategy estoqueStrategy;

    public Produto(String codigo, String nome, double preco, double quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Produto() {
        this.estoqueStrategy = new BuscarProdutoPorCodigo();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(double quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double calcularValorTotal() {
        return calcularStrategy.calcularValorTotal(this);
    }

    public Produto buscarProdutoPorCodigo(String codigo) {
        return estoqueStrategy.buscarProdutoPorCodigo(codigo);
    }

    public void setCalcularStrategy(CalcularStrategy calcularStrategy) {
        this.calcularStrategy = calcularStrategy;
    }

    public void setEstoqueStrategy(EstoqueStrategy estoqueStrategy) {
        this.estoqueStrategy = estoqueStrategy;
    }
}
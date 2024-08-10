package entity;

public class Produto {
    private String codigo;
    private String nome;
    private double preco;
    private double quantidadeEstoque;

    public Produto(String codigo, String nome, double preco, double quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}

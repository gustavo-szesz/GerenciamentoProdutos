package entity;

import entity.actions.venda.CalcularValorTotalVenda;
import entity.actions.venda.ImprimirDetalhesVenda;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    List<Produto> produtosVendidos = new ArrayList<>();
    CalcularValorTotalVenda calcularValorTotalVenda = new CalcularValorTotalVenda(this);
    ImprimirDetalhesVenda imprimirDetalhesVenda = new ImprimirDetalhesVenda(this);


    public void adicionarProdutoVendido(Produto produto) {
        produtosVendidos.add(produto);
    }

    public List<Produto> getProdutosVendidos() {
        return produtosVendidos;
    }

    public double calcularValorTotalVenda() {
        return calcularValorTotalVenda.calcularValorTotalVenda(produtosVendidos);
    }
    public String imprimirDetalhesVenda(Produto produto) {
        return imprimirDetalhesVenda.imprimirDetalhesVenda(produto);
    }

}

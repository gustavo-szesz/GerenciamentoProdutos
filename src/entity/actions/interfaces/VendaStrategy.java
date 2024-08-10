package entity.actions.interfaces;

import entity.Produto;

import java.util.List;

public interface VendaStrategy {
    double calcularValorTotalVenda(List<Produto> produtos);
    void adicionarProdutoVendido(Produto produto);
    String imprimirDetalhesVenda(Produto produto);
}

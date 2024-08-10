package entity;

import entity.actions.estoque.AdicionarProduto;
import entity.actions.interfaces.EstoqueStrategy;

import java.util.List;

public class Estoque {
    private List<Produto> produtos;
    private EstoqueStrategy estoqueStrategy;

    public Estoque(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto) {
        estoqueStrategy.adicionarProduto(produto);
    }
}

package entity.actions.interfaces;

import entity.Produto;

import java.util.List;

public interface EstoqueStrategy {
    void adicionarProduto(Produto produto);
    Produto buscarProdutoPorCodigo(String codigo);
}

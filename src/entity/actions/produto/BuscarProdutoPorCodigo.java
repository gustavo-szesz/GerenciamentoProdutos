package entity.actions.produto;

import entity.Produto;
import entity.actions.interfaces.EstoqueStrategy;

public class BuscarProdutoPorCodigo implements EstoqueStrategy {
    @Override
    public void adicionarProduto(Produto produto) {
        throw new UnsupportedOperationException("Metodo não suportado nessa classe");
    }

    // Descobrir como fazer o retorno do produto
    @Override
    public Produto buscarProdutoPorCodigo(String codigo) {
        System.out.println("Produto encontrado com sucesso!");
        return new Produto("000", "ProdutoExemplo", 10, 2);
    }
}

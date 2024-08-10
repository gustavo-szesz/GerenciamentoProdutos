package entity.actions.estoque;

import entity.Produto;
import entity.actions.interfaces.EstoqueStrategy;

import java.util.List;

public class AdicionarProduto implements EstoqueStrategy {
    @Override
    public void adicionarProduto(Produto produtos) {
        System.out.println("Produto adicionado com sucesso!");
    }

    @Override
    public Produto buscarProdutoPorCodigo(String codigo) {
        throw new UnsupportedOperationException("Metodo não suportado nessa classe");
    }
}

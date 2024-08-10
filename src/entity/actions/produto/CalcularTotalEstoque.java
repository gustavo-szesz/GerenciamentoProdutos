package entity.actions.produto;

import entity.Produto;
import entity.actions.interfaces.CalcularStrategy;

public class CalcularTotalEstoque implements CalcularStrategy {
    @Override
    public double calcularValorTotal(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto cannot be null");
        }
        return produto.getPreco() * produto.getQuantidadeEstoque();
    }
}

package entity.actions;

import entity.Produto;

public class CalcularTotal implements Calcular {
    private Produto produto;

    public CalcularTotal(Produto produto) {
        this.produto = produto;
    }

    @Override
    public double calcularValorTotal() {
        return produto.getPreco() * produto.getQuantidadeEstoque();
    }

}

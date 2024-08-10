package entity.actions.venda;

import entity.Produto;
import entity.Venda;
import entity.actions.interfaces.VendaStrategy;

import java.util.List;

public class CalcularValorTotalVenda implements VendaStrategy {
    private Venda venda;

    public CalcularValorTotalVenda(Venda venda) {
        this.venda = venda;
    }

    @Override
    public double calcularValorTotalVenda(List<Produto> produtos) {
        double valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }

    @Override
    public void adicionarProdutoVendido(Produto produto) {
        throw new UnsupportedOperationException("Metodo não suportado nesta classe");
    }

    @Override
    public String imprimirDetalhesVenda(Produto produto) {
        throw new UnsupportedOperationException("Metodo não suportado nesta classe");
    }
}

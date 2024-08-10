package entity.actions.venda;

import entity.Produto;
import entity.Venda;
import entity.actions.interfaces.VendaStrategy;

import java.util.List;

public class ImprimirDetalhesVenda implements VendaStrategy {
    private Venda venda;

    public ImprimirDetalhesVenda(Venda venda) {
        this.venda = venda;
    }

    @Override
    public void adicionarProdutoVendido(Produto produto) {
        throw new UnsupportedOperationException("Metodo não suportado nesta classe");
    }

    @Override
    public double calcularValorTotalVenda(List<Produto> produtos) {
        throw new UnsupportedOperationException("Metodo não suportado nesta classe");
    }

    @Override
    public String imprimirDetalhesVenda(Produto produto) {
        return "Detalhes da venda: ";
    }
}

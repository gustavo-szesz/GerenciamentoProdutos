package entity.actions.venda;

import entity.Produto;
import entity.Venda;
import entity.actions.interfaces.VendaStrategy;

import java.util.List;

public class AdicionarProdutoVendido implements VendaStrategy {
    private Venda venda;

    public AdicionarProdutoVendido(Venda venda) {
        this.venda = venda;
    }

    @Override
    public void adicionarProdutoVendido(Produto produto) {
        venda.adicionarProdutoVendido(produto);
    }

    @Override
    public double calcularValorTotalVenda(List<Produto> produtos) {
        throw new UnsupportedOperationException("Metodo não suportado nesta classe");
    }

    @Override
    public String imprimirDetalhesVenda(Produto produto) {
        throw new UnsupportedOperationException("Metodo não suportado nesta classe");
    }

}

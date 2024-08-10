package entity;

import entity.actions.gerenciador.RegistrarVenda;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorVendas {
    List<Venda> vendas = new ArrayList<>();
    RegistrarVenda registrarVenda = new RegistrarVenda();

    public void registrarVenda(Venda venda) {
        registrarVenda.registrarVenda(venda);
    }
    public List<Venda> getVendas() {
        return vendas;
    }
}

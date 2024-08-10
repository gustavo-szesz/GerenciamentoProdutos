package entity.actions.gerenciador;

import entity.Produto;
import entity.Venda;
import entity.actions.interfaces.GerenciadorStategy;

public class RegistrarVenda implements GerenciadorStategy {
    @Override
    public void registrarVenda(Venda venda) {
        System.out.println("Venda registrada com sucesso!");
    }
}

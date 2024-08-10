package entity.actions.interfaces;

import entity.Produto;

import java.util.List;

public interface CalcularStrategy {
    public double calcularValorTotal(Produto produto);
}

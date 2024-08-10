package tests;
import entity.Produto;
import entity.actions.interfaces.CalcularStrategy;
import entity.actions.produto.CalcularTotalEstoque;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    @Test
    void testCalcularValorTotal() {
        CalcularTotalEstoque calcularStrategy = new CalcularTotalEstoque();
        Produto produto = new Produto("001", "Produto A", 10.0, 5);
        produto.setCalcularStrategy(calcularStrategy);
        double valorTotal = produto.calcularValorTotal();
        System.out.println("Valor Total: " + valorTotal);
        assertEquals(50.0, valorTotal);
    }

//    @Test
//    void testBuscarProdutoPorCodigo() {
//        EstoqueStrategy estoqueStrategy = codigo -> new Produto("002", "Produto B", 20.0, 3);
//        Produto produto = new Produto("002", "Produto B", 20.0, 3);
//        produto.setEstoqueStrategy(estoqueStrategy);
//        assertEquals("002", produto.buscarProdutoPorCodigo("002").getCodigo());
//    }
}
import entity.Produto;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Codigo do produto: ");
        String codigo = scanner.nextLine();

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preco dos produtos: ");
        double preco = Double.parseDouble(scanner.nextLine());

        System.out.print("Quantidade de estoque: ");
        double quantidadeEstoque = Double.parseDouble(scanner.nextLine());

        Produto produto = new Produto(codigo, nome, preco, quantidadeEstoque);

        System.out.println("Código: " + produto.getCodigo());
        System.out.println("Sistema de Gerenciamento de produtos, TESTE");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());





    }
}
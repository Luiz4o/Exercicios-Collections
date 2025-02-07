package luiz.henrique.set.ordenacao;

import java.util.Scanner;

public class MenuCadastroProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroProdutos cadastro = new CadastroProdutos();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Exibir Produtos por Nome");
            System.out.println("3 - Exibir Produtos por Preço");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    long codigo = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();

                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();

                    cadastro.adicionarProduto(codigo, nome, preco, quantidade);
                    break;

                case 2:
                    System.out.println("\nProdutos ordenados por nome:");
                    cadastro.exibirProdutosPorNome();
                    break;

                case 3:
                    System.out.println("\nProdutos ordenados por preço:");
                    cadastro.exibirPorPreco();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}

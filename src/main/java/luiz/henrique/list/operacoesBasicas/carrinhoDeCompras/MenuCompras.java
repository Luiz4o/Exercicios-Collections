package luiz.henrique.list.operacoesBasicas.carrinhoDeCompras;

import java.util.Scanner;

public class MenuCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        while (true) {
            System.out.println("====== Menu de Carrinho de Compras ======");
            System.out.println("1. Adicionar item ao carrinho");
            System.out.println("2. Remover item do carrinho");
            System.out.println("3. Exibir itens no carrinho");
            System.out.println("4. Calcular valor total");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do item: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do item: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    carrinho.adicionarItem(nome, preco, quantidade);
                    break;

                case 2:
                    System.out.print("Digite o nome do item para remover: ");
                    String nomeRemover = scanner.nextLine();
                    carrinho.removerItem(nomeRemover);
                    break;

                case 3:
                    carrinho.exibirItens();
                    break;

                case 4:
                    carrinho.calcularValorTotal();
                    break;

                case 5:
                    System.out.println("Finalizando a compra!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

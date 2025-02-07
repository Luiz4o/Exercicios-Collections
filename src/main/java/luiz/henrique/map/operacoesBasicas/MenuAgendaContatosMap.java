package luiz.henrique.map.operacoesBasicas;

import java.util.Scanner;

public class MenuAgendaContatosMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendaContatos agenda = new AgendaContatos();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Remover Contato");
            System.out.println("3 - Exibir Contatos");
            System.out.println("4 - Pesquisar Contato por Nome");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Telefone: ");
                    int telefone = scanner.nextInt();

                    agenda.adicionarContato(nome, telefone);
                    System.out.println("Contato adicionado!");
                    break;

                case 2:
                    System.out.print("Nome do contato a remover: ");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;

                case 3:
                    System.out.println("\nLista de Contatos:");
                    agenda.exibirContatos();
                    break;

                case 4:
                    System.out.print("Nome do contato a pesquisar: ");
                    String nomePesquisar = scanner.nextLine();
                    agenda.pesquisarPorNome(nomePesquisar);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}

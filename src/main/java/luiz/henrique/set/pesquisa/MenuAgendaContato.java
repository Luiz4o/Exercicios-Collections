package luiz.henrique.set.pesquisa;

import java.util.Scanner;

public class MenuAgendaContato {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== Menu Agenda de Contatos =====");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Exibir contatos");
            System.out.println("3. Pesquisar contato por nome");
            System.out.println("4. Atualizar número de contato");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o número do contato: ");
                    int numero = scanner.nextInt();
                    agenda.adicionarContator(nome, numero);
                    break;
                case 2:
                    agenda.exibirContatos();
                    break;
                case 3:
                    System.out.print("Digite o nome para pesquisa: ");
                    String nomePesquisa = scanner.nextLine();
                    agenda.pesquisarPorNome(nomePesquisa);
                    break;
                case 4:
                    System.out.print("Digite o nome do contato a ser atualizado: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Digite o novo número: ");
                    int novoNumero = scanner.nextInt();
                    agenda.atualizarNumeroContato(nomeAtualizar, novoNumero);
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}

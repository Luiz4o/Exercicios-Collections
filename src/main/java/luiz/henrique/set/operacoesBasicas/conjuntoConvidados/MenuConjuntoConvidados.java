package luiz.henrique.set.operacoesBasicas.conjuntoConvidados;

import java.util.Scanner;

public class MenuConjuntoConvidados {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== Menu Conjunto de Convidados =====");
            System.out.println("1. Adicionar convidado");
            System.out.println("2. Remover convidado pelo código do convite");
            System.out.println("3. Contar convidados");
            System.out.println("4. Exibir convidados");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do convidado: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o código do convite: ");
                    Long convite = scanner.nextLong();
                    conjuntoConvidados.adicionarConvidado(nome, convite);
                    System.out.println("Convidado adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o código do convite para remover: ");
                    Long codigoRemover = scanner.nextLong();
                    conjuntoConvidados.removePorCodigoConvite(codigoRemover);
                    System.out.println("Convidado removido (se existia)!");
                    break;
                case 3:
                    System.out.println("Número total de convidados: " + conjuntoConvidados.contarConvidados());
                    break;
                case 4:
                    conjuntoConvidados.exibirConvidados();
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

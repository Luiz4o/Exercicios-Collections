package luiz.henrique.set.operacoesBasicas.conjuntoPalavrasUnicas;

import java.util.Scanner;

public class MenuConjuntoPalavrasUnicas {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== Menu Palavras Únicas =====");
            System.out.println("1. Adicionar palavra");
            System.out.println("2. Remover palavra");
            System.out.println("3. Encontrar palavra");
            System.out.println("4. Exibir palavras únicas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a palavra: ");
                    String palavraAdicionar = scanner.nextLine();
                    conjuntoPalavras.adicionarConvidado(palavraAdicionar);
                    break;
                case 2:
                    System.out.print("Digite a palavra a ser removida: ");
                    String palavraRemover = scanner.nextLine();
                    conjuntoPalavras.removerPalavra(palavraRemover);
                    break;
                case 3:
                    System.out.print("Digite a palavra a ser encontrada: ");
                    String palavraEncontrar = scanner.nextLine();
                    conjuntoPalavras.encontrarPalavra(palavraEncontrar);
                    break;
                case 4:
                    System.out.println("====== Palavras Únicas ======");
                    conjuntoPalavras.exibirPalavrasUnicas();
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

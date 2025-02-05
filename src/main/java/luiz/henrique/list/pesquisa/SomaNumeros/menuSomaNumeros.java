package luiz.henrique.list.pesquisa.SomaNumeros;

import java.util.Scanner;

public class menuSomaNumeros {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== Menu Soma de Números =====");
            System.out.println("1. Adicionar número");
            System.out.println("2. Calcular soma");
            System.out.println("3. Encontrar maior número");
            System.out.println("4. Encontrar menor número");
            System.out.println("5. Exibir números");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número: ");
                    int numero = scanner.nextInt();
                    somaNumeros.adicionarNumero(numero);
                    System.out.println("Número adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Soma dos números: " + somaNumeros.calcularSoma());
                    break;
                case 3:
                    System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
                    break;
                case 4:
                    try {
                        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
                    } catch (RuntimeException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 5:
                    somaNumeros.exibirNumeros();
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}

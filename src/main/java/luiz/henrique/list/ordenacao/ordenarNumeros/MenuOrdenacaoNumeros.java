package luiz.henrique.list.ordenacao.ordenarNumeros;

import luiz.henrique.list.pesquisa.SomaNumeros.SomaNumeros;

import java.util.Scanner;

public class MenuOrdenacaoNumeros {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== Menu Ordenação Números =====");
            System.out.println("1. Adicionar número");
            System.out.println("2. Ordenar Crescente");
            System.out.println("3. Ordenar Decrescente");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número: ");
                    int numero = scanner.nextInt();
                    ordenacaoNumeros.adicionarNumero(numero);
                    System.out.println("Número adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Ordem Crescente: " + ordenacaoNumeros.ordenarCrescente());
                    break;
                case 3:
                    System.out.println("Ordem Descrescente: " + ordenacaoNumeros.ordenarDecrescente());
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}



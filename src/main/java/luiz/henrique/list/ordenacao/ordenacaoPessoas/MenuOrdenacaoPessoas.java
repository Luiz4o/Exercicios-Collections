package luiz.henrique.list.ordenacao.ordenacaoPessoas;

import java.util.List;
import java.util.Scanner;

public class MenuOrdenacaoPessoas {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== Ordenação de Pessoas =====");
            System.out.println("1. Adicionar pessoa");
            System.out.println("2. Ordenar por idade");
            System.out.println("3. Ordenar por altura");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da pessoa: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade da pessoa: ");
                    int idade = scanner.nextInt();
                    System.out.print("Digite a altura da pessoa (em metros): ");
                    double altura = scanner.nextDouble();
                    ordenacaoPessoas.adicionarPessoa(nome, idade, altura);
                    System.out.println("Pessoa adicionada com sucesso!");
                    break;
                case 2:
                    List<Pessoa> pessoasPorIdade = ordenacaoPessoas.ordenarPorIdade();
                    if (pessoasPorIdade.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {
                        pessoasPorIdade.forEach(System.out::println);
                    }
                    break;
                case 3:
                    List<Pessoa> pessoasPorAltura = ordenacaoPessoas.ordenarPorAltura();
                    if (pessoasPorAltura.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {
                        pessoasPorAltura.forEach(System.out::println);
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}

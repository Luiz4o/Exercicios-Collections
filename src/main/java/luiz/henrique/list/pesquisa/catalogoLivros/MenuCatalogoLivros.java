package luiz.henrique.list.pesquisa.catalogoLivros;

import java.util.List;
import java.util.Scanner;

public class MenuCatalogoLivros {

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== Catálogo de Livros =====");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Pesquisar por autor");
            System.out.println("3. Pesquisar por intervalo de anos");
            System.out.println("4. Pesquisar por título");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o ano de publicação: ");
                    int anoPublicacao = scanner.nextInt();
                    catalogo.adicionarLivro(titulo, autor, anoPublicacao);
                    System.out.println("Livro adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o nome do autor: ");
                    String autorPesquisa = scanner.nextLine();
                    List<Livro> livrosAutor = catalogo.pesquisarPorAutor(autorPesquisa);
                    if (livrosAutor.isEmpty()) {
                        System.out.println("Nenhum livro encontrado para este autor.");
                    } else {
                        livrosAutor.forEach(System.out::println);
                    }
                    break;
                case 3:
                    System.out.print("Digite o ano inicial: ");
                    int anoInicial = scanner.nextInt();
                    System.out.print("Digite o ano final: ");
                    int anoFinal = scanner.nextInt();
                    List<Livro> livrosPorAno = catalogo.pesquisarPorIntervaloAnos(anoInicial, anoFinal);
                    if (livrosPorAno.isEmpty()) {
                        System.out.println("Nenhum livro encontrado neste intervalo de anos.");
                    } else {
                        livrosPorAno.forEach(System.out::println);
                    }
                    break;
                case 4:
                    System.out.print("Digite o título do livro: ");
                    String tituloPesquisa = scanner.nextLine();
                    Livro livroEncontrado = catalogo.pesquisarPorTitulo(tituloPesquisa);
                    if (livroEncontrado == null) {
                        System.out.println("Livro não encontrado.");
                    } else {
                        System.out.println(livroEncontrado);
                    }
                    break;
                case 5:
                    System.out.println("Saindo da livraria Online...");
                    break;
                default:
                    System.out.println("Não temos esta opção, tenta novamento!");
            }
        } while (opcao != 5);

        scanner.close();
    }


}

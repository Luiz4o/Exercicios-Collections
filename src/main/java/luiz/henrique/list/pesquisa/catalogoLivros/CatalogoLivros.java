package luiz.henrique.list.pesquisa.catalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosIntervalo = new ArrayList<>();

        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosIntervalo.add(l);
                }
            }
        }

        return livrosIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    return l;
                }
            }
        }

        return null;
    }

}

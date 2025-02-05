package luiz.henrique.list.pesquisa.catalogoLivros;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    @Override
    public String toString() {
        return String.format("""
                ====== Livro ======
                Titulo : %s
                Autor : %s
                Ano de Publicação : %d
                """, titulo, autor, anoPublicacao);
    }
}

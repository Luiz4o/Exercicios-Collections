package luiz.henrique.set.pesquisa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class Contato {
    private String nome;
    private int numero;

    @Override
    public String toString() {
        return  String.format("""
                ====== Contato ======
                Nome : %s
                Numero : %d
                """, nome, numero);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return getNumero() == contato.getNumero();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumero());
    }
}

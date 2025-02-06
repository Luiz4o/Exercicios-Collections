package luiz.henrique.set.operacoesBasicas.conjuntoConvidados;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@AllArgsConstructor
@Getter
public class Convidado {
    private String nome;
    private Long id_convite;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return Objects.equals(getId_convite(), convidado.getId_convite());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId_convite());
    }

    @Override
    public String toString() {
        return String.format("""
                ====== Convidado ======
                Nome : %s
                Convite : %d
                """, this.nome, this.id_convite);
    }
}

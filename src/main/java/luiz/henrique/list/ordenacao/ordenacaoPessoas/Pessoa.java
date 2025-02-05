package luiz.henrique.list.ordenacao.ordenacaoPessoas;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Comparator;

@AllArgsConstructor
@Getter
public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    @Override
    public String toString() {
        return String.format("""
                ======= Pessoa =======
                Nome : %s
                Idade : %d
                Altura : %.2f
                """,nome,idade,altura);
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(this.idade, p.idade );
    }
}
class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}

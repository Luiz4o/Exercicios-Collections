package luiz.henrique.set.operacoesBasicas.conjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas(){
        this.palavras = new HashSet<String>();
    }

    public void adicionarConvidado(String palavra){
        palavras.add(palavra);
        System.out.println("====== Palavra adcionada com sucesso ======");

    }

    public void removerPalavra(String palavra){
        boolean palavraEncontrada = false;
        for(String p : palavras){
            if(p.equalsIgnoreCase(palavra)){
                palavras.remove(p);
                palavraEncontrada = true;
                break;
            }
        }
        if(palavraEncontrada) {
            System.out.println("====== Palavra removida com sucesso ======");
        } else{
            System.out.println("====== Palavra não encontrada ======");
        }
    }

    public void encontrarPalavra(String palavra){
        boolean palavraEncontrada = false;
        for(String p : palavras){
            if(p.equalsIgnoreCase(palavra)){
                palavraEncontrada = true;
                break;
            }
        }

        if(palavraEncontrada) {
            System.out.println("====== Palavra Encontrada com sucesso ======");
        } else{
            System.out.println("====== Palavra não encontrada ======");
        }

    }

    public void exibirPalavrasUnicas(){
        palavras.forEach( p -> {
            System.out.println(p);
        });
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavrasUnicas that)) return false;
        return Objects.equals(palavras, that.palavras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palavras);
    }
}

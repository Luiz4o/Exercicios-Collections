package luiz.henrique.set.operacoesBasicas.conjuntoConvidados;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, Long convite){
        this.convidados.add(new Convidado(nome, convite));
    }

    public void removePorCodigoConvite(Long convite){
        Convidado convidadoParaRemover = null;

        for(Convidado c : convidados){
            if(c.getId_convite() == convite){
                convidadoParaRemover = c;
                break;
            }
        }

        convidados.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public  void exibirConvidados(){
        if(convidados.isEmpty()){
            System.out.println("Não a convidados!");
        }

        convidados.forEach( convidado -> System.out.println(convidado));
    }


}

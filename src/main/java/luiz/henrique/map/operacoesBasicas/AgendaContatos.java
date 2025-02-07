package luiz.henrique.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone){
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(contatos.containsKey(nome)){
            contatos.remove(nome);
            System.out.println("====== Contato removido ======");
        }else{
            System.out.println("====== Contato não encontrado ======");
        }


    }

    public void exibirContatos(){
        System.out.println(contatos);
    }

    public void pesquisarPorNome(String nome){
        if(contatos.containsValue(nome)){

            System.out.println("====== Número do contato ======");
            System.out.println(contatos.get(nome));
        }else{
            System.out.println("====== Contato não encontrado ======");
        }
    }
}

package luiz.henrique.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos(){
        contatos = new HashSet<>();
    }

    public void adicionarContator(String nome, int numero){
        int tamanho = contatos.size();
        contatos.add(new Contato(nome,numero));
        if (tamanho == contatos.size()){
            System.out.println("====== Houve um erro ao adicionar o contato ======");
        }else {
            System.out.println("====== Contato adicionado ======");
        }
    }

    public void exibirContatos(){
        if(contatos.isEmpty()){
            System.out.println("Lista de contatos Vazia");
        } else {
            contatos.forEach(System.out::println);
        }

    }

    public void pesquisarPorNome(String nome){
        Set<Contato> contatosEncontrados = new HashSet<>();

        for(Contato c : contatos){
            if(c.getNome().startsWith(nome)){
                contatosEncontrados.add(c);
            }
        }

        if(contatosEncontrados.isEmpty()){
            System.out.println("Contato não encontrado");
        } else {
            contatosEncontrados.forEach(System.out::println);
        }
    }

    public void atualizarNumeroContato(String nome,int numero){
        Contato contatoAtualizado = null;

        for(Contato c : contatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }

        System.out.printf("""
                ====== Contato Atualizado ======
                %s
                """, contatoAtualizado.toString());
    }
}

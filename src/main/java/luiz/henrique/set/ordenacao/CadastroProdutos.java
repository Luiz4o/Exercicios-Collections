package luiz.henrique.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos(){
        produtos = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade ){
        int tamanho = produtos.size();
        produtos.add(new Produto(nome,codigo,preco,quantidade));
        if (tamanho == produtos.size()){
            System.out.println("====== Houve um erro ao adicionar um produto ======");
        }else {
            System.out.println("====== Produto adicionado ======");
        }
    }

    public void exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        produtosPorNome.forEach(System.out::println);
    }

    public void exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);
        produtosPorPreco.forEach(System.out::println);
    }
}

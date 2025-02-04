package luiz.henrique.list.operacoesBasicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinho;

    public void adicionarItem(String nome, double preco, int quantidade){
        if(carrinho ==  null){
            carrinho = new ArrayList<>();
        }

        carrinho.add(new Item(nome,preco,quantidade));
        System.out.println("""
                =============================================
                ====== Item adicionado ao seu carrinho ======
                =============================================""");
    }

    public void removerItem(String nome){
        boolean itemRemovido = false;

        for (Item item : carrinho) {
            if (item.getNome().equals(nome)) {
                carrinho.remove(item);
                System.out.printf("""
                        =========================================
                        ====== %s removido do seu carrinho ======
                        =========================================
                        """, nome);
                itemRemovido = true;
                break;
            }
        }

        if(!itemRemovido) System.out.println("""
                ===========================================
                ====== Item informado não encontrado ======
                ===========================================
                """);

    }

    public void calcularValorTotal(){
        double valorTotal = 0;

        for (Item item : carrinho){
            valorTotal += item.getPreco() * item.getQuantidade();
        }

        System.out.printf("""
                ===================================================
                ====== O valor total da compra foi : R$ %.2f ======
                ===================================================
                """, valorTotal);
    }

    public void exibirItens(){
        for (Item item : carrinho){
            System.out.printf(
                            """
                                =====================
                                Item  : %s
                                Preço : %.2f
                                Quantidade : %d
                                =====================
                                
                            """, item.getNome(), item.getPreco(), item.getQuantidade()
            );
        }
    }
}

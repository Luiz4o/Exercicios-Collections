package luiz.henrique.list.operacoesBasicas.carrinhoDeCompras;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Item {
    private String nome;
    private double preco;
    private int quantidade;
}

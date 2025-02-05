package luiz.henrique.list.ordenacao.ordenarNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros implements Comparator<Integer> {
    private List<Integer> numeros;

    public OrdenacaoNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public List<Integer> ordenarCrescente(){

        List<Integer> numerosCrescentes = new ArrayList<>(numeros);

        Collections.sort(numerosCrescentes);

        return numerosCrescentes;
    }

    public List<Integer> ordenarDecrescente(){

        List<Integer> numerosDecrescentes = new ArrayList<>(numeros);

        Collections.sort(numerosDecrescentes);
        Collections.reverse(numerosDecrescentes);

        return numerosDecrescentes;
    }

    @Override
    public int compare(Integer n1, Integer n2) {
        return Integer.compare(n1,n2);
    }

}

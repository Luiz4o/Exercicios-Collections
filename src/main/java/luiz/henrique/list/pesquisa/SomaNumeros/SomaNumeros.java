package luiz.henrique.list.pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int somaTotal = 0;

        for(Integer n: numeros){
            somaTotal += n;
        }

        return somaTotal;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        for(Integer n : numeros){
            if(n > maiorNumero) maiorNumero = n;
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        if(this.numeros.isEmpty()){
            throw new RuntimeException("Lista vazia!");
        }

        int menorNumero = numeros.get(0);
        for(Integer n : numeros){
            if(n < menorNumero) menorNumero = n;
        }

        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.printf("""
                ====== Lista de números ======
                """);
        numeros.forEach(n -> {
            System.out.print(n + " - ");
        });
    }

}

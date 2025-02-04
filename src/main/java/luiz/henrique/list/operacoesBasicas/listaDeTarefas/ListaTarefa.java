package luiz.henrique.list.operacoesBasicas.listaDeTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTarefa {
    private List<Tarefa> tarefas;

    public ListaTarefa(){
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefas(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public  boolean removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        if(tarefasParaRemover.isEmpty()){
            return false;
        }
        tarefas.removeAll(tarefasParaRemover);
        return true;

    }

    public int obterTotalTarefas(){
        return  tarefas.size();
    }

    public void obeterDescricoesTarefas(){
        for (Tarefa t : tarefas) {
            System.out.printf("""
                    ==================================
                    ====== Tarefa : %s
                    ==================================
                    """,t.getDescricao());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaTarefa listaTarefas = new ListaTarefa();

        do {
            System.out.println("""
                           =============================
                           ====== Menu de Tarefas ======
                           =============================
                           """);
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Obter total de tarefas");
            System.out.println("4. Exibir descrições das tarefas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consome a nova linha deixada pelo nextInt()

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    listaTarefas.adicionarTarefas(descricao);
                    System.out.println("Tarefa adicionada!");
                    break;

                case 2:
                    System.out.print("Digite a descrição da tarefa para remover: ");
                    String descricaoRemover = scanner.nextLine();
                    if(listaTarefas.removerTarefa(descricaoRemover)){
                        System.out.println("""
                                =========================================
                                ====== Tarefa removida com Sucesso ======
                                =========================================
                                """);
                    }else {
                        System.out.println("""
                                ============================================
                                ====== Tarefa removida, se encontrada ======
                                ============================================
                                """);
                    }
                    break;

                case 3:
                    System.out.println("Total de tarefas: " + listaTarefas.obterTotalTarefas());
                    break;

                case 4:
                    listaTarefas.obeterDescricoesTarefas();
                    break;

                case 5:
                    System.out.println("Saindo do sistema. Obrigado por usar!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while(true);
    }
}

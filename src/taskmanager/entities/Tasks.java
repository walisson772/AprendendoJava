package taskmanager.entities;

import com.sun.source.doctree.SinceTree;

import java.util.List;

public class Tasks {
    private String tarefas;
    private Integer id;

    public Tasks(){
    }

    public Tasks(Integer id,String tarefas){
        this.id = id;
        this.tarefas = tarefas;
    }

    public Integer getId(){
        return id;
    }

    public String getTarefas(){
        return tarefas;
    }

    public void setTarefas (String tarefa){
        this.tarefas = tarefa;
    }

    public void opcoes(){
        System.out.println("\n========= Gerenciador de Tarefas =========");
        System.out.println("1 - Adicionar uma tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Marcar tarefa como concluída");
        System.out.println("4 - Sair");
        System.out.println("==========================================");
    }
    public void listTarefas(List list){
        for (Object tarefa : list){
            System.out.println(tarefa);
        }
    }

    public String toString(){
        return id+" " + tarefas;
    }
}

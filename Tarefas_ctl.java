import java.util.ArrayList;

public class Tarefas_ctl {
    private ArquivoTarefas arqTarefas;
    private ArquivoCategorias arqCategorias;

    public Tarefas_ctl(ArquivoTarefas arqTarefas, ArquivoCategorias arqCategorias) {
        this.arqTarefas = arqTarefas;
        this.arqCategorias = arqCategorias;
    }

    public boolean adicionarTarefa(Tarefa tarefa) throws Exception {
        arqTarefas.create(tarefa);
        return true; 
    }

    public boolean atualizarTarefa(Tarefa tarefa) throws Exception{
        return arqTarefas.update(tarefa);
    }

    public boolean excluirTarefa(int idTarefa) throws Exception {
        return arqTarefas.delete(idTarefa);
    }

    public ArrayList<Tarefa> getTarefas() throws Exception {
        return arqTarefas.getTarefas();
    }

    public ArrayList<Categoria> getCategorias() throws Exception {
        return arqCategorias.getCategorias();
    }
}


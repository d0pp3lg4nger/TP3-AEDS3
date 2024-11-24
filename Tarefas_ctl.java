import java.util.ArrayList;

public class Tarefas_ctl {
    private ArquivoTarefas arqTarefas;
    private ArquivoCategorias arqCategorias;
    private ArquivoRotulos arqRotulos;

    public Tarefas_ctl(ArquivoTarefas arqTarefas, ArquivoCategorias arqCategorias, ArquivoRotulos arqRotulos) {
        this.arqTarefas = arqTarefas;
        this.arqCategorias = arqCategorias;
        this.arqRotulos = arqRotulos;
    }

    public boolean adicionarTarefa(Tarefa tarefa, ArrayList<Integer> rotulos) throws Exception {
        arqTarefas.create(tarefa);
        arqTarefas.createN(tarefa.getId(), rotulos);
        return true;
    }

    public boolean atualizarTarefa(Tarefa tarefa, ArrayList<Integer> rotulos) throws Exception {
        boolean b = arqTarefas.update(tarefa);
        arqTarefas.updateN(tarefa.getId(), rotulos);
        return b;

    }

    public boolean excluirTarefa(int idTarefa) throws Exception {
        boolean b = arqTarefas.delete(idTarefa);
        arqTarefas.deleteN(idTarefa);
        return b;
    }

    public ArrayList<Integer> getRotulosId(int idTarefa) throws Exception {
        return arqTarefas.getN(idTarefa);
    }

    public Tarefa getTarefaByID(int id) throws Exception {
        return arqTarefas.read(id);
    }

    public ArrayList<Tarefa> getTarefas() throws Exception {
        return arqTarefas.getTarefas();
    }

    public ArrayList<Categoria> getCategorias() throws Exception {
        return arqCategorias.getCategorias();
    }

    public ArrayList<Rotulo> geRotulos() throws Exception {
        return arqRotulos.getRotulos();
    }
}

import aed3.Arquivo;
import aed3.ArvoreBMais;

public class ArquivoRotulo extends Arquivo<Rotulo> {
    private ArvoreBMais<Rotulo> arvoreRotulo;

    public ArquivoRotulo(Constructor<Rotulo> construtor, String nomeArquivo) throws Exception {
        arvoreRotulo = new ArvoreBMais<>(construtor, 5, nomeArquivo);
    }
}

import java.text.MessageFormat;

public class Mentoria extends Conteudo{

    public Mentoria(String titulo, String descricao) {
        super(titulo, descricao);
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return MessageFormat.format("\nMentoria: {0}\nDescrição: {1}\n=============", getTitulo(), getDescricao());
    }
}
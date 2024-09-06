import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private List<Musica> musicas;

    public Album(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public String getNome() {
        return nome;
    }
}

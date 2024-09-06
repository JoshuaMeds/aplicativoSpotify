import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void verMusicas() {
        if (musicas.isEmpty()) {
            System.out.println("Playlist vazia!");
        } else {
            for (Musica musica : musicas) {
                System.out.println(musica);
            }
        }
    }

    public String getNome() {
        return nome;
    }
}

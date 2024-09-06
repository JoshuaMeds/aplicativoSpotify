import java.util.ArrayList;
import java.util.List;

public class Ouvinte {
    private String nome;
    private List<Playlist> playlists;

    public Ouvinte(String nome) {
        this.nome = nome;
        this.playlists = new ArrayList<>();
    }

    public void criarPlaylist(String nome) {
        playlists.add(new Playlist(nome));
    }

    public void verPlaylists() {
        if (playlists.isEmpty()) {
            System.out.println("Nenhuma playlist criada!");
        } else {
            for (Playlist playlist : playlists) {
                System.out.println(playlist.getNome());
            }
        }
    }

    public Playlist getPlaylist(String nome) {
        for (Playlist playlist : playlists) {
            if (playlist.getNome().equalsIgnoreCase(nome)) {
                return playlist;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }
}

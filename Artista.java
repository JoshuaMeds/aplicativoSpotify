import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Artista {
    private String nome;
    private List<Album> albuns;

    public Artista(String nome) {
        this.nome = nome;
        this.albuns = new ArrayList<>();
    }

    public void criarMusica(String nomeMusica, int duracao) {
        Musica novaMusica = new Musica(nomeMusica, nome, duracao);
        if (albuns.isEmpty()) {
            System.out.println("Nenhum álbum encontrado! Crie um álbum primeiro.");
        } else {
            albuns.get(albuns.size() - 1).adicionarMusica(novaMusica); // Adiciona à última álbum criado
            System.out.println("Musica " + nomeMusica + " criada e adicionada ao álbum " + albuns.get(albuns.size() - 1).getNome() + ".");
        }
    }

    public void criarAlbum(String nome) {
        albuns.add(new Album(nome));
        System.out.println("Álbum " + nome + " criado.");
    }

    public int gerarQuantidadeOuvintes() {
        return new Random().nextInt(10000) + 1;
    }

    public String getNome() {
        return nome;
    }
}

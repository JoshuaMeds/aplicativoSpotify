public class Musica {
    private String nome;
    private String artista;
    private int duracao; // em segundos

    public Musica(String nome, String artista, int duracao) {
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return nome + " - " + artista + " (" + duracao + "s)";
    }
}

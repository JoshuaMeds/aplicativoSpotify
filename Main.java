import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Ouvinte> ouvintes = new ArrayList<>();
        List<Artista> artistas = new ArrayList<>();
        Ouvinte ouvinteAtual = null;
        Artista artistaAtual = null;
        int opcao;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Criar Playlist");
            System.out.println("3 - Ver Playlists");
            System.out.println("4 - Adicionar Musica a playlist");
            System.out.println("5 - Área do Artista");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome o newline

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do ouvinte: ");
                    String nomeOuvinte = scanner.nextLine();
                    ouvinteAtual = new Ouvinte(nomeOuvinte);
                    ouvintes.add(ouvinteAtual);
                    System.out.print("Digite o nome do artista: ");
                    String nomeArtista = scanner.nextLine();
                    artistaAtual = new Artista(nomeArtista);
                    artistas.add(artistaAtual);
                    System.out.println("Cadastrado com sucesso!");
                    break;
                case 2:
                    if (ouvinteAtual != null) {
                        System.out.print("Digite o nome da playlist: ");
                        String nomePlaylist = scanner.nextLine();
                        ouvinteAtual.criarPlaylist(nomePlaylist);
                        System.out.println("Playlist criada com sucesso!");
                    } else {
                        System.out.println("Nenhum ouvinte cadastrado!");
                    }
                    break;
                case 3:
                    if (ouvinteAtual != null) {
                        ouvinteAtual.verPlaylists();
                    } else {
                        System.out.println("Nenhum ouvinte cadastrado!");
                    }
                    break;
                case 4:
                    if (ouvinteAtual != null && artistaAtual != null) {
                        System.out.println("1 - Criar musica");
                        System.out.println("2 - Ver quantidade de ouvintes");
                        System.out.println("0 - Sair");
                        int opcaoSubMenu = scanner.nextInt();
                        scanner.nextLine(); // Consome o newline
                        switch (opcaoSubMenu) {
                            case 1:
                                System.out.print("Digite o nome da musica: ");
                                String nomeMusica = scanner.nextLine();
                                System.out.print("Digite a duração da musica (em segundos): ");
                                int duracao = scanner.nextInt();
                                artistaAtual.criarMusica(nomeMusica, duracao);
                                break;
                            case 2:
                                int quantidadeOuvintes = artistaAtual.gerarQuantidadeOuvintes();
                                System.out.println("Quantidade de ouvintes: " + quantidadeOuvintes);
                                break;
                            case 0:
                                System.out.println("Saindo...");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    } else {
                        System.out.println("Nenhum ouvinte ou artista cadastrado!");
                    }
                    break;
                case 5:
                    if (artistaAtual != null) {
                        System.out.print("Digite o nome do álbum: ");
                        String nomeAlbum = scanner.nextLine();
                        artistaAtual.criarAlbum(nomeAlbum);
                    } else {
                        System.out.println("Nenhum artista cadastrado!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

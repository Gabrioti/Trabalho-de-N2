import java.util.Scanner;

public class Jogo {
    private Jogador jogador;
    private Sala mosteiro, entrada, corredor, salaRisada, tenda, salaSilencio, escritorioAbel, palco, camarim;


    public void inicializarSalas() {
        mosteiro = new Sala("Mosteiro", "O antigo mosteiro onde o santuário foi construído, agora em ruínas.");
        entrada = new Sala("Entrada", "Você está na entrada do mosteiro, um lugar sombrio e misterioso.");
        corredor = new Sala("Corredor", "Um corredor escuro com paredes cobertas de musgo.");
        salaRisada = new Sala("Sala dos Espelhos", "Uma sala cheia de espelhos que distorcem sua imagem e emitem risadas assustadoras.");
        tenda = new Sala("Tenda", "Uma tenda antiga onde um enigma espera por você.");
        salaSilencio = new Sala("Sala do Silêncio", "Uma sala onde o silêncio é absoluto, e qualquer som pode ser fatal.");
        escritorioAbel = new Sala("Escritório do Abel", "O escritório do antigo zelador, cheio de papéis e segredos.");
        palco = new Sala("Palco", "Um palco abandonado onde eventos estranhos acontecem à noite.");
        camarim = new Sala("Quarto Abandonado", "Um quarto abandonado com móveis antigos e uma sensação de tristeza.");

        mosteiro.adicionarConexao("sul", entrada);

        entrada.adicionarConexao("norte", mosteiro);
        entrada.adicionarConexao("sul", corredor);

        corredor.adicionarConexao("norte", entrada);
        corredor.adicionarConexao("sul", salaSilencio);
        corredor.adicionarConexao("leste", tenda);
        corredor.adicionarConexao("oeste", salaRisada);

        salaRisada.adicionarConexao("leste", corredor);

        salaSilencio.adicionarConexao("norte", corredor);

        tenda.adicionarConexao("norte", escritorioAbel);
        tenda.adicionarConexao("leste", palco);
        tenda.adicionarConexao("oeste", corredor);

        escritorioAbel.adicionarConexao("sul", tenda);

        palco.adicionarConexao("oeste", tenda);
        palco.adicionarConexao("sul", camarim);

        camarim.adicionarConexao("norte", palco);

        // Adicione enigmas e itens às salas conforme necessário.


    }

    public void iniciar() {
        inicializarSalas();
        jogador = new Jogador(mosteiro);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Circo Digital!");
        System.out.println(jogador.getSalaAtual().getDescricao());
        while (true) {
            System.out.print("> ");
            String comando = scanner.nextLine().trim().toLowerCase();
            if (comando.equals("sair")) {
                System.out.println("Saindo do jogo...");
                break;
            }
            processarComando(comando);
        }
        scanner.close();
    }

    private void processarComando(String comando) {
        if (comando.equals("norte") || comando.equals("sul") || comando.equals("leste") || comando.equals("oeste")) {
            mover(comando);
        } else if (comando.equals("olhar")) {
            Art.mostrarImagemSala(jogador.getSalaAtual());
            System.out.println(jogador.getSalaAtual().getDescricao());
        } else if (comando.equals("inventario")) {
            if (jogador.getInventario().isEmpty()) {
                System.out.println("Seu inventário está vazio.");
            } else {
                System.out.println("Inventário:");
                for (Item item : jogador.getInventario()) {
                    System.out.println("- " + item.getNome() + ": " + item.getDescricao());
                }
            }
        } else if (comando.equals("mapa")) {
            if (jogador.possuiItem("Mapa Antigo")) {
                exibirMapa();
            } else {
                System.out.println("Você não possui nenhum mapa.");
            }
        } else {
            System.out.println("Comando desconhecido.");
        }
    }

    private void mover(String direcao) {
        Sala proximaSala = jogador.getSalaAtual().getConexao(direcao);
        if (proximaSala != null) {
            jogador.setSalaAtual(proximaSala);
            Art.mostrarImagemSala(proximaSala);
            System.out.println(proximaSala.getDescricao());
        } else {
            System.out.println("Não é possível ir nessa direção.");
        }
    }

    private void exibirMapa() {
        System.out.println("Mapa das salas visitadas:");
        for (Sala sala : jogador.getSalasVisitadas()) {
            System.out.println("* " + sala.getNome());
        }
    }

    public static void main(String[] args) {
        new Jogo().iniciar();
    }
}

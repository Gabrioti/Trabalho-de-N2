import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Sala {
    private String nome;
    private String descricao;
    private Map<String, Sala> conexoes;
    private List<Item> itens;
    private Enigma enigma;

    public Sala(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.conexoes = new HashMap<>();
        this.itens = new ArrayList<>();
        this.enigma = null;
    }

    public void adicionarConexao(String direcao, Sala sala) {
        conexoes.put(direcao, sala);
    }

    public Sala getConexao(String direcao) {
        return conexoes.get(direcao);
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    public Enigma getEnigma() {
        return enigma;
    }

    public void setEnigma(Enigma enigma) {
        this.enigma = enigma;
    }
}

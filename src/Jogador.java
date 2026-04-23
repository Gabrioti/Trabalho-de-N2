import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private Sala salaAtual;
    private List<Item> inventario;
    private Set<Sala> salasVisitadas;

    public Jogador(Sala salaInicial) {
        this.salaAtual = salaInicial;
        this.inventario = new ArrayList<>();
        this.salasVisitadas = new HashSet<>();
        this.salasVisitadas.add(salaInicial);
    }

    public Sala getSalaAtual() {
        return salaAtual;
    }

    public void setSalaAtual(Sala sala) {
        this.salaAtual = sala;
        this.salasVisitadas.add(sala);
    }

    public List<Item> getInventario() {
        return inventario;
    }

    public void adicionarItem(Item item) {
        inventario.add(item);
    }

    public void removerItem(Item item) {
        inventario.remove(item);
    }

    public boolean possuiItem(String nomeItem) {
        return inventario.stream().anyMatch(item -> item.getNome().equalsIgnoreCase(nomeItem));
    }

    public Set<Sala> getSalasVisitadas() {
        return salasVisitadas;
    }
}

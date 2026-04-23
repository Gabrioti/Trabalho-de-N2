public class Enigma {
    private String descricao;
    private boolean resolvido;

    public Enigma(String descricao) {
        this.descricao = descricao;
        this.resolvido = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isResolvido() {
        return resolvido;
    }

    public void resolver() {
        this.resolvido = true;
    }
}

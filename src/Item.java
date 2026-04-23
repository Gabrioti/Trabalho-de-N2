public class Item {
    private String nome;
    private String descricao;
    private boolean podeSerUsado;
    private String efeito;

    public Item(String nome, String descricao, boolean podeSerUsado, String efeito) {
        this.nome = nome;
        this.descricao = descricao;
        this.podeSerUsado = podeSerUsado;
        this.efeito = efeito;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isPodeSerUsado() {
        return podeSerUsado;
    }

    public String getEfeito() {
        return efeito;
    }
}

public abstract class Produto {
    private String nome;
    private int Preco;
    private String dataValidade;

    public Produto(String nome, int preco, String dataValidade) {
        this.nome = nome;
        Preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return Preco;
    }

    public void setPreco(int preco) {
        Preco = preco;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public abstract String toString();
}

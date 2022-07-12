public class Shampoo extends Produto {
    private int irritabilidade;

    public Shampoo(String nome, int preco, String dataValidade, int irritabilidade) {
        super(nome, preco, dataValidade);
        this.irritabilidade = irritabilidade;
    }

    public int getIrritabilidade() {
        return irritabilidade;
    }

    public void setIrritabilidade(int irritabilidade) {
        this.irritabilidade = irritabilidade;
    }


    @Override
    public String toString() {
        return "Produto: " + getNome() + ", Preço: " + getPreco() + ", Data de Validade: " + getDataValidade() + ", " +
                "Irritabilidade: " + getIrritabilidade();
    }
}

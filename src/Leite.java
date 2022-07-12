public class Leite extends Produto {
    private int diasAteVencimento;

    public Leite(String nome, int preco, String dataValidade, int diasAteVencimento) {
        super(nome, preco, dataValidade);
        this.diasAteVencimento = diasAteVencimento;
    }

    public int getDiasAteVencimento() {
        return diasAteVencimento;
    }

    public void setDiasAteVencimento(int diasAteVencimento) {
        this.diasAteVencimento = diasAteVencimento;
    }
    @Override
    public String toString() {
        return "Produto: " + getNome() + ", Preço: " + getPreco() + ", Data de Validade: " + getDataValidade() + ", Dias até vencimento: " + getDiasAteVencimento();
    }
}
public class Biscoito extends Produto{
    private int componentesCancerigenos;

    public Biscoito(String nome, int preco, String dataValidade, int componentesCancerigenos) {
        super(nome, preco, dataValidade);
        this.componentesCancerigenos = componentesCancerigenos;
    }

    public int getComponentesCancerigenos() {
        return componentesCancerigenos;
    }

    public void setComponentesCancerigenos(int componentesCancerigenos) {
        this.componentesCancerigenos = componentesCancerigenos;
    }
    @Override
    public String toString() {
        return "Produto: " + getNome() + ", Preço: " + getPreco() + ", Data de Validade: " + getDataValidade() + ", Componentes Cancerigenos: " + getComponentesCancerigenos();
    }
}


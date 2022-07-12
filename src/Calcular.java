import java.util.List;

public class Calcular {

    public double media(List<? extends Produto> list) {
        double soma = 0;
        for (Produto itens : list) {
            soma += itens.getPreco();
        }
        return soma / list.size();
    }

    public double custoBeneficio(List<? extends Produto> list) {
        double menor = 0;
        for (Produto itens : list) {
            menor = itens.getPreco();
            if (itens.getPreco() < menor) {
                menor = itens.getPreco();
            }
        }
        return menor;
    }
}

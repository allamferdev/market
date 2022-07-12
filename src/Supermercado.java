import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    public static void main(String[] args) {

        List<Shampoo> shampooList = new ArrayList<>();
        shampooList.add(new Shampoo("Dove", 10, "10/05/2021", 20));
        shampooList.add(new Shampoo("Clear", 11, "10/04/2021", 2));
        shampooList.add(new Shampoo("Johnsons", 7, "10/02/2021", 32));
        List<Biscoito> biscoitoList = new ArrayList<>();
        biscoitoList.add(new Biscoito("Oreo",20,"05/06/2022",11));
        biscoitoList.add(new Biscoito("Toddy",4,"05/02/2022",15));
        biscoitoList.add(new Biscoito("Nescau",18,"05/01/2022",20));
        List<Leite> leiteList = new ArrayList<>();
        leiteList.add(new Leite("Itambe", 9, "20/01/2023", 2));
        leiteList.add(new Leite("Campos", 13, "20/01/2023", 6));
        leiteList.add(new Leite("Italac", 16, "20/01/2023", 1));

        Calcular cl = new Calcular();
        System.out.println(cl.media(shampooList));
        System.out.println(cl.custoBeneficio(shampooList));
    }
}

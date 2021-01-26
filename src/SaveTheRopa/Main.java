package SaveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        GuardaRopa wardrobe = new GuardaRopa();
        Prenda firstClothing = new Prenda("Legacy", "Polo 2020");
        Prenda secondClothing = new Prenda("Nike", "Barcelona Home Jersey 2021");
        List<Prenda> clothes = new ArrayList<Prenda>();
        clothes.add(firstClothing);
        clothes.add(secondClothing);
        int assignedNumber = wardrobe.guardarPrendas(clothes);
        wardrobe.mostrarPrendas();
        List<Prenda> fromWardrobe = wardrobe.devolverPrendas(assignedNumber);
    }
}

package SaveTheRopa;

import java.util.HashMap;
import java.util.List;

public class GuardaRopa {
    int contador;
    HashMap<Integer, List<Prenda>> diccionario;

    public GuardaRopa() {
        this.contador = 0;
        this.diccionario = new HashMap<>();
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public HashMap<Integer, List<Prenda>> getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(HashMap<Integer, List<Prenda>> diccionario) {
        this.diccionario = diccionario;
    }
    public Integer guardarPrendas(List<Prenda> listaDePrenda){
        Integer asignedNumber = this.contador;
        this.diccionario.put(asignedNumber, listaDePrenda);
        this.contador++;
        return asignedNumber;
    }
    public void mostrarPrendas(){
        System.out.println("Guardaropas...");
        this.diccionario.forEach((k,v) -> {
            System.out.println("********");
            System.out.println("Key: " + k);
            for (Prenda prenda : v) {
                System.out.println(prenda.toString());
            }
            System.out.println("********");
        });
    }
    public List<Prenda> devolverPrendas(Integer numero){
        if(this.diccionario.containsKey(numero)){
            List<Prenda> clothes = this.diccionario.get(numero);
            this.diccionario.remove(numero);
            return clothes;
        } else {
            return null;
        }
    }
}

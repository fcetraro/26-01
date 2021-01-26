package MarteGroupSA;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static Guest simpleGuest = new Guest("Pedro");
    static Guest anotherSimpleGuest = new Guest("Mario");
    static Guest meliGuest = new MeliGuest("Federico");
    static Guest anotherMeliGuest = new MeliGuest("Roberto");

    static FireworkType volcanFirework = new Firework("Volcan");
    static FireworkType tortaFirework = new Firework("Torta");
    static FireworkType petardoFirework = new Firework("Petardo");

    public static void main(String[] args)
    {
        Party legrand = new Party("Centenario de “La Chiqui” Legrand");

        legrand.addGuest(simpleGuest);
        legrand.addGuest(anotherSimpleGuest);
        legrand.addGuest(meliGuest);
        legrand.addGuest(anotherMeliGuest);

        List<FireworkType> fireworks = new ArrayList<>();
        fireworks.add(volcanFirework);
        fireworks.add(tortaFirework);
        FireworkType pack = new FireworkPack(fireworks);

        legrand.addFirework(petardoFirework);
        legrand.addFirework(pack);
        legrand.addFirework(petardoFirework);

        legrand.blowOutTheCandles();
    }
}


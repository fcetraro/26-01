package MarteGroupSA;

import java.util.ArrayList;
import java.util.List;

public class Party {
    FireworkPack fireworks;
    List<Guest> guests;
    String name;

    public Party(String name) {
        this.fireworks = new FireworkPack();
        this.guests = new ArrayList<>();
        this.name = name;
    }

    public void addGuest(Guest newGuest){
        guests.add(newGuest);
    }
    public void addFirework(FireworkType firework){
        fireworks.addFireworkType(firework);
    }
    private void giveCakeToGuests(){
        for (Guest g: guests) {
            g.eatCake();
        }
    }
    public void blowOutTheCandles(){
        System.out.println("Se soplaron las velas en la fiesta: "+name);
        fireworks.explode();
        giveCakeToGuests();
    }
}

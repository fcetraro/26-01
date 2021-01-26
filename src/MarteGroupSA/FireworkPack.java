package MarteGroupSA;

import java.util.ArrayList;
import java.util.List;

public class FireworkPack implements FireworkType {
    List<FireworkType> fireworks;

    public FireworkPack() {
        this.fireworks = new ArrayList<>();
    }

    public FireworkPack(List<FireworkType> fireworks) {
        this.fireworks = fireworks;
    }

    public List<FireworkType> getFireworks() {
        return fireworks;
    }

    public void setFireworks(List<FireworkType> fireworks) {
        this.fireworks = fireworks;
    }

    public void addFireworkType(FireworkType firework){
        this.fireworks.add(firework);
    }

    @Override
    public void explode() {
        for (FireworkType firework: fireworks) {
            firework.explode();
        }
    }

    @Override
    public void print() {
        System.out.println("Printing pack!");
        for (FireworkType firework: fireworks) {
            firework.print();
        }
        System.out.println("End printing pack!");
    }
}

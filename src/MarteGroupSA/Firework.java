package MarteGroupSA;

public class Firework implements FireworkType{
    String name;

    public Firework(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void explode() {
        System.out.println("* Exploto el fuego articial "+name+ "! *");
    }

    @Override
    public void print() {
        System.out.println("Fuego artificial: "+name);
    }
}

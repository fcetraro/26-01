package MarteGroupSA;

public class MeliGuest extends Guest {

    public MeliGuest(String name) {
        super(name);
    }

    @Override
    public void eatCake() {
        super.eatCake();
        System.out.println("Viva la Chiqui!!");
    }
}

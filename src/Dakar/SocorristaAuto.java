package Dakar;

public class SocorristaAuto implements Socorrista{
    @Override
    public void socorrer(Vehiculo vehicle) {
        try{
            Auto car = (Auto) vehicle;
            socorrer(car);
        } catch (Exception e){
            System.out.println("Socorrista incorrecto");
        }
    }
    private void socorrer(Auto car) {
        System.out.println("Socorriendo auto: "+ car.patente);
    }
}

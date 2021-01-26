package Dakar;

public class SocorristaMoto implements Socorrista{
    @Override
    public void socorrer(Vehiculo vehicle) {
        try{
            Moto motorBike = (Moto) vehicle;
            socorrer(motorBike);
        } catch (Exception e){
            System.out.println("Socorrista incorrecto");
        }
    }
    private void socorrer(Moto motorBike) {
        System.out.println("Socorriendo moto: "+ motorBike.patente);
    }
}

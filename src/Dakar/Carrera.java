package Dakar;

import java.util.List;

public class Carrera {
    int distancia, premioEnDolares, cantidadDeVehiculosPermitidos;
    String nombre;
    List<Vehiculo> vehiculos;
    Socorrista carGuard = new SocorristaAuto();
    Socorrista motorBikeGuard = new SocorristaMoto();

    public Carrera(int distancia, int premioEnDolares, int cantidadDeVehiculosPermitidos, String nombre, List<Vehiculo> vehiculos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.nombre = nombre;
        this.vehiculos = vehiculos;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getPremioEnDolares() {
        return premioEnDolares;
    }

    public void setPremioEnDolares(int premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public int getCantidadDeVehiculosPermitidos() {
        return cantidadDeVehiculosPermitidos;
    }

    public void setCantidadDeVehiculosPermitidos(int cantidadDeVehiculosPermitidos) {
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    private boolean checkAvailability(){
        return cantidadDeVehiculosPermitidos>vehiculos.size();
    }
    private void addVehicleIfPossible(Vehiculo vehicle){
        if(checkAvailability()) this.vehiculos.add(vehicle);
    }
    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    public void darDeAltaAuto(int velocidad, int aceleracion, int anguloDeGiro, String patente){
        Vehiculo newCar = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
        addVehicleIfPossible(newCar);
    }
    public void darDeAltaMoto(int velocidad, int aceleracion, int anguloDeGiro, String patente){
        Vehiculo newMotorBike = new Moto(velocidad, aceleracion, anguloDeGiro, patente);
        addVehicleIfPossible(newMotorBike);
    }
    public void eliminarVehiculo(Vehiculo vehiculo){
        for (int i = 0; i < this.vehiculos.size(); i++) {
            if(this.vehiculos.get(i).getPatente().equals(vehiculo.getPatente())){
                this.vehiculos.remove(i);
                break;
            }
        }
    }
    public void eliminarVehiculoConPatente(String unaPatente){
        Vehiculo vehicleToDelete = new Vehiculo(0,0,0,0,0,unaPatente);
        eliminarVehiculo(vehicleToDelete);
    }
    private Vehiculo getVehicle(String patente){
        for (Vehiculo v: vehiculos) {
            if(patente.equals(v.getPatente())){
                return v;
            }
        }
        return null;
    }
    public void socorrerAuto(String patente){
       carGuard.socorrer(getVehicle(patente));
    }
    public void socorrerMoto(String patente){
        motorBikeGuard.socorrer(getVehicle(patente));
    }
    public Vehiculo getWinner(){
        double maxScore=0;
        Vehiculo bestScoreVehicle = null;
        for (Vehiculo v: this.vehiculos){
            double vehicleScore = v.getScore();
            if(maxScore<vehicleScore){
                maxScore=vehicleScore;
                bestScoreVehicle=v;
            }
        }
        return bestScoreVehicle;
    }
}

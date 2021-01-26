package Dakar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Carrera newRace = new Carrera(10, 100, 3, "Dakar", new ArrayList<Vehiculo>());
        newRace.darDeAltaMoto(10,10,1,"bike");
        newRace.darDeAltaAuto(1000,1000,1,"carToWin");
        newRace.darDeAltaAuto(100,100,1,"car");
        newRace.darDeAltaAuto(10000,10000,1,"cantAdd");
        System.out.println(newRace.getWinner().getPatente());
        newRace.socorrerAuto("bike");
        newRace.socorrerMoto("bike");
        newRace.eliminarVehiculoConPatente("carToWin");
        newRace.darDeAltaAuto(10000,10000,1,"nowICanAdd");
        System.out.println(newRace.getWinner().getPatente());
    }
}

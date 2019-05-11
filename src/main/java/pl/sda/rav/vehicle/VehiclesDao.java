package pl.sda.rav.vehicle;

import java.util.ArrayList;
import java.util.Collections;

public class VehiclesDao {

    private ArrayList<Vehicle> listOfVehicle = new ArrayList<>();

    // getter i zabezpieczenie danych przez modyfikacją

    public ArrayList<Vehicle> getListOfVehicle() {
        ArrayList<Vehicle> list = new ArrayList<>(listOfVehicle);
        return listOfVehicle;
    }

    // dodawanie pojazdu wraz ze sprawdzeniem czy już istnieje w kolekcji;

    public void addVehicle (Vehicle vehicle) {

        if (isExist(listOfVehicle, vehicle) == false) {
            return;
        }
        listOfVehicle.add(vehicle);
    }

    // sortowanie które działa na zasadzie cmpareTo nadpisanej w klasie Vehicle!!!

    public void sortVehicles (ArrayList listOfVehicle) {
        Collections.sort(listOfVehicle);
    }

    public boolean isExist (ArrayList<Vehicle> listOfVehicle, Vehicle vehicle) {

        for (Vehicle v : listOfVehicle) {
            if (v.getVIN().equals(vehicle.VIN));
        } return false;
    }

    // wypisanie listy pojazdów z kolekcji

    public ArrayList<Vehicle> getVehicleList () {
        return listOfVehicle;
    }
}

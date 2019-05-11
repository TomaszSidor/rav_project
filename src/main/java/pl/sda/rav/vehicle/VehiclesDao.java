package pl.sda.rav.vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class VehiclesDao {

    private ArrayList<Vehicle> listOfVehicle = new ArrayList<>();

    // getter i zabezpieczenie danych przez modyfikacją

    public ArrayList<Vehicle> getListOfVehicle() {
        ArrayList<Vehicle> list = new ArrayList<>(listOfVehicle);
        return listOfVehicle;
    }

    public void addVehicle (Vehicle vehicle) {

        listOfVehicle.add(vehicle);
    }


    public void sortVehicle (ArrayList listOfVehicle) {
        Collections.sort(listOfVehicle);
    }

    public boolean isExist (ArrayList<Vehicle> listOfVehicle) {

        for (Vehicle vehicle : listOfVehicle) {
            if (vehicle.getVIN().equals(vehicle.VIN));
        } return false;
    }

    public ArrayList<Vehicle> getVehicleList () {

        return listOfVehicle;
    }




    //    public static Comparator<vehicle> vehiclesComparatorByYear = new Comparator<vehicle>() {
//        @Override
//        public int compare(vehicle v1, vehicle v2) {
//
//            Integer value1 = v1.getProductionDate().getYear();
//            Integer value2 = v2.getProductionDate().getYear();
//            value2.compareTo(value1);
//
//            return value2.compareTo(value1);
//
//        }
//    };
//
//
//    public static Comparator<vehicle> vehiclesComparatorByName = new Comparator<vehicle>() {
//        @Override
//        public int compare(vehicle v1, vehicle v2) {
//
//            String value1 = v1.getName();
//            String value2 = v2.getName();
//            value2.compareTo(value1);
//
//            return value2.compareTo(value1);
//
//        }
//    };
//
//    public void sortVehicles (ArrayList listOfVehicle) {
//
//        Collections.sort(listOfVehicle, vehiclesComparatorByName);
//        Collections.sort(listOfVehicle, vehiclesComparatorByYear);
//    }


}

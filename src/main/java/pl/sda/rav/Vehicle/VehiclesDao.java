package pl.sda.rav.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class VehiclesDao {

    ArrayList<Vehicle> listOfVehicle = new ArrayList<>();

    // getter
    public ArrayList<Vehicle> getListOfVehicle() {
        return listOfVehicle;
    }

    public void addVehicle (Vehicle vehicle) {

        listOfVehicle.add(vehicle);

    }

    public void sortVehicle (ArrayList listOfVehicle) {



    }




    //    public static Comparator<Vehicle> vehiclesComparatorByYear = new Comparator<Vehicle>() {
//        @Override
//        public int compare(Vehicle v1, Vehicle v2) {
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
//    public static Comparator<Vehicle> vehiclesComparatorByName = new Comparator<Vehicle>() {
//        @Override
//        public int compare(Vehicle v1, Vehicle v2) {
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

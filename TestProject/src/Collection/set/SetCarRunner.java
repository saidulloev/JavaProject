package Collection.set;


import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCarRunner {
    public static void main(String[] args) {

        Set<Cars> europeCars = new HashSet<>();
        europeCars.add(new Cars("Mercedes", "Benz", 25));
        europeCars.add(new Cars("Wolvswagen", "Golf", 15));
        europeCars.add(new Cars("Renault", "Logan", 50));
        europeCars.add(new Cars("Scoda", "Rapid", 35));
        europeCars.add(new Cars("Mercedes", "140w", 90));
        europeCars.add(new Cars("BMW", "M5", 70));
        europeCars.add(new Cars("Renault", "Logan", 50));

        Set<Cars> otherCars = new HashSet<>();
        otherCars.add(new Cars("Supra", "w120", 2530));
        otherCars.add(new Cars("Toyota", "Camry", 70));
        otherCars.add(new Cars("Kia", "Rio", 40));
        otherCars.add(new Cars("Shevrolet", "Camaru", 50));
        otherCars.add(new Cars("Lexus", "es350", 100));
        otherCars.add(new Cars("Scoda", "Rapid", 35));
        otherCars.add(new Cars("Huyndai", "elantra", 35));
        otherCars.add(new Cars("Mercedes", "Benz", 25));

        NavigableSet<Cars> uniqueCars = new TreeSet<>(europeCars);
        uniqueCars.addAll(otherCars);

//        print(uniqueCars);

        //разность
//        europeCars.removeAll(otherCars);
//        print(europeCars);

        //пересечение
//        europeCars.retainAll(otherCars);
//        print(europeCars);

        //симметричная разность
//        uniqueCars.removeAll(europeCars);

        print(uniqueCars);
        System.out.println("\nHigher");
        System.out.println(uniqueCars.higher(new Cars("Renault", "Logan", 50)));
        System.out.println("\nLower");
        System.out.println(uniqueCars.lower(new Cars("Renault", "Logan", 50)));
        System.out.println("\nCeiling");
        System.out.println(uniqueCars.ceiling(new Cars("Renault", "Logan", 51)));
        System.out.println("\nFloor");
        System.out.println(uniqueCars.floor(new Cars("Renault", "Logan", 49)));

    }

    private static void print(Set<Cars> cars) {
        System.out.printf("%-20s %-20s %-20s \n", "Car brand", "model car", "price per day");
        for (Cars car : cars) {
            System.out.printf("%-20s %-20s %-20s \n", car.getCarBrand(), car.getModel(), car.getPricePerDay());
        }
    }


}

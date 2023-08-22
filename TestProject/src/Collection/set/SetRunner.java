package Collection.set;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        String[] cars = {"Audi","Mercedes","Mini","Supra"};
        String[] otherCars = {"Opel","Toyota","Kia"};

        Integer[] arrayFirst = {2,4,1,6,7,7,8,9,0,-3,1,213,343,54};
        Integer[] arraySecond = {21,43,1,61,-9,0,8,2,4,5,1,33,65};

        Set<String> carsSet = new HashSet<>(Arrays.asList(cars));
        Set<String> otherCarsSet = new HashSet<>(Arrays.asList(otherCars));

        Set<String> uniqueSet = new HashSet<>(carsSet);
        uniqueSet.addAll(otherCarsSet);

        print(uniqueSet);

//        List<Integer> arrayFirstSet = new ArrayList<>(Arrays.asList(arrayFirst));
//        List<Integer> arraySecondSet = new ArrayList<>(Arrays.asList(arraySecond));
//
//        arrayFirstSet.addAll(arraySecondSet);
//        Collections.sort(arrayFirstSet);
//
//        Set<Integer> uniqueArraySet = new TreeSet<>(arrayFirstSet);
//
//        System.out.println(uniqueArraySet);

        Set<Integer> arrayFirstSet = new TreeSet<>(Arrays.asList(arrayFirst));
        Set<Integer> arraySecondSet = new TreeSet<>(Arrays.asList(arraySecond));

        arrayFirstSet.addAll(arraySecondSet);
        System.out.println(arrayFirstSet);
    }

    private static void print(Set<String> cars){
        System.out.println(cars);
    }

}

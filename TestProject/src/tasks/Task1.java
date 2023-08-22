package tasks;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        Integer[] mass = {1,2,3,4,5};

        List<Integer> list = new LinkedList<>(Arrays.asList(mass));
        list.add(2);

        mass = list.toArray(new Integer[list.size()]);
        for (Integer i: mass){
            System.out.println(i);
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Put your key");
        String key = scanner.nextLine();

        Map<String, String> countries = new HashMap<>();
        countries.put("Dushanbe", "Saidulloev");
        countries.put("Moscow", "Ivanov");
        countries.put("Berlin", "Thomas");
        countries.put("Madrid", "Niko");

//        System.out.println(countries.get(key));

        countries.remove(key);

        for (Map.Entry<String,String> i: countries.entrySet()){
            System.out.println(i);
        }
    }

}

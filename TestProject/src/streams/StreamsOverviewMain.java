package streams;

import lambdas.lambda_function_example.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsOverviewMain {

    private static List<Employee> employeeList = new ArrayList<>();
    private static List<Employee> secondList = new ArrayList<>();
    private static Map<Integer, Employee> mapEmployees = null;

    public static void main(String[] args) throws IOException {

        employeeList.add(new Employee(1, "Niko", "Kovac", 50000));
        employeeList.add(new Employee(2, "Alex", "Vidal", 25000));
        employeeList.add(new Employee(3, "Bob", "Joe", 75000));
        employeeList.add(new Employee(4, "Ivan", "Ivanov", 100000));
        employeeList.add(new Employee(5, "Bill", "johnson", 54000));
        employeeList.add(new Employee(6, "N'golo", "Kante", 43000));
        employeeList.add(new Employee(7, "Cristiano", "Ronaldo", 500000));
        employeeList.add(new Employee(8, "Lionel", "Messi", 250000));
        employeeList.add(new Employee(9, "Erling", "Haaland", 125000));
        employeeList.add(new Employee(10, "Killian", "Mbappe", 115000));
        employeeList.add(new Employee(11, "Marcus", "Rashford", 1000000));

        secondList.add(new Employee(19, "Niko", "Kovac", 50000));
        secondList.add(new Employee(28, "Alex", "Vidal", 25000));
        secondList.add(new Employee(37, "Bob", "Joe", 75000));
        secondList.add(new Employee(46, "Ivan", "Ivanov", 100000));
        secondList.add(new Employee(55, "Bill", "johnson", 54000));
        secondList.add(new Employee(64, "N'golo", "Kante", 43000));
        secondList.add(new Employee(73, "Cristiano", "Ronaldo", 500000));
        secondList.add(new Employee(82, "Lionel", "Messi", 250000));
        secondList.add(new Employee(91, "Erling", "Haaland", 125000));
        secondList.add(new Employee(13, "Killian", "Mbappe", 115000));
        secondList.add(new Employee(17, "Marcus", "Rashford", 1000000));

        testStreamFormList();
//        testStreamFormFile();


    }

    private static void testStreamFormList() {

        employeeList.stream()
                .filter(e -> e.getSalary() > 60000)
                .filter(e -> e.getId() < 8)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Integer[] ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Optional<Employee> first = Stream.of(ids)
                .map(StreamsOverviewMain::findById)
                .filter(Objects::nonNull)
                .findFirst();
        System.out.println(first);

        int sum = Stream.of(ids).map(StreamsOverviewMain::findById)
                .filter(Objects::nonNull)
                .mapToInt(Employee::getSalary)
                .sum();
        System.out.println(sum);

        Random randomNumber = new Random();
        Integer number = Stream.of(ids)
                .filter(i -> i % 2 == 0)
                .filter(i -> i % 3 == 0)
                .skip(2)
                .findFirst()
                .orElseGet(() -> randomNumber.nextInt(100));
        System.out.println(number);


        List<List<Employee>> departments = new ArrayList<>();
        departments.add(employeeList);
        departments.add(secondList);

//        departments.stream().flatMap(l -> l.stream().map(Employee::getFirstName)).forEach(System.out::println);

//        Consumer<Integer> consumer = e -> e = e * 2;
//                Stream.of(ids)
//                        .forEach(consumer);

    }

    private static void testStreamFormFile() throws IOException {

        Files.lines(Paths.get("src/words.txt"))
                .filter(e -> e.length() > 5)
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    private static Employee findById(int id) {
        if (mapEmployees == null) {
            mapEmployees = employeeList.stream().distinct()
                    .collect(Collectors.toMap(Employee::getId, e -> e));
        }
        return mapEmployees.get(id);
    }
}

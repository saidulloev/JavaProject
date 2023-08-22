package lambdas.lambda_function_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaFunctionExample {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Niko", "Kovac", 50000));
        employees.add(new Employee(2,"Alex", "Vidal", 25000));
        employees.add(new Employee(3,"Bob", "Joe", 75000));
        employees.add(new Employee(4,"Ivan", "Ivanov", 100000));

        List<Person> people = new ArrayList<>();
        people.add(new Person("Niko", "Kovac", 25));
        people.add(new Person("Alex", "Vidal", 19));
        people.add(new Person("Bob", "Joe", 30));
        people.add(new Person("Ivan", "Ivanov", 45));

        //Predicate
        System.out.println(findMatch(employees, e -> e.getSalary() > 50000));
        System.out.println(findMatch(people, e -> e.getAge() > 25));

        //Function
        System.out.println("Total salary = " + calcSum(employees, Employee::getSalary));
        System.out.println("Total age = " + calcSum(people, Person::getAge));

        //BiFunction
        BinaryOperator<Integer> combiner = Math::min;
        Integer zeroNumber = 100000;
        System.out.println(combine(employees, zeroNumber, Employee::getSalary, combiner));
        System.out.println(combine(people,zeroNumber, Person::getAge,combiner));

        employees.forEach(e -> e.setSalary(e.getSalary()*12/10));
        employees.forEach(System.out::println);
    }

    private static <T> T findMatch(List<T> elements, Predicate<T> predicateFunction) {
        for (T e : elements) {
            if (predicateFunction.test(e)) {
                return e;
            }
        }
        return null;
    }

    private static <T> int calcSum(List<T> elements, Function<T, Integer> function) {
        int sum = 0;
        for (T e : elements) {
            sum = sum + function.apply(e);
        }
        return sum;
    }

    private static <T, R> R combine(List<T> elements, R zeroNumber, Function<T, R> function, BinaryOperator<R> combiner) {
        for (T e : elements) {
            zeroNumber = combiner.apply(zeroNumber, function.apply(e));
        }
        return zeroNumber;
    }

}

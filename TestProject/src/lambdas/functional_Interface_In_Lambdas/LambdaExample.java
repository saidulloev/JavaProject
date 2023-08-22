package lambdas.functional_Interface_In_Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@FunctionalInterface
interface ElementsProcess<T extends Number> {
    double process(T elements1);
}

@FunctionalInterface
interface ExecutiveFunction {
    void process();
}

public class LambdaExample {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.4);
        doubleList.add(2.4);
        doubleList.add(3.9);
        doubleList.add(0.7);
        doubleList.add(1.46);

        processElements(intList, x -> Math.sin(x.doubleValue()));
        processElements(doubleList, x -> Math.sin(x.doubleValue()));

        TimeUtil.measure(() -> Arrays.sort(randomArray()));


    }

    private static <T extends Number> void processElements(List<T> list, ElementsProcess function) {
        List<Double> doubleList = new ArrayList<>();
        for (Number i : list)
            doubleList.add(function.process(i));
        System.out.println(doubleList);
    }

    private static double multiply(int x, int y) {
        return (x * y) / 10.0;
    }

    private static int[] randomArray() {
        int[] array = new int[100_000_000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
        return array;
    }

    public static class TimeUtil {
         static void measure(ExecutiveFunction function) {
            long start = System.currentTimeMillis();
            function.process();
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        }
    }
}

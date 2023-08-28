package test_arrayList_vs_linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        testTiming(arrayList);
        testTiming(linkedList);

    }

    private static void testTiming(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

}

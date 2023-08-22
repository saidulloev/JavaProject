package tasks;

import java.util.*;

public class Task2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input size Array1 ");
        int n = scanner.nextInt();
        Integer[] array1 = new Integer[n];
        for (int i=0; i<array1.length;i++){
            array1[i] = scanner.nextInt();
        }

        System.out.println("Input size Array2 ");
        int m = scanner.nextInt();
        Integer[] array2 = new Integer[m];
        for (int i=0; i<array2.length;i++){
            array2[i] = scanner.nextInt();
        }

        Set<Integer> arraySet1 = new HashSet<>(Arrays.asList(array1));
        Set<Integer> arraySet2 = new HashSet<>(Arrays.asList(array2));

        Set<Integer> uniqueSet = new HashSet<>(arraySet1);
        uniqueSet.addAll(arraySet2);

//        System.out.println(uniqueSet);

        List<Integer> sortUniqueSet = new ArrayList<>(uniqueSet);
        Collections.sort(sortUniqueSet);
        System.out.println("Sorting Unique Array: " + "\n" + sortUniqueSet);


    }
}

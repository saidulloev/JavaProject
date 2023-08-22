package Collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GradeBook {
    public static void main(String[] args) {
        int[][] gradesArray = {{212, 142, 321},
                {212, 132, 311},
                {265, 165, 312},
                {274, 153, 331},
                {2, -9441, 3},
                {232, 1321, 354},
                {92, 21, 423},
                {542, 165, 365}};

        System.out.println("Minimal grades = " + minCalc(gradesArray));

        System.out.println("Maximum grades = " + maxCalc(gradesArray));

        varArgs();

        processArrays();

        String[] colors = {"Black","White","Blue","Yellow"};

        List<String> linkedList = new LinkedList<>(Arrays.asList(colors));
        linkedList.add("Green");

        colors = linkedList.toArray(new String[linkedList.size()]);

        for (String i: colors){
            System.out.println(i);
        }

    }


    private static int minCalc(int[][] a) {
        int min = 1321;
        for (int[] row : a) {
            for (int i : row) {
                if (min > i) {
                    min = i;
                }
            }
        }
        return min;
    }

    private static int maxCalc(int[][] a) {
        int max = -9441;
        for (int[] row : a) {
            for (int i : row) {
                if (max < i) {
                    max = i;
                }
            }
        }
        return max;
    }

    private static void varArgs(){
        double a = 0.56;
        double b = 1.34;
        double c = 9.16;
        double d = 3.54;

        System.out.println("Average 2 numbers is " + avgCalc(a,b));
        System.out.println("Average 3 numbers is " + avgCalc(a,b,c));
        System.out.println("Average 4 numbers is " + avgCalc(a,b,c,d));

    }

    private static double avgCalc(double... args){
        double sum = 0;
        for (double i: args){
            sum = sum + i;
        }
        return sum/args.length;
    }

    private static void processArrays(){
        double[] doubleArray = {9.1,0.8,8.32,3.78,1.321};
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));

        int[] filledArray = new int[7];
        Arrays.fill(filledArray,7);
        System.out.println(Arrays.toString(filledArray));

        int[] Array = {1,2,3,4,5,6,7};
        int[] copyArray = new int[10];

        System.arraycopy(Array,0,copyArray,3,Array.length);
        System.out.println(Arrays.toString(copyArray));

    }




}

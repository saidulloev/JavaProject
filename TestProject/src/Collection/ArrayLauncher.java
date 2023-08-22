package Collection;

import java.util.Scanner;

public class ArrayLauncher {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int[] myArray = new int[5];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }

        int[] array = sort(myArray);
        for(int j : array){
            System.out.println(j);
        }

    }

    private static int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

}

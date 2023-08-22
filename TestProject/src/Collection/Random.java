package Collection;

import java.security.SecureRandom;

public class Random {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int[] n = new int[7];

        for (int i = 0; i < 1000; i++) {
            ++n[1 + secureRandom.nextInt(6)];
        }

//        for (int j = 1; j < n.length; j++) {
////            System.out.println("Side " + j + " " + n[j]);
////        }

        int[][] a = {{1, 2},
                {2, 3, 4, 5},
                {6, 7, 8, 9}};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}

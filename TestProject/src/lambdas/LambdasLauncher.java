package lambdas;

import java.util.Arrays;

public class LambdasLauncher {

    public static void main(String[] args) {

        String[] colors = {"Black", "White", "Blue", "Yellow", "Pink", "Grey"};

        Players player1 = new Players("NiKo", 100);
        Players player2 = new Players("Alex", 80);
        Players player3 = new Players("James", 67);
        Players player4 = new Players("Bob", 84);

        Players[] players = {player1, player2, player3, player4};

        Arrays.sort(players, (p1, p2) -> {
            if ((p2.score - p1.score) != 0) {
                return p2.score - p1.score;
            } else return p1.name.compareTo(p2.name);
        });
        System.out.println(Arrays.toString(players));

        Arrays.sort(colors, (s1, s2) ->
                s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 2));
        System.out.println(Arrays.toString(colors));

//        Arrays.sort(players, new Comparator<Players>() {
//            @Override
//            public int compare(Players o1, Players o2) {
//                return o1.score - o2.score;
//            }
//        });


//        Arrays.sort(colors, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.charAt(o1.length()-1) - o2.charAt(o2.length()-1);
//            }
//        });

        Thread thread = new Thread(() ->
                System.out.println("Hello world"));

    }

    public static class Players {
        private final String name;
        private final int score;

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

         Players(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return "name: " + name + "  " + "score = " + score;
        }
    }

}

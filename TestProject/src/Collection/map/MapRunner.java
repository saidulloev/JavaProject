package Collection.map;

import java.util.*;

public class MapRunner {
    public static void main(String[] args) {
        Map<String, Integer> words = new HashMap<>();
        System.out.println("Input text please");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] tokens = string.split(" ");
        for (String token : tokens) {
            String word = token.toLowerCase();
            Integer count = words.get(word);
            if (count == null) {
                words.put(word, 1);
            } else {
                words.put(word, count + 1);
            }
        }

        NavigableSet<WordWrapper> wordWrappers = convertToSet(words);
        List<WordWrapper> wordWrapperList = new ArrayList<>(wordWrappers);
        Collections.reverse(wordWrapperList);
        printSet(wordWrapperList);
    }

    private static void printSet(List<WordWrapper> wordWrappers) {

        for (WordWrapper wordWrapper : wordWrappers) {
            System.out.println(wordWrapper);
        }

    }

    private static NavigableSet<WordWrapper> convertToSet(Map<String, Integer> words) {

        words.remove("hd");
        words.remove("hbf", 1);
        words.replace("masrur", 7);

        NavigableSet<WordWrapper> wordSet = new TreeSet<>();
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            wordSet.add(new WordWrapper(entry.getKey(), entry.getValue()));
        }
        return wordSet;
    }

    private static void printMap(Map<String, Integer> words) {
        Map<String, Integer> wordTreeMap = new TreeMap<>(words);
        Set<String> keys = wordTreeMap.keySet();
        for (String key : keys) {
            System.out.printf("%-10s %-10s \n", key, words.get(key));
        }
    }

}

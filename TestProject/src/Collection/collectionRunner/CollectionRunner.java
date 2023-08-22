package Collection.collectionRunner;

import java.util.*;

public class CollectionRunner {
    public static void main(String[] args) {

        List<Card> deckOfCard = new ArrayList<>();
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                deckOfCard.add(new Card(suit, face));
            }
        }

//        System.out.println("Original deck of card \n");
//        printOutput(deckOfCard);

        Collections.shuffle(deckOfCard);
//        System.out.println("\n\nCard after shuffle");
//        printOutput(deckOfCard);

        Collections.sort(deckOfCard);
//        System.out.println("\n\nCard after sort");
//        printOutput(deckOfCard);

//        Collections.sort(deckOfCard,new CardComparator());
//        System.out.println("\n\nCard after reverse sort");
//        printOutput(deckOfCard);


        Card card = new Card(Card.Suit.SPADES, Card.Face.Queen);
        int i = Collections.binarySearch(deckOfCard, card);
        if (i >= 0) {
            System.out.println("\nCard was found in position " + i);
        } else System.out.println("\nCard was not found");

        List<Card> list = new ArrayList<>(deckOfCard);
        Collections.fill(list, card);
        Collections.addAll(list, card, card, card);
        Collections.copy(list, deckOfCard);
        int frequency = Collections.frequency(list, card);
        System.out.println("Frequency card is " + frequency);
        printOutput(list);

        System.out.println("\nMin: " + Collections.min(list));

        System.out.println("\nMax: " + Collections.max(list));

    }

    private static void printOutput(List<Card> deckOfCard) {
        for (int i = 0; i < deckOfCard.size(); i++) {
            System.out.printf("%-20s %s", deckOfCard.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
        }
    }


}

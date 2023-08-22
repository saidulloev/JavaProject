package Collection;

import Collection.collectionRunner.Card;
import Collection.collectionRunner.CardComparator;

import java.util.*;

public class StackQueueLauncher {
    public static void main(String[] args) {
//        passengerProcessing();

        Queue<Card> cardDeck = new PriorityQueue<>(52, new CardComparator());
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                cardDeck.add(new Card(suit, face));
            }
        }

        Deque<Card> cards = new ArrayDeque<>();

        for (int i = 0; i < 10; i++) {
            cards.offerLast(cardDeck.poll());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(cards.pollLast());
        }

        Card card = new Card(Card.Suit.SPADES, Card.Face.King);
        cards.removeFirstOccurrence(card);
        cards.removeLastOccurrence(card);

    }

    public static void passengerProcessing() {
        Stack<Passenger> bus = new Stack<>();
        Passenger passenger = new Passenger("Masrur", "Saidulloev");
        bus.push(passenger);
        bus.push(new Passenger("Niko", "Kovac"));
        bus.push(new Passenger("John", "Wick"));
        bus.push(new Passenger("Dua", "Lipa"));
        bus.push(new Passenger("Ivan", "Ivanov"));
        bus.push(new Passenger("Ronaldo", "Cristiano"));

        System.out.println("Passenger found at position: " + bus.search(passenger) + "\n");

        System.out.println("Last entered passenger: " + bus.peek() + "\n");
        while (!bus.empty()) {
            System.out.println("Passenger: " + bus.pop());
        }

    }

    public static class Passenger {
        public static int number;
        public String name;
        public String surname;

        public Passenger(String name, String surname) {
            number++;
            this.name = name;
            this.surname = surname;
        }

        public static int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }


        @Override
        public String toString() {
            return "Passenger " + name + " " + surname;
        }

    }
}

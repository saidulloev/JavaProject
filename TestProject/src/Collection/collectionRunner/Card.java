package Collection.collectionRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Card implements Comparable<Card> {

    public enum Suit {SPADES, HEARTS, CLUBS, DIAMONDS}

    public enum Face {Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}

    private final Suit suit;
    private final Face face;

    public Card(Suit suit, Face face) {
        this.suit = suit;
        this.face = face;
    }

    public Suit getSuit() {
        return suit;
    }

    public Face getFace() {
        return face;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit &&
                face == card.face;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, face);
    }

    @Override
    public int compareTo(Card card) {
        List<Face> faceList = Arrays.asList(Face.values());

        if (faceList.indexOf(this.face) < faceList.indexOf(card.getFace())) {
            return -1;
        } else if (faceList.indexOf(this.face) > faceList.indexOf(card.getFace())) {
            return +1;
        } else if (faceList.indexOf(this.face) == faceList.indexOf(card.getFace())) {
            return String.valueOf(suit).compareTo(String.valueOf(card.getSuit()));
        }

        return 0;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}

package Collection.collectionRunner;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CardComparator implements Comparator<Card> {

    List<Card.Face> faceList2 = Arrays.asList(Card.Face.values());


    @Override
    public int compare(Card card1, Card card2) {
        if (faceList2.indexOf(card1.getFace()) < faceList2.indexOf(card2.getFace())) {
            return +1;
        } else if (faceList2.indexOf(card1.getFace()) > faceList2.indexOf(card2.getFace())) {
            return -1;
        } else if (faceList2.indexOf(card1.getFace()) == faceList2.indexOf(card2.getFace())) {
            return String.valueOf(card1.getSuit()).compareTo(String.valueOf(card2.getSuit()));
        }
        return 0;
    }
}

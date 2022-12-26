
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Card[] deck = new Card[52];
        String[] suit = new String[0];
        String[] number = new String[0];
        int c = 0;
        suit = new String[]{"Diamonds", "Hearts", "Spades", "Clubs"};
        number = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < number.length; j++) {
                deck[c++] = new Card(suit[i], number[j]);
                //  System.out.print(suit[i] + " ");
                //  System.out.println(number[j]);

                Shuffle(deck);

                System.out.println(card);
            }

        }
    }

    public static void Shuffle(Card[] deck) {
        Random rd = new Random();
        for (int i = 0; i < 100; i++) {


            int r = rd.nextInt(52);
            int p = rd.nextInt(52);
            Card temp = deck[r];
            deck[r] = deck[p];
            deck[p] = temp;

        }
    }


    public static void Cut(Card[] deck) {

        int c = 5;

        int first[] = new int[52];
        int second[] = new int[52];

        for (int i = 0; i < (deck.length - c) + 1; i++) {

            for (int j = 0; j < c - 1; j++) {


            }
            second[] = [(deck.length) - c, deck.length];
        }
    }
}















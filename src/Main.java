
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int times , number; // Variables which ı will use.

        Shuffle game = new Shuffle // This shuffles the deck.

        System.out.println("How many times the cards will be given");

        Scanner sc = new Scanner(System.in);
        times = sc.nextInt();
        System.out.println("How many cards will be given at one time?");
        number = sc.nextInt();


        for (int i = 1 ; i<= times ; i++){

            System.out.println(i + ":");
            int sayi[] = game.Shuffle(times);

            for (int j = 0; j< times ; j++){

                int remaining = (sayi[j]%13 ) + 1; // this is a must for finding card's name

                if(sayi[j] > 0 && sayi[j] <= 13){
                    System.out.println("Clubs");
                } else if ( sayi[j] > 13 && sayi[j] <= 26 ){
                    System.out.println("Spades");
                } else if (sayi[j] > 26 && sayi [j] <= 39){
                    System.out.println("Diamonds");
                }else {
                    System.out.println("Hearts"); // I give names the cards. I divided them into 4 groups.
                }

            }

    }
}



}

public class Main{
    public static void main(String[] args) {
        Card [] deck = new Card [52];
        String[] suit = new String[0];
        String[] number = new String[0];
       int c=0;
        suit = new String[]{"Diamonds", "Hearts", "Spades", "Clubs"};
        number = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

       for(int i = 0 ; i < suit.length; i++){
           for(int j = 0; j<number.length ; j++) {
           deck[c++] = new Card(suit [i] , number [j]);
           System.out.print(suit[i] + " ");
           System.out.println(number[j]);


           }
           
       }
    
    
    }


    
       }

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Card [] deck = new Card [52];
        String[] suit = new String[0];
        String[] number = new String[0];
       int c=0;
       for(int i = 0 ; i < suit.length; i++){
           for(int j = 0; j<number.length ; j++) {
           deck[c++] = new Card(suit [i] , number [j]);
           }
           
       }
    
    
    }


    
       }
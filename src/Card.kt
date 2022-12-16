 class Card {
    String[] Deck = new String[52];
    String[] Number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] Suit = {"Diamonds","Hearts","Spades","Clubs"}


     public static void deck(){

         for (int i = 0; i < deck.length ; i++){

         deck[i] = number[i % 13] + suit[i / 13];
     }

         System.out.println();
     }




     }


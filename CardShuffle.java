/* The logic and code is from listing 7.2 */
public class CardShuffle{
    public static void main(String[]args){
    
    System.out.println(" Welcome to the Random Card Generator! ");
    
    // declaration of deck
    int[] cards = new int[52]; // creates an array of 52 --> 0's
    
    // creating array of strings of face cards 
    String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
    String[] ranks = {"Ace","1","2","3","4","5","6","7","8","9","10",
                        "Jack","Queen","King"};

    // initialize the deck of cards.
    for (int i =0 ; i < cards.length; i++){
        cards[i] = i;
    }
    // randomize the cards 
    for (int i = 1; i<cards.length; i++ ){
        int index = (int) (Math.random() * cards.length);
        int temp = cards[i];
        cards[i] = cards[index];
        cards[index] = temp;

        }

    // assigning the cards to the indices
    for (int i = 0 ; i < 4 ; i++){
        String suit = suits[cards[i] / 13] ; // string varName = array [ cards [i]/13]
        String rank = ranks[cards[i]%13]; // string varName = array [ cards [i]%13]
        System.out.println("The Card Number is "+cards[i]+" : "+rank+" of "+ suit);
        }

    }
}
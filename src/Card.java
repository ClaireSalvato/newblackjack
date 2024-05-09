public class Card {

    public String suit;

    public int value;

    public String type;

    public Card(int pType, int pSuit){

        if(pType == 0) {
            type = "Ace";
        } else if (pType == 1){
            type = "One";
        } else if(pType == 2){
            type = "Two";
        } else if (pType == 3){
            type = "Three";
        } else if (pType == 4){
            type = "Four";
        } else if (pType == 5){
            type = "Five";
        } else if (pType == 6){
            type = "Six";
        } else if (pType == 7) {
            type = "Seven";
        } else if (pType == 8){
        type = "Eight";
        } else if (pType == 9){
            type = "Nine";
        } else if (pType == 10){
            type = "Ten";

        }

        if(pSuit == 1){
            suit = "Spades";
        } else if (pSuit == 2){
            suit = "Hearts";
        } else if (pSuit == 3){
            suit = "Clubs";
        } else if (pSuit == 4){
            suit = "Diamonds";
        }

//        suit = pSuit;
//        type = pType;
        //value =


    }

    public void print(){
        System.out.println("The" + type + "of" + suit + "is worth" + value + ".");
    }
}

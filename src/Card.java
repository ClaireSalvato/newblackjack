public class Card {

    public String suit;

    public int value;

    public String type;

    public Card(int pType, int pSuit){

        if(pType == 0) {
            type = "Ace";
            value = 11;
        } else if (pType == 1){
            type = "two";
            value = 1;
        } else if(pType == 2){
            type = "Three";
            value = 2;
        } else if (pType == 3){
            type = "Four";
            value = 3;
        } else if (pType == 4){
            type = "Five";
            value = 4;
        } else if (pType == 5){
            type = "Six";
            value = 5;
        } else if (pType == 6){
            type = "Seven";
            value = 6;
        } else if (pType == 7) {
            type = "Eight";
            value = 7;
        } else if (pType == 8){
            type = "Nine";
            value = 8;
        } else if (pType == 9) {
            type = "Ten";
            value = 9;
        } else if (pType == 10) {
            type = "Jack";
            value = 10;
        } else if (pType == 10) {
            type = "King";
            value = 10;
        } else if (pType == 10){
            type = "Queen";
            value = 10;

        }

        if(pSuit == 1){


        }




    }

    public void print(){
        System.out.println("The" + type + "of" + suit + "is worth" + value + ".");
    }
}


public class Player {

    public int cardsValue;

    public String name;


    public boolean isPlayer;

    public Card [] hand;

    public int numCards;


    public Player(){
        cardsValue = 0;
        name = "Claire";
        isPlayer = true;
        hand = new Card[2];
        numCards = 0;

    }

    public void print(){
        if(isPlayer){
            for(int i = 0; i<hand.length; i++){
                hand[i].print();

            }
            System.out.println("Hi " + name);
            System.out.println("You have " + cardsValue + " points.");
        }


        else{
            System.out.println("Dealer Info");
            System.out.println("the dealer has" + hand[0].value + "points");
            hand[0].print();
        }
    }

    public void addCard( Card c){
        if(numCards>=2){
            Card[] moreCards = new Card [hand.length+1];
//
            for(int i =0; i<hand.length; i++){
                moreCards[i] = hand[i];
            }
            hand = moreCards;

        }
        hand[numCards] = c;
        numCards = numCards + 1;
        cardsValue = cardsValue + c.value;
    }

}











public class Player {

    public int cardsValue;

    public String name;

    public boolean isPlayer;

    public Card [] hand;


    public Player(){
        cardsValue = 0;
        name = "Claire";
        isPlayer = true;
        hand = new Card[2];

    }

    public void print(){
        if(isPlayer){
            System.out.println("Hi " + name);
            System.out.println("You have " + cardsValue + " points.");
        }
        else{
            System.out.println("Dealer info");

        }
    }

}










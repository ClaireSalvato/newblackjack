import java.util.Scanner;

public class Casino {

    public Card [] deck;
    public boolean isHit = false;

    public Player p;

    public Player dealer;

    public static void main(String[] args) {
        Casino c = new Casino();

    }
    public Casino(){
        System.out.println("Hello and welcome to my card game :)");
        makeDeck();
        shuffle();
        printDeck();



        p = new Player();
       //p.print();
        System.out.println(p.isPlayer);
        dealer = new Player();
        deal();
        System.out.println(dealer.isPlayer);
        dealer.isPlayer = false;
        p.print();
        dealer.print();
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String username = scan.nextLine();
        System.out.println(username);
        p.name = username;
        p.print();
        System.out.println(p.isPlayer);



            }



    public void makeDeck() {
        deck = new Card[52];
        int count = 0;

        //    deck[0]= new Card("Ace","Spades");
        for (int t = 0; t < 13; t++) {
            for (int s = 0; s < 4; s++) {
                //  if(t==0){
                deck[count] = new Card(t, s);
                deck[count].print();
                count++;

            }
        }


    }

    public void shuffle(){
        for(int x = 0; x < 52;x++){
            int randomIndex = (int)(Math.random()*52);
            Card randomCard = deck[randomIndex];

            Card temp = deck[x];
            deck[x] = randomCard;
            deck[randomIndex] = temp;

            printDeck();

        }

    }

    public void printDeck(){
        for(int i = 0; i < deck.length; i++){
            deck[i].print();
        }
    }

    public void deal(){
//        p.hand[0] = deck[0];
//        p.hand[1] = deck[2];

        p.addCard(deck[0]);
        p.addCard(deck[1]);

        dealer.hand[1] = deck[2];
        dealer.hand[1] = deck[3];

    }


    }

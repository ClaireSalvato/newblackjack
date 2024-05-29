import java.util.Scanner;

public class Casino {

    public Card[] deck;
    public int numDealtCards;
    public boolean isHit = false;

    public Player p;

    public Player dealer;

    public static void main(String[] args) {
        Casino c = new Casino();

    }

    public Casino() {
        System.out.println("Hello and welcome to my card game :)");
        makeDeck();
        shuffle();
        printDeck();


        System.out.println("Welcome to Claire's Blackjack game!");
        System.out.println("");
        System.out.println("  BLACKJACK RULES: ");
        System.out.println("	-Each player is dealt 2 cards. The dealer is dealt 2 cards with one face-up and one face-down. These player cards are added up to total a given number.");
        System.out.println("	-Players “Hit” to get another card from the deck. Players “Stand” to keep their current card total.");
        System.out.println("	-Dealer “Hits” until they equal or exceed 17. The goal is to have a higher card total than the dealer without going over 21.");
        System.out.println("	-Players win their bet if they beat the dealer. Players win  their bet if they get “Blackjack” which is 21.");
        System.out.println("");
        System.out.println("");


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

        System.out.println();
        String decision = "";
        while (!decision.equals("stand") && p.cardsValue <= 21) {
            System.out.println("Do you want to stand or hit?");
            decision = scan.nextLine();
            System.out.println(decision);
            boolean isHit;
            if (decision.equals("hit")) {
                isHit = true;
                System.out.println("You decided to hit");
            } else {
                isHit = false;
                System.out.println("You decided to stand");

            }
            if (isHit) {
                p.addCard(deck[numDealtCards]);
                numDealtCards++;
                p.print();

            } else {
                //what happens if we decide to stand
                // dealer also has to play - while loop - hit or stand until 17


            }


            System.out.println(p.isPlayer);

//        System.out.println("Do you want to hit or stand?");
//         decision = scan.nextLine();
//        System.out.println(decision);

        }


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

public void shuffle() {
    for (int x = 0; x < 52; x++) {
        int randomIndex = (int) (Math.random() * 52);
        Card randomCard = deck[randomIndex];

        Card temp = deck[x];
        deck[x] = randomCard;
        deck[randomIndex] = temp;

        printDeck();

    }

}

public void printDeck() {
    for (int i = 0; i < deck.length; i++) {
        deck[i].print();
    }
}

public void deal() {
//        p.hand[0] = deck[0];
//        p.hand[1] = deck[2];

    p.addCard(deck[0]);
    p.addCard(deck[1]);

    dealer.addCard(deck[2]);
    dealer.addCard(deck[3]);

}


    }

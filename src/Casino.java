public class Casino {

    public Card [] deck;

    public static void main(String[] args) {
        Casino c = new Casino();

    }
    public Casino(){
        System.out.println("Hello and welcome to my card game :)");
        makeDeck();
        shuffle();

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


}

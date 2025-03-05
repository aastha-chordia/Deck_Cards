import java.util.*;
class Deck{
		ArrayList<Card> deck;
		public Deck(){
				this.deck = new ArrayList<>();
		}
		public void createDeck(){
				String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9","10", "J", "Q", "K", "A"};
				String[] suits = {"Clubs", "Spades", "Hearts", "Diamond"};	
				for(String rank : ranks){
						for(String suit : suits){
								deck.add(new Card(rank,suit));
						}
				}
		}
		public void displayDeck(){
				for(Card card : deck){
						System.out.println(card);
				}
		}
		
		public void shuffleDeck(){
				Collections.shuffle(deck);
		}
		
		public void randomCards(){
				int n = 0;
				while(n == 2)
						System.out.println();
						n = n+1;
				}
		}
}


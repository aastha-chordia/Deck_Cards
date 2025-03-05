import java.util.*;

class Main{
		public static void main(String args[]){
				Deck deck = new Deck();
				System.out.println("----------Creating Deck----------");
				deck.createDeck();
				System.out.println("----------Printing Deck----------");
				deck.displayDeck();
				System.out.println("----------Suffling Deck----------");
				deck.shuffleDeck();
				deck.displayDeck();
				System.out.println("----------Random 2 Cards----------");
				deck.randomCards();
		}
}

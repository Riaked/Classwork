package introduction;

public class RandomDeckCard {

	public static void main(String[] args) {
		
		String[] cards = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "The Jack", "The Queen",
				"The King", "The Ace"};
		String[] suits = {"Diamonds", "Clovers", "Hearts", "Spades"};
		int card = (int) (Math.random()*cards.length);
		int suit = (int) (Math.random()*suits.length);
		System.out.println(cards[card]+" of "+suits[suit]);
		
		}

	
}

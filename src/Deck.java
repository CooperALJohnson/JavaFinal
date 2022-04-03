
import java.util.*;
public class Deck {

	List<Card> cards = new ArrayList<>();
	
	String[] suits = {"hearts", "clubs", "spades", "diamonds"};
	
	public Deck() {
		for (int  i = 2; i <= 14; i++) {
			for (int j = 0; j < suits.length; j++) {
				cards.add(new Card(i, suits[j]));
			}
		}
	}
	
	public List<Card> shuffle() { 
		Collections.shuffle(cards);
		return cards;
	}
	
	public Card draw(List<Card> deck) {
		return deck.remove(0);
	}
}

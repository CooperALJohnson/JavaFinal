
import java.util.*;
public class Deck {
	//enumerator look her up
	List<Card> cards = new ArrayList<>();
	//ArrayList<Integer> sorted = new ArrayList<>();
	String[] suits = {"hearts", "clubs", "spades", "diamonds"};
	
	//deck constructor
	public Deck(){
		for(int  i = 2; i <= 14; i++) {
			for(int j = 0; j < suits.length; j++) {
				cards.add(new Card(i, suits[j]));
			}
		}
	}
	
	public List<Card> shuffle() { /// collection use .shuffle / .sort
		Collections.shuffle(cards);
		return cards;
	}
	
	public Card draw(List<Card> deck) {
		return deck.remove(0);
	}
	
	
}

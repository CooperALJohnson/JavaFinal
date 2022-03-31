import java.util.*;

public class App {

	public static void main(String[] args) {

		Deck deck = new Deck();
		
		Player player1 = new Player();
		player1.setName("Cooper");
		
		Player player2 = new Player("Player2");
		
		List<Card> liveDeck = deck.shuffle();
		
		for(int i = 1; i <= liveDeck.size(); i++) {
			if (i % 2 == 0) {
				player2.draw(liveDeck);
			} else {
				player1.draw(liveDeck);
			}
		}
		//Using a traditional for loop, iterate 26 times and call the flip method for each player.
			//Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
	}

}

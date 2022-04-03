import java.util.*;

public class App {

	public static void main(String[] args) {

		Deck deck = new Deck();
		
		Player player1 = new Player();
		player1.setName("Cooper");
		
		Player player2 = new Player("Player2");
		
		List<Card> liveDeck = deck.shuffle();
		
		for(int i = 1; i <= 52; i++) {
			if(i % 2 == 0) {
				player2.draw(liveDeck);
			} else {
				player1.draw(liveDeck);
			}
		}
		
		for(int i = 1; i < 27; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			if(card1.getValue() > card2.getValue()) {
				player1.incrementScore();
			} else {
				player2.incrementScore();
			}
		}
		
		System.out.println(player1.getName() + " " + player1.getScore());
		System.out.println(player2.getName() + " " + player2.getScore());
		
		if (player1.getScore() == player2.getScore()) {
			System.out.println("Draw!");
		} else if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " Wins!");
		} else {
			System.out.println(player2.getName() + " Wins!");
		}
	}
}

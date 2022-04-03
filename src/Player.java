import java.util.*;

public class Player {
	
	private List<Card> hand;
	private int score;
	private String name;
	
	public Player() {
		this(null);
	}
	
	public Player(String name) {
		hand = new ArrayList<>();
		score = 0;
		this.name = name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String toString() {
		StringBuilder playerInfo = new StringBuilder();
		playerInfo.append("Player: " + name +"\n");
		for(Card card : hand) {
			playerInfo.append(card.toString());
			playerInfo.append("\n");
		}
		return playerInfo.toString();
	}
	
	public Card flip () {
		return hand.remove(0);
	}
	
	public void draw (List<Card> deck) {
		hand.add(deck.remove(0));
	}
	
	public void incrementScore () {
		score++;
	}
	
	public int getScore () {
		return score;
	}

	public String getName() {
		return name;
	}
}

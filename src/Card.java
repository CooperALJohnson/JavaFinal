
public class Card {
	
	public static Object containsKey;
	private int value;
	private String suit;
	
	public Card(int value, String suit) {
		this.value = value;
		this.suit = suit;
	}
	public String toString() {
		return "The " + value + " of " + suit;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return suit;
	}
	public void setName(String suit) {
		this.suit = suit;
	}
}

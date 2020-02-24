
public class Card {
	//Setting instance variables
	private String value;
	private String suit;
	
	//
	public Card(String value, String suit) {
		this.value = value;
		this.suit = suit;
	}
	
	public Card(Card card) {
		this.value = card.value;
		this.suit = card.suit;
	}
	
	/**
     * Accessor for value
     * @return value integer value of the Card
     */
	public int getNumber() {
		if (this.value.equals("A")) {
			return 11;
		} else if (this.value.equals("J") || this.value.equals("Q") || this.value.equals("K")) {
			return 10;
		} else {
			return Integer.parseInt(this.value);
		}
	}
	
	/**
     * Accessor for value in case value of the card is an Ace
     * @return value integer value of the Ace Card
     */
	public int getNumberWithAceAs1() {
		if (this.value.contentEquals("A")) {
			return 1;
		} else {
			return this.getNumber();
		}
	}
	
	/**
     * Displays all necessary qualities of a Card:
     * Suit and Value
     * @return value and suit String of qualities
     *@Override
     */
	public String toString() {
		return value + suit;
	}
}

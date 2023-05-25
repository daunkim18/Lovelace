package com.skillstorm.training;

public class Card {
	
	
	private Suit suit; //enum suit
    private int value;
    private String rank;
    
    
    public Card(Suit suit, int value, String rank) {
        this.value = value;
        this.suit = suit;
        this.rank = rank;
        
        System.out.println("Suit: " + suit);   // Output: Suit: Hearts
        System.out.println("Value: " + value); // Output: Ace:1, Jack-King:11-13
    }

    public int getValue() {
    	if (rank.equals("Ace")) {
            return 11;
        } else if (rank.equals("King") || rank.equals("Queen") || rank.equals("Jack")) {
            return 10;
        } else {
            return Integer.parseInt(rank);
        }
    }

	public Suit getSuit() {
		return suit;
	
	}

	@Override
	public String toString() {
		return "Card [suit=" + suit + ", value=" + value + ", rank=" + rank + "]";
	}

	
	
	

   
}

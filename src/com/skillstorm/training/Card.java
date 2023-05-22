package com.skillstorm.training;

public class Card {
	
	
	private String suit;
    private int value;
    
    
    
    public Card(String suit, int value) {
    	Card card = new Card("Hearts", 0);
        this.value = value;
        this.suit = suit;
        
        System.out.println("Suit: " + suit);   // Output: Suit: Hearts
        System.out.println("Value: " + value); // Output: Value: 0
    }

    public int getValue() {
        return value;
    }

	public String getSuit() {
		return suit;
	
	}
	
	

   
}

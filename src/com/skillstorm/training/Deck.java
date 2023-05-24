package com.skillstorm.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Deck {

		
		private Card dealtCard;
		private int numberOfCards = 312;
		private static Deck deckOfCards;
		

		private Deck(Deck deckOfCards) {
			Deck.deckOfCards = initialDeck();
		}
		
		public Deck() {}
		public Deck(Card dealtCard, int numberOfCards, List<List<Card>> deckOfCards){
			this.dealtCard = dealtCard;
			// implement method?
			this.numberOfCards = numberOfCards;
			Deck.deckOfCards = initialDeck();
			}
		public Card getDealtCard() {
			getDeckOfCards();
			
			return dealtCard; // use random class
		}
		public void setDealtCard(Card dealtCard) {
			this.dealtCard = dealtCard; // probably don't need this method
		}
		public int getNumberOfCards() {
			return numberOfCards;
		}
		public void setNumberOfCards(int numberOfCards) {
			this.numberOfCards = numberOfCards;
		}
		public List<List<Card>> getDeckOfCards() {
			return deckOfCards;
		}
		public void setDeckOfCards (List<List<Card>> deckOfCards) {
			Deck.deckOfCards = deckOfCards;
		}

		public static void main(String[] args) {

			
		}
		
		public static List<List<Card>> initialDeck() {
			List<Card> startingDeck = new ArrayList<Card>();
			startingDeck.add(new Card(DIAMOND, 2));
			startingDeck.add(new Card(DIAMOND, 3));
			startingDeck.add(new Card(DIAMOND, 4));
			startingDeck.add(new Card(DIAMOND, 5));
			startingDeck.add(new Card(DIAMOND, 6));
			startingDeck.add(new Card(DIAMOND, 7));
			startingDeck.add(new Card(DIAMOND, 8));
			startingDeck.add(new Card(DIAMOND, 9));
			startingDeck.add(new Card(DIAMOND, 10));
			startingDeck.add(new Card("Diamond", 6));
			startingDeck.add(new Card("Diamond", 7));
			startingDeck.add(new Card("Diamond", 8));
			startingDeck.add(new Card("Diamond", 9));
			startingDeck.add(new Card("Diamond", 10));
			startingDeck.add(new Card("Diamond / Jack", 10));
			startingDeck.add(new Card("Diamond / Queen", 10));
			startingDeck.add(new Card("Diamond / King", 10));
			startingDeck.add(new Card("Club", 2));
			startingDeck.add(new Card("Club", 3));
			startingDeck.add(new Card("Club", 4));
			startingDeck.add(new Card("Club", 5));
			startingDeck.add(new Card("Club", 6));
			startingDeck.add(new Card("Club", 7));
			startingDeck.add(new Card("Club", 8));
			startingDeck.add(new Card("Club", 9));
			startingDeck.add(new Card("Club", 10));
			startingDeck.add(new Card("Club / Jack", 10));
			startingDeck.add(new Card("Club / Queen", 10));
			startingDeck.add(new Card("Club/ King", 10));
			startingDeck.add(new Card("Spade", 2));
			startingDeck.add(new Card("Spade", 3));
			startingDeck.add(new Card("Spade", 4));
			startingDeck.add(new Card("Spade", 5));
			startingDeck.add(new Card("Spade", 6));
			startingDeck.add(new Card("Spade", 7));
			startingDeck.add(new Card("Spade", 8));
			startingDeck.add(new Card("Spade", 9));
			startingDeck.add(new Card("Spade", 10));
			startingDeck.add(new Card("Spade / Jack", 10));
			startingDeck.add(new Card("Spade / Queen", 10));
			startingDeck.add(new Card("Spade / King", 10));
			startingDeck.add(new Card("Heart", 2));
			startingDeck.add(new Card("Heart", 3));
			startingDeck.add(new Card("Heart", 4));
			startingDeck.add(new Card("Heart", 5));
			startingDeck.add(new Card("Heart", 6));
			startingDeck.add(new Card("Heart", 7));
			startingDeck.add(new Card("Heart", 8));
			startingDeck.add(new Card("Heart", 9));
			startingDeck.add(new Card("Heart", 10));
			startingDeck.add(new Card("Heart / Jack", 10));
			startingDeck.add(new Card("Heart / Queen", 10));
			startingDeck.add(new Card("Heart / King", 10));
			startingDeck.add(new Card("Heart Ace", 0));
			startingDeck.add(new Card("Diamond Ace", 0));
			startingDeck.add(new Card("Club Ace", 0));
			startingDeck.add(new Card("Spade Ace", 0));
			// when implementing the deck, make sure only six copies are made
			List<List<Card>> initialDeck = new ArrayList<>();
			initialDeck.add(startingDeck);
			initialDeck.add(startingDeck);
			initialDeck.add(startingDeck);
			initialDeck.add(startingDeck);
			initialDeck.add(startingDeck);
			initialDeck.add(startingDeck);
			return initialDeck;
		}
//		public Card[] newDeck() {
//			
//		}




		public static Card choosingAces() {
			Scanner in = new Scanner(System.in);
			if (new Card() == new Card("Ace", 0)) {
				System.out.println("Would you like your Ace to count as a 1 or 10?\nPlease enter below:");
				int answer = in.nextInt();
				if (answer == 1) {
					Card ace1 = new Card("Ace", 1);
					return ace1;
				} else if (answer == 10) {
					Card ace10 = new Card("Ace", 10);
					return ace10;
				} else {
//					return "Please enter a valid answer";
				}
			}
//			return throws IllegalArgumentException();
			return null;
		}
		public static void shuffle() {
			Deck.shuffle();
		}

		public Card deal() {
			
			return dealtCard;
			
		}
		public Card draw() throws EmptyDeckException
		{
				if(initialDeck.size() < 1)
					throw new EmptyDeckException("The deck is empty !");
				return initialDeck.pollFirst();
		}
//		  public void deal(){
//			    for (int i = 0; i < 52; i++) {
//			       String suit = suits[deck[i] / 13];
//			       String rank = ranks[deck[i] % 13];
//			       System.out.println( rank + " of " + suit);
//			       System.out.println("Remaining cards: " + remainingCards);
//			     }
//			   }
//			}
		// need something to show the cards
		// what cards have been pulled vs what is remaining
		// reset method
		// use new random for dealing
		

		
		
		
}

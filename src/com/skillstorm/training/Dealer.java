package com.skillstorm.training;

import java.util.List;
import java.util.ArrayList;

public class Dealer {

	private List<Card> hand;

	public Dealer() {
		hand = new ArrayList<>();
	}

	public void play() {
		// TODO Auto-generated method stub
	}

	public void addCard(Card card) {
		hand.add(card);
	}

	public int getHandValue() {
		int value = 0;
		int aceCount = 0;

		for (Card card : hand) {
			value += card.getValue();
			if (card.getValue() == 11) {
				aceCount++;
			}
		}

		while (value > 21 && aceCount > 0) {
			value -= 10;
			aceCount--;
		}

		return value;
	}
}

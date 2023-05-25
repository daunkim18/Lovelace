package com.skillstorm.training;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
//		Main method: Game logic
//		At the start of the program, read in the names and winnings of all previous players
//		At the start of the program, prompt the user for their name
//		During the game, keep a record of the actions taken (create a separate file for each player and save it in a directory folder)
//		At the end of each round,
//		Prompt the user if they would like to continue playing
//		Shuffle the deck between each round
//		Upon completion of a game, write to file the player's updated earnings (Optional: sort the data being saved based on winnings)

		System.out.println("Welcome to Lovelace's Blackjack!");
		Scanner scanner = new Scanner(System.in);
		String playerName;
		String input;

		System.out.println("What is your name?");
		input = scanner.nextLine();
		playerName = input;

		do {
			System.out.println("---------------");
			System.out.println("A new game begins");
			System.out.println("---------------");

			Player player = new Player(playerName);
			Player dealer = new Player("dealer");
			Deck deck = new Deck();
			deck.shuffle();
			boolean gameOver = false;

			// Initial dealing of cards
			player.addCard(deck.deal());
			dealer.addCard(deck.deal());
			player.addCard(deck.deal());
			dealer.addCard(deck.deal());

			System.out.println("Player's hand: " + player.getHandValue());
			System.out.println("Dealer's hand: " + dealer.getHandValue());

			// Player's turn
			while (!gameOver) {
				System.out.println("Choose your action: (1) Hit (2) Stand");
				input = scanner.nextLine();

				if (input.equals("1")) {
					Card card = deck.deal();
					player.addCard(card);
					System.out.println("Player's hand: " + player.getHandValue());
					if (player.getHandValue() > 21) {
						System.out.println("Bust! Player loses.");
						gameOver = true;
					}
				} else if (input.equals("2")) {
					gameOver = true;
				}
			}

			// Dealer's turn
			while (!gameOver && dealer.getHandValue() < 17) {
				Card card = deck.deal();
				dealer.addCard(card);
				System.out.println("Dealer draws a card: " + card);
				System.out.println("Dealer's hand: " + dealer.getHandValue());
				if (dealer.getHandValue() > 21) {
					System.out.println("Dealer busts! Player wins.");
					gameOver = true;
				}
			}

			// Determine the winner
			if (!gameOver) {
				System.out.println("Player's hand: " + player.getHandValue());
				System.out.println("Dealer's hand: " + dealer.getHandValue());
				if (player.getHandValue() > dealer.getHandValue()) {
					System.out.println("Player wins!");
				} else if (player.getHandValue() < dealer.getHandValue()) {
					System.out.println("Dealer wins!");
				} else {
					System.out.println("It's a tie!");
				}
			}

			// Ask for a new game
			System.out.println("Do you want to play again? (Y/N)");
			input = scanner.nextLine();
		} while (input.equalsIgnoreCase("Y"));

		System.out.println("Thanks for playing Blackjack!");
		scanner.close();

		String directoryPath = "game_records/" + playerName;
		String filePath = directoryPath + "/game_actions.txt";

		// Create the player's directory if it doesn't exist
		File directory = new File(directoryPath);
		if (!directory.exists()) {
			directory.mkdirs();
		}

		// Write game actions to the player's file
		try (FileWriter fileWriter = new FileWriter(filePath, true)) {
			// Write the game actions, e.g., player's moves, dealer's moves
			fileWriter.write("Player hit\n");
			fileWriter.write("Dealer stay\n");

			// Flush and close the file writer
			fileWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

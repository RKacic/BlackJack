package main.java.com.blackjack.view;

import java.io.Console;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import main.java.com.blackjack.datatransferobject.Card;

public class UserIOImplementation implements UserIO{
	private StatementConstants statementConstants = new StatementConstants();
	private Scanner scanSource;
	
	public UserIOImplementation(Scanner scanner) {
		this.scanSource = scanner;
	}
	
	@Override
	public boolean willUserHit() {
		boolean userResponse = false;
		boolean isValidResponse = false;
		while(!isValidResponse) {
			try {
				printToScreen("Would you like to hit or stay? Please type either 'hit' or 'stay' then hit enter.");
				String response = scanSource.nextLine().toLowerCase();
				userResponse = checkResponse(response);
				isValidResponse = true;
			} catch (Exception ex) {
				printToScreen("whoops... please provide a valid response.");
			}
		}
		return userResponse;
	}

	@Override
	public String welcomeStatement() {
		printToScreen(statementConstants.WELCOME_MESSAGE);
		timeDelay(3);
		return statementConstants.WELCOME_MESSAGE;
	}

	@Override
	public String bustStatement() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String winnerStatement() {
		return null;
		// TODO Auto-generated method stub
		
	}
	
	private void printToScreen(String message) {
		System.out.println(message);
	}
	
	private boolean	checkResponse(String response){
		return response.equals(statementConstants.HIT);
	}

	private void timeDelay(int amountOfSeconds) {
		try {
			TimeUnit.SECONDS.sleep(amountOfSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String showCards(List<Card> playerCards, List<Card> dealerCards) {
		String cards = cardsToDisplay(playerCards, dealerCards);
		printToScreen(cards);
		timeDelay(3);
		return cards;
	}

	private String cardsToDisplay(List<Card> playerCards, List<Card> dealerCards) {
		StringBuilder message = new StringBuilder();
		message.append("Players Cards: " + cardsToString(playerCards));
		message.append("Dealers Cards: " + cardsToString(dealerCards));
		return message.toString();
	}

	private String cardsToString(List<Card> cards) {
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < cards.size() - 1; i++) {
			str.append(" | " + cards.get(i).getName() + " of " + cards.get(i).getSuit() + " | " );
		}
		return str.toString();
	}

}

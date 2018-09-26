package main.java.com.blackjack.view;

import java.util.List;

import main.java.com.blackjack.datatransferobject.*;

public interface UserIO {
	public boolean willUserHit();
	
	public String welcomeStatement();
	
	public String showCards(List<Card> playerCards, List<Card> dealerCards);
	
	public String bustStatement();
	
	public String winnerStatement();
}


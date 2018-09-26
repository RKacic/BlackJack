package main.java.com.blackjack.service.utilities;

import java.util.List;

import main.java.com.blackjack.datatransferobject.Card;

public interface DeckMachine {
	public List<Card> produceCardDecks(int numberOfDecks);
}

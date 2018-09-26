package main.java.com.blackjack.service.utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import main.java.com.blackjack.datatransferobject.Card;

public class DeckMachineImplementation implements DeckMachine {
	private Constants constants = new Constants();
	
	public List<Card> produceCardDecks(int numberOfDecksToCreate) {
		List<Card> deck = new ArrayList<>();
		
		for (int index = 0 ; index < numberOfDecksToCreate ; index++) {
			deck.addAll(createCardDeck());		
		}

		Collections.shuffle(deck);
		return deck;
	}

	private List<Card> createCardDeck() {
		List<Card> cardDeck = new ArrayList<>();
		for (String suit : constants.CARD_SUITS) {
			cardDeck.addAll(createSuitOfCards(suit));
		}
		return cardDeck;
	}

	private Collection<? extends Card> createSuitOfCards(String suit) {
		List<Card> suitOfCards = new ArrayList<>();
		for (String cardName : constants.CARD_NAMES_AND_VALUES.keySet()) {
			suitOfCards.add(createCard(suit, cardName, constants.CARD_NAMES_AND_VALUES.get(cardName)));
		}
		return suitOfCards;
	}

	private Card createCard(String suit, String cardName, Integer cardValue) {
		Card card = new Card();
		card.setName(cardName);
		card.setSuit(suit);
		card.setValue(cardValue);
		return card;
	}

}

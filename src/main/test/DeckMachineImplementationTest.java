package main.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.java.com.blackjack.datatransferobject.Card;
import main.java.com.blackjack.service.utilities.Constants;
import main.java.com.blackjack.service.utilities.DeckMachineImplementation;

public class DeckMachineImplementationTest {
	
	private DeckMachineImplementation deckMachine;
	private Constants constants;
	
	@Before
	public void setUp() throws Exception {
		deckMachine = new DeckMachineImplementation();
		constants = new Constants();
	}

	@Test
	public void deckMachine_Instantiates() {
		assertNotNull(deckMachine);
	}
	
	@Test 
	public void deckMachine_returnsDeckOfCards() {
		List<Card> deck = getOneDeck();
		
		assertNotNull(deck);
		assertEquals(Card.class, deck.get(1).getClass());
	}
	
	@Test
	public void deckMachine_DeckSize() {
		List<Card> deck = getOneDeck();
		
		assertEquals(constants.DECK_SIZE, deck.size());
	}
	
	@Test
	public void deckMachine_CanReturnMultipleDecks() {
		int numberOfDecks = 5;
		List<Card> multipleDecksMasterDeck = deckMachine.produceCardDecks(numberOfDecks);
		
		assertEquals(numberOfDecks, (multipleDecksMasterDeck.size()/constants.DECK_SIZE));
	}
	
	private List<Card> getOneDeck() {
		return deckMachine.produceCardDecks(1);
	}
}

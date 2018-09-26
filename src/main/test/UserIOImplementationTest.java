package main.test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import main.java.com.blackjack.datatransferobject.Card;
import main.java.com.blackjack.service.utilities.DeckMachineImplementation;
import main.java.com.blackjack.view.UserIOImplementation;

public class UserIOImplementationTest {

	private UserIOImplementation userIO;
	private Scanner sc;
	private String input = null;
	private List<Card> testCards;
	
	@Before
	public void setUp() throws Exception {
		sc = Mockito.mock(Scanner.class);
		Mockito.when(sc.nextLine()).thenReturn(input);
		userIO = new UserIOImplementation(sc);
		testCards = new DeckMachineImplementation().produceCardDecks(1).subList(0, 3);
	}
	
	@Test 
	public void testCanInstantiateUserIO() {
		assertNotNull(userIO);
	}

	@Test
	public void testWillUserHit() {
		input = "true";
		assertEquals(input, sc.nextLine());
	}

	@Test
	public void testWelcomeStatement() {
		fail("Not yet implemented");
	}

	@Test
	public void testBustStatement() {
		fail("Not yet implemented");
	}

	@Test
	public void testWinnerStatement() {
		fail("Not yet implemented");
	}

	@Test
	public void testShowCards() {
		fail("Not yet implemented");
	}

}

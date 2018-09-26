package main.java.com.blackjack.service.utilities;


import java.util.HashMap;
import java.util.Map;

public class Constants {
	public static final int DECK_SIZE = 52;
	public static final String[] CARD_SUITS = new String[] {"Heart","Diamond","Spade","Club"};
	public static final Map<String, Integer> CARD_NAMES_AND_VALUES = createCardNameAndValues();
	
	private static Map<String, Integer> createCardNameAndValues() {
		Map<String, Integer> cardNamesAndValues = new HashMap<String, Integer>();
		cardNamesAndValues.put("Two", 2);
		cardNamesAndValues.put("Three", 3);
		cardNamesAndValues.put("Four", 4);
		cardNamesAndValues.put("Five", 5);
		cardNamesAndValues.put("Six", 6);
		cardNamesAndValues.put("Seven", 7);
		cardNamesAndValues.put("Eight", 8);
		cardNamesAndValues.put("Nine", 9);
		cardNamesAndValues.put("Ten", 10);
		cardNamesAndValues.put("Jack", 10);
		cardNamesAndValues.put("Queen", 10);
		cardNamesAndValues.put("King", 10);
		cardNamesAndValues.put("Ace", 11);
		
		return cardNamesAndValues;
	}
}

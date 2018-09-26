package main.java.com.blackjack.datatransferobject;

import java.util.List;

public abstract class Player {
	private String name;
	private List<Card> cards;
	private int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Card> getCards() {
		return cards;
	}
	public void setCard(Card card) {
		cards.add(card);
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}


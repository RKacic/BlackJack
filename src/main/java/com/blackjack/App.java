package main.java.com.blackjack;

import main.java.com.blackjack.controller.Controller;

public class App {
	private Controller controller = new Controller();
	public static void main(String[] args) {
		//add dependency injection run controller method triggering game flow
		App app = new App();
		app.run();
	}

	private void run() {
		controller.runGame();
	}
	
}

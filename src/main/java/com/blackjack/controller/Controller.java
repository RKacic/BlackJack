package main.java.com.blackjack.controller;

import java.util.Scanner;

import main.java.com.blackjack.view.UserIOImplementation;

public class Controller {
	
	private UserIOImplementation userIO = new UserIOImplementation(new Scanner(System.in)) ;
			
	public void runGame(){
		userIO.welcomeStatement();
	}
}

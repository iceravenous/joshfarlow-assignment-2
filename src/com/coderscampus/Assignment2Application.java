package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
		
		playGame();

	}
	
	private static int getNumber() {
		String guessInput;
		int guess;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick a number between 1 and 100");
		guessInput = scanner.nextLine();
		guess = Integer.parseInt(guessInput);
		while(guess < 1 || guess > 100) {
			
			System.out.print("Oops, that number was not between 1 and 100, try again: ");
			guessInput = scanner.nextLine();
			guess = Integer.parseInt(guessInput);
		}

		return guess;
	}
	private static boolean checkNumber(int guess, int theRandomNumber, int guessesLeft) {
		while (guessesLeft >= 1 && guess != theRandomNumber) {
			if (guess > theRandomNumber) {
				System.out.print("Pick a lower number ");
				guessesLeft -= 1;
			}
			else if (guess < theRandomNumber) {
				System.out.print("Pick a higher number ");
				guessesLeft -= 1;
			}
			else if (guess == theRandomNumber) {
				System.out.println("You are correct!");
			}
			guess = getNumber();
	}
		if (guess == theRandomNumber) {
			return true;
		} else {
			return false;
		}
	}

	private static void playGame() {
		int theRandomNumber = 0;

		int guess = 0;
		int guessesLeft = 4;
		Random random = new Random();
		theRandomNumber = random.nextInt(100);
		boolean correctNumber = false;
		
		guess = getNumber();
		correctNumber = checkNumber(guess, theRandomNumber, guessesLeft);
		
		if (correctNumber == true) {
			System.out.println("You win!");
			System.out.println("The number to guess was: " + theRandomNumber);
		}
		else {
			System.out.println("You lose!");
			System.out.println("The number to guess was: " + theRandomNumber);
		}
	}

}

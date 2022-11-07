package com.coderscampus.assignment1;

import java.util.Random;
import java.util.Scanner;

public class guessingGame {
	
	public static void main  (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int number = random.nextInt(100)+1;
		int guess = 1;
		String guessString;
		
		System.out.println("You have 5 guesses to figure out the random number between 1 and 100 GL! ");
		
		
		 for(int n=4; n>=0; n--) {
			guessString = scanner.nextLine();
			guess = Integer.parseInt(guessString);
			System.out.println(guess);
			while (1 > guess || guess > 100) {
				System.out.println("Your guess needs to be between 1 and 100");
				guessString = scanner.nextLine();
				guess = Integer.parseInt(guessString);
			}
			System.out.println("Guesses left " + n);
			if (guess == number){
				System.out.println("Congrats you got it!");
				n = 0;
				}
			else if (guess < number) {
				System.out.println("The number is higher");
			}
			else {
				System.out.println("The number is lower");
			}
				
		} 
		
		scanner.close();
		
	}
		

}

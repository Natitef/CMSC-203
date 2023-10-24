package ESPGame;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {
	public static void main(String[] args) {
		/*
		 * Class: CMSC203 
		 * Instructor:
		 * Description: (Give a brief description for each Class)
		 * Due: 09/12/2023
		 * Platform/compiler:
		 * I pledge that I have completed the programming assignment 
		* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
		 * Print your Name here: Nathan Tefera
		*/

	    String name;
	    String details;
	    String dueDate;
	    final String COLOR_RED = "red";
        final String COLOR_GREEN = "green";
        final String COLOR_BLUE = "blue";
        final String COLOR_ORANGE = "orange";
        final String COLOR_YELLOW = "yellow";
        final String COLOR_PURPLE = "purple";
        final String COLOR_BLACK = "black";
        int Guesses = 0;
        Random random = new Random();
        
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your name: ");
	    name = scan.nextLine();
	    System.out.println("Describe yourself: ");
	    details = scan.nextLine();
	    System.out.println("Due Date: ");
	    dueDate = scan.nextLine();
	    System.out.println("CMSC203 Assigment1: Test your ESP skills!");
	    System.out.println("I am thinking of a color\n");
	    
		
		
		for(int i = 0; i<11;i++) {
			int randomNumber= random.nextInt(7);
			String randomColor = "";
			
			switch (randomNumber) {
            case 0:
                randomColor = COLOR_RED;
                break;
            case 1:
                randomColor = COLOR_GREEN;
                break;
            case 2:
                randomColor = COLOR_BLUE;
                break;
            case 3:
                randomColor = COLOR_ORANGE;
                break;
            case 4:
                randomColor = COLOR_YELLOW;
                break;
            case 5:
                randomColor = COLOR_PURPLE;
                break;
            case 6:
                randomColor = COLOR_BLACK;
                break;
        }
			System.out.println("Is it Red, Green, Blue, Orange, Yellow, Purple, or Black\n");
			System.out.println("Enter your guess: ");
			String color = scan.nextLine();	
			if(color.toLowerCase().equals(randomColor)) {
				System.out.println("I was thinking of "+randomColor+"\n");
				Guesses++;
				
				
			}
			else {
				
				System.out.println("You entered incorrect color. Guess again \n");
				
				
            }
			}
		
		
		
		System.out.println("You guessed the correct color " + Guesses + " times out of 11.");
		System.out.println("User Name: "+name+"\n");
		System.out.println("User Description: "+details+"\n");
		System.out.println("Due Date: "+dueDate+"\n");
		
		
		
	  }
}

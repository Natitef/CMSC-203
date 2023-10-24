package lab1;
import java.util.*;


public class MovieDriver {
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Movie MovieObj = new Movie();
		String choice="";
		while(true) {
		System.out.println("Enter the title of a movie: ");
		MovieObj.setTitle( scan.nextLine());
		
		System.out.println("Enter the movie's rating: ");
		MovieObj.setRating( scan.nextLine());
		
		System.out.println("Enter number of sold tickets: ");
		MovieObj.setSoldTickets(scan.nextInt());
		
		System.out.println(MovieObj.toString());
		scan.nextLine();
		System.out.println("Do you want to enter another (y or n)");
		
		choice = scan.nextLine();
		if(choice.equals("n")) {
			System.out.println("Goodbye");
			break;
			
		}
		else if(choice.equals("y")) {
			continue;
		}
		
		
		
		
		
	}
	

	}}

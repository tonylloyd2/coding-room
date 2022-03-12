package guess;
import java.util.*;
public class Guess {
 
public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner= new Scanner(System.in);
		System.out.println("I'm thinking of a number between 1 and 100\n(including both). "
		+ "Can you guess what it is?\n you have only 3 guessing chances");
	    int guess=scanner.nextInt();
		System.out.println("your guessed number is   "+guess);
		int number = random.nextInt(100) + 1;
		System.out.println("My number is  "+number);
		int Numguess=2;
		while(guess!=number && Numguess!=0) 
		 {
			System.out.println("try once more  the numbers 1 to 50 inclusive of both  , you have "+Numguess-- +" trials left");
			guess=scanner.nextInt();
			System.out.println("your guessed number is   "+guess);
			number = random.nextInt(50) + 1;
			System.out.println("My number is  "+number);
 			if(guess!=number && Numguess==1 )
 			{
 			System.out.println("try once more  the numbers 1 to 10 inclusive of both  , you have "+Numguess-- +" trial left");
			guess=scanner.nextInt();
			System.out.println("your guessed number is   "+guess);
			number = random.nextInt(10) + 1;
			System.out.println("My number is  "+number);
			}
		}
		if(guess==number) 
		{
			System.out.println("you won the game");
		}
		else {
			System.out.println("Sorry pal you've run out of guesses \nyou lost the game");
		}
		
		} 
	}



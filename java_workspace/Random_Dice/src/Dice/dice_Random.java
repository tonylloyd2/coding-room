package Dice;

import java.util.*;

public class dice_Random {
	Random random = new Random();
	Scanner scanner = new Scanner (System.in);
    int Dice_number;
    //create a consructor
    dice_Random(){
     	
    	rolldice();
    }
	private void rolldice() {
	    Dice_number = random.nextInt(6)+1;
 		System.out.println(" enter your lucky dye number");
 		int number_user = scanner.nextInt(); 
 		
 	   if ( number_user == Dice_number ) {
 		   System.out.println( "your number  "+number_user+ " matches  the dye number : "+ Dice_number +" \nyou won the game" );
 	   }
 	   else {
 		   System.out.println("you lost the guess  dice number = "+Dice_number + " your entry "+ number_user);
 	   }
 		
	}
    
}

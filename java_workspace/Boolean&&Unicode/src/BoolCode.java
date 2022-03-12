import java.util.*;
public class BoolCode {
 @SuppressWarnings("unused")
public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       Random random=new Random();
	   System.out.println("booleans or unicode");
	   String responce=scanner.next();
	   responce=responce.toUpperCase();
		switch(responce) {
		case "BOOLEAN":case "Boolean":case "boolean"://boolean answer1=true;boolean answer2=true;
			System.out.println("am thinking of a boolean string try to guess what am thinking is it true or false?");
			boolean guess=scanner.hasNextBoolean();
   			boolean answer=random.nextBoolean();
	        System.out.println("your boolean entry is "+guess);
	        System.out.println("my boolean thought is "+answer);
	      //  System.out.println( guess==answer ? "you won my thoughts ":"  you've lost the game \\n"+ " to be honest you will never win  (: \""    );
//alternative	
	        if(guess==answer) {
           System.out.println("you've  won my thoughts ");
 }
				else {
					System.out.println("you've lost the game \n to be honest you will never win  (: ");
				}
		break;//exiting the first case
		case "unicode":case "Unicode":case"UNICODE":
			System.out.println("i think unicode deals with characters and integers \n you know what to do.....lets switch   );  \n character or int?");
		    responce=scanner.next();
		    switch(responce) {
		    case "character":case "CHARACTER":case "Character":
		        System.out.println("enter the integer to get the equivalent character ");
		        int  input2=scanner.nextInt();
		        char  input=(char) (input2);
		        System.out.println("your unicode for "+input2+ "  is  "+input);
		    break;//out of case character        
		    case "integer":case "Integer":case "INTEGER":
		    	System.out.println("enter the character to get the equivalent character ");
		        char input1=scanner.next().charAt(0);
		        int input0=(int) (input1);
		        System.out.println("your unicode for "+input1+ "  is  "+input0);
		    break;
		    
		    }
		
		}
		
		
	}

}

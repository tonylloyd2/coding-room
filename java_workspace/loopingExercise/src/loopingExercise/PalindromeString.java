package loopingExercise;
import java.util.Scanner;
public class PalindromeString {
   public static void main(String[] args) {
	   Scanner scanner=new Scanner(System.in);
	    String reverse="";
	   System.out.println("method 1(uses reverse working) or 2(uses loops) ?");
	   int request=scanner.nextInt();
	   switch(request) {
	   case 1:
		     palindrome();//method one
		   break;
	   case 2:
		    Palindrome();//method two
		   break;
	   }
     }

public static void  palindrome() {
	Scanner scanner=new Scanner(System.in);
    String reverse="";
      	System.out.println("enter some string text to see if its palindrome ie moom 121 ;");
			String text=scanner.nextLine(); //getting the string from the user
			for (int i=text.length()-1;i>=0;i--) {
			 reverse+=text.charAt(i);
		  }
	         if (text.equals(reverse)) {
	        	 System.out.println(reverse+" = " + text);
	        	 System.out.println("The string : "+text+" is  a  palindrome");
	         }
	         else {
	        	 System.out.println(reverse+" != " + text + " Hence" );
	        	 System.out.println("the string : "+text+" is not a  palindrome");
	         }
}
public static void Palindrome() {
	   Scanner scanner=new Scanner(System.in);
    	boolean isPalindrome=true;
    	System.out.println("enter some string text to see if its palindrome ie moom 121 ;");
		String text=scanner.nextLine();
	 for (int i=0,j =text.length()-1;i<j;i++,j--) {
		 if(text.charAt(i) == text.charAt(j)) 
			 continue;
			 isPalindrome=false;
			break;
			 }
		System.out.println(isPalindrome ? "palindrome" :"not palindrome");
		
	
}

























}
import java.util.Scanner;
public class lloyd {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Marks");
		double Marks = scanner.nextDouble();
	getGrade(Marks);	
	}
	public static void getGrade(double Marks) {
	 
	   if (Marks>=70 && Marks<=100 ) { System.out.println("A");}
	    else if(Marks>=60 && Marks<70) {System.out.println("B");} 
	    else if(Marks>=50 && Marks<60) { System.out.println("C");} 
	    else if(Marks>=40 && Marks<50) { System.out.println("D");}
	    else if( Marks<40 && Marks>=0) { System.out.println("E");}
	    else {System.out.println("invalid entry");}
	   
	 /*  switch (GRADE) 
	   {case 'A':System.out.println("DISTINCTION");break;
	    case 'B':System.out.println("excellent");break;
	    case 'C':System.out.println("PASS");break;
	    case 'D':System.out.println("FAIL");break;
	    case 'E':System.out.println("RE-TAKE");break; }*/
      	
	}
	   
	   
	   
		}
	



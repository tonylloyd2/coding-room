package methods2;
import java.util.Scanner;
 // @author lloyd
public class Methods
{
 @SuppressWarnings("unused")
public static void main(String[] args) //testclass 
 {
		Scanner scanner=new Scanner(System.in);//scanner instantiation
		System.out.println("hey.......what do you wanna do fella \n1:calculator\n2:factorial calculater");
		int choice = scanner.nextInt();
		switch(choice) 
	  {
		case 1 ://calculator arithmetic
               System.out.print("enter first number  :");
               long num1=scanner.nextLong();
               System. out.print("enter  second number  :");
               long num2=scanner.nextLong();
               System.out.println("choose the operation to be done [' + ' , ' - ' , ' * ' , ' / '  ]");
               char operator=scanner.next().charAt(0);
               long respond1= calculate(num1,num2,operator);
               if (operator=='+' || operator=='-' || operator=='*' || operator=='/') {
		       System.out.println(num1+" "+operator+"  "+num2+"  =   "+respond1);
               }else { System.out.println("invalid entry  try   + , - , * , / ");}
        break ;
		case 2://factorial calculator
			   System.out.println("enter the number to find the factorial");
               int numberFactorial=scanner.nextInt();
               Methods obj=new Methods();//the method Factorial is not static unlike the calculator
               double factorednumber = obj.Factorial(numberFactorial);
               System.out.println("the factorial of  "+(numberFactorial)+"  =  "+factorednumber );
        break ; 
	  } //swtich closing  
		scanner.close();//closing scanner
	}//main class closing
     public  static long calculate(long num1,long num2,char operator) //
         { 
	      long respond = 0;
	         switch(operator) {   
	          case '+':respond=num1+num2;break;
	          case '-':respond=num1-num2;break;
	          case '*':respond=num1*num2;break;
	          case '/':respond=num1/num2;break;
	          //default:System.out.print("invalid operation ");  THE ELSE OVERIDES THE DEFAULT
	          }//operator switch closing
	      return respond;
	    }//closing method calculate
   double Factorial(int numberFactorial) {
	        double factorednumber=1;
            for (int sequencenum=1;sequencenum<=numberFactorial;sequencenum++) {
        	factorednumber *=sequencenum;
        }//closing the for loop
      
      return factorednumber;
      }//closing the method Factorial 	
}//closing the main class Methods

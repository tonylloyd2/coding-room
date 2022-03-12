package exception;
import java.util.InputMismatchException;
import  java.util.Scanner;
public class Exception {
    private static int numerator , denomenator , result ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        try {
             System.out.println("enter numerator ");
             numerator = scanner.nextInt(); 
             System.out.println("enter denomenator");
             denomenator = scanner.nextInt();
             result = numerator / denomenator ; 
             System.out.println("  result = : " + result);
        }
        catch (InputMismatchException error ){
            System.out.println(" input mismatch of data type");
        }  
        catch (ArithmeticException error    ){
         System.out.println(" failed division by zero ");  
        }
        
    }
    
}

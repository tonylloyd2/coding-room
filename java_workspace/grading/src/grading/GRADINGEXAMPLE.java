 
package grading;

/**
 * @author lloyd
 *
 */
import java.util.Scanner;
public class GRADINGEXAMPLE {
public static void main(String[] args) {
int marks;
System.out.println("Enter Marks");
Scanner scanner = new Scanner(System.in);
marks = scanner.nextInt();
if(marks<40){System.out.println("GRADE = E"); }
else if (marks>=40 && marks<50){System.out.println("GRADE = D");}
else if (marks>=50 && marks<60){System.out.println("GRADE = C");}
else if (marks>=60 && marks<70){System.out.println("GRADE = B");}
else if (marks>=70){System.out.println(" GRADE = A");}
else {System.out.println("Invalid marks");}
}
 
}

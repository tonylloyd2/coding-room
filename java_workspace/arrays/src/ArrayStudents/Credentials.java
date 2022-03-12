/**
 * 
 */
package ArrayStudents;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author ccs/00033/020
 * Oduor stanley
 *
 */
public class Credentials {
	
	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		
		 System.out.println("enter the number of students");
			int numberOfStudents=keyIn.nextInt();
			
		
		double[]studentMarks=new double[numberOfStudents];
        String[]studentName=new String[numberOfStudents];
        
//        System.out.println("enter the number of students");
//		int numberOfStudents=keyIn.nextInt();
//		
//		studentMarks=new double[numberOfStudents];
//		studentName=new String[numberOfStudents];
//		
        for(int j=0;j<numberOfStudents ;j++) {
        	
        System.out.println("The name of the student"+(j+1)+" :");
        studentName[j]= keyIn.next();
        }
      for(int i=0;i<numberOfStudents;i++)  {
        System.out.println("Enter the student marks for "+studentName[i]);
        studentMarks[i]=keyIn.nextDouble();
        
      }
      
      for (int k=0;k< numberOfStudents;k++)
        {
    	 Arrays.sort(studentMarks);
        	System.out.println("NAME:  "+studentName[k] +"   SCORE:"+studentMarks[k]);
      
        }
        	
	}
}

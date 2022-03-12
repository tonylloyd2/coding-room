
package employee;
 //author lloyd
import java.util.Scanner;


public class Employee {
 public static String EmployeeNo;
 public static String EmployeeName;
 public static double BasicPay;
 public static double NetPay;
       
     public static void main(String[] args) {
         Scanner scanner  =  new  Scanner (System.in);
         System.out.println(" Enter Name ");
         EmployeeName =  scanner.next();
         System.out.println(" Enter Employee number");
         EmployeeNo = scanner.next(); 
         System.out.println(" Enter Basic salary");
         BasicPay = scanner.nextInt();
         
          Deduction ded = new Deduction();
           
           NetPay  = BasicPay - ( Deduction.nHif () + Deduction.paye() +Deduction.nssf() );
          
           System.out.println(" Name   =  : " +EmployeeName);
           System.out.println(" employee number  =  : " +EmployeeNo);
           System.out.println("Basic Salary =  : " +BasicPay);
           System.out.println("Netpay =  : " +NetPay);
     }
    
}

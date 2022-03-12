package ASSIGNMENT3;
import java.util.Scanner;
public class test {
 
	public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
	int TIME,DISTANCE,engineCAPACITY,YEAR,carryingCAPACITY,num;
	  String color1,make1,cartype,plate;
           System.out.println("specify if the vehicle is a  lorry or car and number of vehicles");
			 cartype=scan.nextLine();
			 num = scan.nextInt();
			System.out.println("driving hours per day");
			 TIME=scan.nextInt(); 
	        System.out.println("average distance of the drive");
	         DISTANCE=scan.nextInt();
	        System.out.println("enter year of make");
	         YEAR=scan.nextInt();
	         scan.nextLine(); 	        //clearing the scanner coz of int following string type
	        System.out.println("enter the color");
		        color1=scan.nextLine();
		    System.out.println("enter the make-type of the vehicle");
		         make1=scan.nextLine();
		    System.out.println("enter the registration number of the "+cartype);
		         plate=scan.nextLine();
		    System.out.println("set the engine capacity");
	          engineCAPACITY=scan.nextInt();
	  
	         vehicle v1=new vehicle( cartype,YEAR);
		        v1.setEnginecapacity(engineCAPACITY);
		        v1.calculatemileage(DISTANCE);
		                
 	         if (cartype.equals("car")) 
	  
	  {      
         	car c1=new car(cartype);
    		c1.enginecapacity=engineCAPACITY;
 	        c1.calculatemileage(DISTANCE);
 			c1.calculatemileage(DISTANCE,YEAR);	 
		    System.out.println("NAME:"+make1);
		    System.out.println("YEAR OF MAKE:"+YEAR);
		    System.out.println("COLOR :" +color1);
		    System.out.println("Registration number:" +plate);
		    System.out.println("Average speed: "+DISTANCE/TIME+"Km/h");
		     System.out.println("MILEAGE1: "+c1.calculatemileage(DISTANCE));   //1ST METHOD TO CALCULATE MILEAGE
		    System.out.println("MILEAGE:"+c1.calculatemileage(DISTANCE,YEAR));//OVERLOADED METHOD {CALCULATE MILEAGE}
 
	  }
	  else if (cartype.equals("lorry")) 
	    {     
	        System.out.println("enter the carrying capacity  { in tones }");
            carryingCAPACITY=scan.nextInt();	        
            lorry l1=new lorry(cartype,YEAR,carryingCAPACITY);
		    l1.setEnginecapacity(engineCAPACITY);
	        l1.calculatemileage(DISTANCE);
		      System.out.println("NAME:"+l1.getName());
		      System.out.println("COLOR :" +color1);
		      System.out.println("COLOR :" +plate);
		      System.out.println("YEAR OF MAKE:"+l1.getYearOfMake());
		      System.out.println("ENGINE CAPACITY:"+l1.getEnginecapacity());
		      System.out.println("Average speed: "+DISTANCE/TIME+"Km/h");
		      System.out.println("Mileage:" +l1.calculatemileage(DISTANCE));//OVERRIDEN METHOD {CALCULATEMILEAGE}
	      }
	  }
  
  
  
  
  
  
  
		
	

}

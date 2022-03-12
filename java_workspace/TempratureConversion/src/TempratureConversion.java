 import java.util.*;
class TempratureConversion {
 
	public static void main(String[] args) {
		 Scanner scanner =new Scanner(System.in);
		 System.out.println("enter the temperature to be converted in degress celcius ");
		 float celcius= scanner.nextFloat();
		 float farad=  (celcius* 9/5) + 32;
		 System.out.println(celcius+"  C  =   "+farad+"   F"   );
		 
		 
		 
	}

}

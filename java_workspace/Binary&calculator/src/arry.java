
//import java.sql.SQLOutput;
import java.util.Scanner;
	 
	
	public class arry {

	    public static void main(String[] args) {
	        arry obj = new arry();
	        Scanner in = new Scanner(System.in);
	        System.out.println();
 	        System.out.println("1.Area and Perimeter of a Circle");
	        System.out.println("2.Binary Addition");
	        System.out.println("3.Binary Multiplication");
	        System.out.println("4.Test if the first and the last element of an array of integers are same");
//	        areaCalculator();
	        System.out.print("\nMake a choice: ");
	        int choice = in.nextInt();

	        if (choice == 1){
	            System.out.println();
	            areaCalculator();
	            System.out.println();
	            System.out.println("All Done Fellow Comrade");
	        }
	        else if (choice == 2){
	            System.out.println();
	            binaryAddition();
	            System.out.println();
	            System.out.println("All Done Fellow Comrade");
	        }
	        else if (choice == 3){
	            System.out.println();
	            binaryMultiplication();
	            System.out.println();
	            System.out.println("All Done Fellow Comrade");
	        }
	        else if (choice == 4){
	            System.out.println();
	            arrayElementsChecker();
	            System.out.println("All Done Fellow Comrade");
	            System.out.println();
	        }

	    }
	    static void areaCalculator(){
	        Scanner in = new Scanner(System.in);
	        //Area and perimeter of Circle
	        System.out.print("Enter Radius of circle > ");
	        float r = in.nextFloat();
	        float area = (float) (Math.PI * r * r);
	        float perimeter = (float) (Math.PI * 2 * r);
	        System.out.println("Area > "+area + "\nPerimeter > " + perimeter);
	    }

	    static void binaryAddition(){
	        //Adding two binary numbers
	        Scanner in = new Scanner(System.in);
	        long binary1, binary2;
	        int i = 0, remainder = 0;
	        int[] sum = new int[20];

	        System.out.print("Input first binary number: ");
	        binary1 = in.nextLong();
	        System.out.print("Input second binary number: ");
	        binary2 = in.nextLong();

	        while (binary1 != 0 || binary2 != 0)
	        {
	            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
	            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
	            binary1 = binary1 / 10;
	            binary2 = binary2 / 10;
	        }
	        if (remainder != 0) {
	            sum[i++] = remainder;
	        }
	        --i;
	        System.out.print("Sum of two binary numbers: ");
	        while (i >= 0) {
	            System.out.print(sum[i--]);
	        }
	        System.out.print("\n");
	    }

	    static void binaryMultiplication(){
	        long binary1, binary2, multiply = 0;
	        int digit, factor = 1;
	        try (Scanner in = new Scanner(System.in)) {
				System.out.print("Input the first binary number: ");
				binary1 = in.nextLong();
				System.out.print("Input the second binary number: ");
				binary2 = in.nextLong();
			}
	        while (binary2 != 0)
	        {
	            digit = (int)(binary2 % 10);
	            if (digit == 1)
	            {
	                binary1 = binary1 * factor;
	                multiply = binaryproduct((int) binary1, (int) multiply);
	            }
	            else
	            {
	                binary1 = binary1 * factor;
	            }
	            binary2 = binary2 / 10;
	            factor = 10;
	        }
	        System.out.print("Product of two binary numbers: " + multiply+"\n");
	    }
	    static int binaryproduct(int binary1, int binary2)
	    {
	        int i = 0, remainder = 0;
	        int[] sum = new int[20];
	        int binary_prod_result = 0;

	        while (binary1 != 0 || binary2 != 0)
	        {
	            sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
	            remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
	            binary1 = binary1 / 10;
	            binary2 = binary2 / 10;
	        }
	        if (remainder != 0)
	        {
	            sum[i++] = remainder;
	        }
	        --i;
	        while (i >= 0)
	        {
	            binary_prod_result = binary_prod_result * 10 + sum[i--];
	        }
	        return binary_prod_result;
	    }
	    static void arrayElementsChecker(){
	        try (Scanner in = new Scanner(System.in)) {
				System.out.print("Enter Number Of Elements to input in Array: ");
				int n = in.nextInt();
				int[] num_array = new int[n];

				for (int i = 0;i < n; i++){
				    System.out.print("Enter Element " + i + ": ");
				    int element = in.nextInt();
				    num_array[i] = element;
				}
				boolean comparison = num_array.length >= 2 && num_array[0] ==  num_array[num_array.length-1];
				System.out.println("The test Result says: " + comparison);
			}
	    }
	}



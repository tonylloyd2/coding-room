/**
 * 
 */
package methods;

import java.util.Scanner;

/**
 * @author lloyd
 *
 */
public class Methods { 
	public static void main(String[] args) { int i;
	Scanner scanner =new Scanner(System.in);
	System.out.println("chose numbers 1 to 5 to call a method");
	int select=scanner.nextInt();
	switch(select) 
	{
	case 1:
	 System.out.println("i bet your entry will be printed twice");
     String entry=scanner.nextLine();
     System.out.println();
     printTwice(entry);
     ;break;
	case 2:
		String index[]= {"number 1","number 2","number 3","number 4"};
	    int a []=new int[4];
	   //maybe just use the manual entry....loops inbore
		for( i=0;i<4;i++) {
    	System.out.println("enter "+index[i]);
	     a[i] = scanner.nextInt();
	     scanner.nextLine(); 
		
		}
		//math(a[i], a[i], a[i], a[i]);
	   math(a,a,a,a);
	   break;
	case 3:
		scanner.nextLine(); 
		System.out.println("lets make it complex guess any later from a to c");
		String letter=scanner.nextLine();
		letter=letter.toUpperCase();
		 
		switch(letter) {
		case("A"):methods(letter);break;
		case("B"):methods(letter,letter) ;break;
		case("C"):methods(letter,letter,letter) ;break;
		default:System.out.println("invalid entry");break;
		}
     		
		
	}
	}	
 

private static void math(int[] a, int[] a2, int[] a3, int[] a4) {
		// TODO Auto-generated method stub
	int q;
		System.out.println("we kuja pia u debug");
		//System.out.println( "sum is "+ a[]+ a2[] + a3[] + a4[]);
	}

public static void methods(String a) {
	 a= ("almost");//String b=("come on");String c=("yeah you gat me");
	 System.out.println(a);
	 
}//overloading method methods
public static void methods(String a ,String b) {
	a=("come on");b=("  pal");System.out.println(a + b);
}
public static void methods(String a ,String b,String c) {
	a=("yeah");b=("  you gat");c=("  me");System.out.println(a+b+c);
}

public static void printTwice(String s) {
System.out.println(s);
System.out.println(s);
}
/*public static  int math( int a ,int a2,int a3,int a4) {
	//System.out.println(x+y+z+q);
   
 	return  a+ a2 + a3 + a4;
}*/























}
import java.util.Scanner;
// @author lloyd 
public class Datatypes { 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);//scanner initialization
		String responce="";//responce initialization
		System.out.println("what data type do you want to know the size of ");
	    responce=scanner.next();
		responce=responce.toUpperCase();
		while(!responce.equals("") ) {
		    System.out.println("what data type do you want to know the size of ,IF ALL type all either cases");
		    responce=scanner.next();responce=responce.toUpperCase();
			switch(responce) {
				case  "INTEGER"://integer size
				System.out.println("the max size of an integer is "+Integer.MAX_VALUE +" \n the min of an integer is "+Integer.MIN_VALUE);
				break;
				case "LONG": //long
				System.out.println("the max size of a long is "+Long.MAX_VALUE +" \n the min of a long is "+Long.MIN_VALUE);
				break;
				case "SHORT"://short
				System.out.println("the max size of a short is "+Short.MAX_VALUE +" \n the min of a short is "+Short.MIN_VALUE);
		        break;
		        case "BYTE"://byte
				System.out.println("the max size of a byte is "+Byte.MAX_VALUE +" \n the min of a byte is "+Byte.MIN_VALUE);
				break;
		        case "FLOAT":
		        	System.out.println("the max size of a byte is "+Float.MAX_VALUE +" \n the min of a byte is "+Float.MIN_VALUE);
		        break;	
		        case "DOUBLE":
		        break;
		        case "ALL":
					System.out.println("the max size of an integer is "+Integer.MAX_VALUE +" \n the min of an integer is "+Integer.MIN_VALUE);
					System.out.println("the max size of a long is "+Long.MAX_VALUE +" \n the min of a long is "+Long.MIN_VALUE);
					System.out.println("the max size of a short is "+Short.MAX_VALUE +" \n the min of a short is "+Short.MIN_VALUE);
					System.out.println("the max size of a byte is "+Byte.MAX_VALUE +" \n the min of a byte is "+Byte.MIN_VALUE);
		        	System.out.println("the max size of a float is "+Float.MAX_VALUE +" \n the min of a float is "+Float.MIN_VALUE);
		        	System.out.println("the max size of a double is "+Double.MAX_VALUE +" \n the min of a double is "+Double.MIN_VALUE);
				default:System.out.println(" invalid entry please try again");
              }
	     }
    }

}

import java.util.Arrays;
import java.util.Scanner;
public class subdog extends DOG {

 
	public subdog(String n, String b) 
	   {
		super(n, b);
       }

	public static void main(String[] args) {
		String breed []=new String[7];
		 String name [] =new String[7];
		Scanner scanner=new Scanner(System.in);
		String index[]= {"first","second","third","fourth","fifth","sixth","seventh"};
		//String dogsNo[]= {"d1","d2","d3","d4","d5","d6","d7"};
		int i;
		//String nameEntry;
		for(i=0;i<7;i++) 
		{
			System.out.println("enter the name  of  the  "+ index[i]+"  dog");
			name[i]=scanner.nextLine();	
        }
		for(i=0;i<7;i++) 
		{
			System.out.println("enter the breed  of  the "+ index[i]+"   dog ");
			breed[i]=scanner.nextLine();	
     	 	
	   }  
		//DOG d1=new DOG(breed, name);
        //DOG d2 = new DOG(name,breed);
         
		// System.out.println(d1.getName()+" "+d1.getBreed());
		 //System.out.println(d2.getName()+" "+d2.getBreed());
	
     System.out.println(Arrays.toString(name)+"  "+  Arrays.toString(breed));
 

	}
	
}

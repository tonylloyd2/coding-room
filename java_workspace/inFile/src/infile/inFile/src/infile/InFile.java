 
package infile;
 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class InFile {
    public static void main(String[] args) throws FileNotFoundException {
      try 
      {
          Scanner inFile = new Scanner (  new FileReader ("E:/testfile.txt"));
         
        System.out.println(inFile.nextLine());
        System.out.println(inFile.nextLine());
//        String name = inFile.next();
//        int age = inFile.nextInt();       
//        System.out.println(  "  "+name  +"   age "+age    );
        
      }
      catch ( NoSuchElementException eroor){
          System.out.println(" no such element");
      }
      catch ( FileNotFoundException twer){
          System.out.println(" file not found in the directory");
      }
    
}
}
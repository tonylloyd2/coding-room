import javax.swing.JOptionPane;
import java.util.StringTokenizer;


public class test 

 {
  
   public static void main (String[] args)
 {
      String stat = JOptionPane.showInputDialog(null,
      "Enter a statement","Height",JOptionPane.QUESTION_MESSAGE);
  
    
      System.out.println("Testing Compiler for statement " + stat+"\n");

    
         StringTokenizer st=new StringTokenizer(stat);
	 String akhir=new String();
	 
         System.out.println("The total number or words is " + st.countTokens());


	String mula=new String(st.nextToken());
  
       if(mula.equals("Start")){
 
             while (st.hasMoreTokens())
		{
		  akhir=st.nextToken();
                }
            if(akhir.equals("End"))
		DecState(stat);
	    else
		System.out.println("Missing End statement");
       }             
     else
	System.out.println("Missing Start statement");

}

    public static void DecState(String stat)
	{
	   String pencam;
           StringTokenizer st=new StringTokenizer(stat);
	   st.nextToken();
	   pencam=st.nextToken();	
	   if (("Set").equals(pencam))
	      {
		pencam=st.nextToken();
	        if (Character.isLetter(pencam.charAt(0)))
		  {
	           pencam=st.nextToken();
		   if (("As").equals(pencam))
			{
                          pencam=st.nextToken();
			  if( (("int").equals(pencam))|| (("char").equals(pencam)) ||(("double").equals(pencam)) )
		             System.out.println("Compiler Successful");
			}
		   else	
		     System.out.println(pencam + " Not reconized");	
		  }	
		else
		  System.out.println(pencam + " Not a valid variable name");
	       }
	   else
	     System.out.println(pencam + " Not reconized");
	}
}
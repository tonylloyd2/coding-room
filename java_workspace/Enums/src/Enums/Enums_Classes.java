/**
 * 
 */
package Enums;
// * @author lloyd
class Enums_Classes {

   enum day {
	   MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SARTUDAY,SUNDAY
   }
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	   //instatiating an obj of enum day called today
		day today = day.TUESDAY;
	   
	   //time and date
		
	   
	   switch(today) {
	   case MONDAY:
		   System.out.println("monday");
		   break;
	   case TUESDAY:
		   System.out.println("tuesday");
		   break;
	   case WEDNESDAY:
		   System.out.println("wednesday");
		   break;
	   case THURSDAY:
		   System.out.println("thursday");
		   break;
	   case FRIDAY:
		   System.out.println("friday");
		   break;
	   case SARTUDAY:
		   System.out.println("sartuday");
		   break;
	   case SUNDAY:
		   System.out.println("sunday");
		   break;
	   }
	   

	}

}

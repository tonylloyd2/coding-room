/**
 * 
 */
package time__date;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author lloyd
 *
 */
class Time__Date {

 
	@SuppressWarnings("unused")
	public static void main(String[] args) {
      //displaying current time
		LocalTime local_time = LocalTime.now();
		System.out.println("local time == "+local_time);
	//dispaly current date and time
		LocalDateTime local_date_time = LocalDateTime.now();
		System.out.println(" local date and time : == "+local_date_time);
     //formating date and time
		System.out.println("before formating : "+local_date_time);
		//creating an object of datetime format
	 	DateTimeFormatter date_time_format = DateTimeFormatter.ofPattern("E") ;                                      
        //passing date_time_format arguements to local_date_time
	 	String formatted_Date = local_date_time.format(date_time_format);
	 	//printing out the  formated date
	 	System.out.println("formated Date : == "+formatted_Date);
	}

}

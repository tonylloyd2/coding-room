package timeconversion;
import java.util.Scanner;
public class Timeconversion {
public static void main(String[] args) {
long seconds,minutes,hours,days,month,years,decade,century,milenium;
Scanner scanner=new Scanner(System.in);
final long CONST=31557600000L;long const3=315576000;
final long CONST1=3155760000l;
System.out.println("enter the number of seconds to convert");
long time = scanner.nextLong();
milenium=time/CONST;
century=(time%CONST)/CONST1;
decade=((time%CONST)%CONST1)/const3;
years=(((time%CONST)%CONST1)%const3)/31557600;
month=((((time%CONST)%CONST1)%const3)%31557600)/2592000;
days=(((((time%CONST)%CONST1)%const3)%31557600)%2592000)/86400;
hours=((((((time%CONST)%CONST1)%const3)%31557600)%2592000)%86400)/3600;
minutes=(((((((time%CONST)%CONST1)%const3)%31557600)%2592000)%86400)%3600)/60;
seconds=(((((((time%CONST)%CONST1)%const3)%31557600)%2592000)%86400)%3600)%60;
if(time!=0) {
System.out.printf("\n\nmilenium=%d      century=%d    decades=%d  years = %d   \n months=%d  days= %d   hours= %d  minutes = %d seconds= %d ",milenium,century,decade,years,month,days,hours,minutes,seconds);
}else {
while(time==0) 
{
System.out.println(" invalid entry");
System.out.println("enter the number of seconds to convert again");
time = scanner.nextInt();
 if(time!=0) 
    {
	 milenium=time/31557600000L;century=(time%31557600000L)/3155760000L;decade=((time%31557600000L)%3155760000L)/315576000; years=(((time%31557600000L)%3155760000L)%315576000)/31557600;month=((((time%31557600000L)%3155760000L)%315576000)%31557600)/2592000;days=(((((time%31557600000L)%3155760000L)%315576000)%31557600)%2592000)/86400; hours=((((((time%31557600000L)%3155760000L)%315576000)%31557600)%2592000)%86400)/3600;minutes=(((((((time%31557600000L)%3155760000L)%315576000)%31557600)%2592000)%86400)%3600)/60;seconds=(((((((time%31557600000L)%3155760000L)%315576000)%31557600)%2592000)%86400)%3600)%60;
	 System.out.printf("\n\nmilenium=%d      century=%d    decades=%d  years = %d   \n months=%d  days= %d   hours= %d  minutes = %d seconds= %d ",milenium,century,decade,years,month,days,hours,minutes,seconds);
	}
 }}
scanner.close();	
}
}

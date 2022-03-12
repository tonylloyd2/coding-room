package music;

import java.io.*;
import java.util.*;
import javax.sound.sampled.*;
 
public class mp3player  {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws UnsupportedAudioFileException,IOException,LineUnavailableException{
		 @SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
	     File file=new File("allan.wav");
	   // Random random =new Random();
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file); 
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
        String responce="";
        int i = 0;
		responce =responce.toUpperCase();
		 
        while(!responce.equals("Q")) 
	    	{
			  System.out.println("P to play,l to loop, S to stop ,R to reset and Q to quit ");
			  System.out.println("enter your choice");	
			  responce = scanner.next();
              responce=responce.toUpperCase();
		      switch(responce) 
		     {
		   case("P"):clip.start();
		              
		   break;
		   case("S"):clip.stop();System.out.print("you've paused the music");
		   System.out.println();
		   break;
		   case("Q"):clip.close();System.out.println("you've quit the music");
		   break;
		   case("R"):clip.setMicrosecondPosition(2000000);
		   break;
		   case("L"):
            System.out.println(" enter number of times to loop");
		    clip.loop(scanner.nextInt());
		   break;
		   default:System.out.println("not a valid responce");
		   } }
		}
	}



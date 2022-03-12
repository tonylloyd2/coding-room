package music;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.plaf.ColorChooserUI;

import org.w3c.dom.css.RGBColor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



@SuppressWarnings("serial")
public class MainTest extends JFrame  implements ActionListener {
   //components variables to the jframe
	JLabel title;
	JTextField number_of_loop;
    JButton play_or_pause,loop,reset,quit,pause;
    Panel panel;
    JLabel container_label;
    JPopupMenu popup;
	Border border = BorderFactory.createLineBorder(Color.green,4);

    //components variables of the file
    Scanner scanner;
    File file;
    AudioInputStream audioStream ;
    Clip clip;
    
    
    //constructors to the main class
	public MainTest() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
		//set the frame attributes
		setVisible(true);
		setLayout(null);
		setResizable(true);
		setSize(800,800);
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//border
		//instatiating objects to the file allan.wav
		scanner =new Scanner(System.in);
		file=new File("allan.wav");
		audioStream = AudioSystem.getAudioInputStream(file); 
	    clip = AudioSystem.getClip();
		clip.open(audioStream);

		
		
		//set the frame components
		title = new JLabel("Simple mp3");
		title.setBounds(300, 0, 300, 20);
		title.setFont(new Font("Lucida Calligraphy",Font.BOLD,20));
		
		//setting up buttons
		//play button
		play_or_pause = new JButton("play / pause");
		play_or_pause.setBackground(Color.cyan);
		play_or_pause.setBackground(getBackground());
	    play_or_pause.setBounds(250,100,100,50);
		play_or_pause.setFont(new Font("Lucida Calligraphy",Font.BOLD,10));
        play_or_pause.addActionListener(this);
		// quit button
        quit = new JButton("quit");
        quit.setBackground(getBackground());
        quit.setBounds(350,100,100,50);
        quit.addActionListener(this);
        //pause button
        pause = new JButton("pause");
        pause.setBackground(Color.cyan);
		pause.setBackground(getBackground());
	    pause.setBounds(550,100,100,50);
		pause.setFont(new Font("Lucida Calligraphy",Font.BOLD,10));
        pause.addActionListener(this);
        // reset button
        reset = new JButton("reset");
        reset.setBackground(Color.cyan);
		reset.setBackground(getBackground());
	    reset.setBounds(650,100,100,50);
		reset.setFont(new Font("Lucida Calligraphy",Font.BOLD,10));
        reset.addActionListener(this);
        //loop button
        loop = new  JButton("loop");
        loop.setBackground(Color.cyan);
		loop.setBackground(getBackground());
	    loop.setBounds(450,100,100,50);
		loop.setFont(new Font("Lucida Calligraphy",Font.BOLD,10));
        loop.addActionListener(this);
        
        
        
        
        
        
        
		//add items to the frame
	   	 add(play_or_pause);
	   	 add(pause);
	   	 add(reset);
	   	 add(loop);
	   	 add(quit);
         add(title);	
         add(panel);
	}
	
	
   public boolean play( ) {
 			return true;
		}
		
	
	


			//	event handling in java
	public void actionPerformed(ActionEvent onclick_event) {
	
		
    	   if (onclick_event.getSource().equals(quit) ) {
				
    		   JOptionPane.showMessageDialog(null,"you are about to terminat the music ","quit",JOptionPane.INFORMATION_MESSAGE); 
    		   clip.close();
    		   setDefaultCloseOperation(EXIT_ON_CLOSE);

		 		 
			}
    	   if(onclick_event.getSource().equals(play_or_pause)) {
				clip.start();System.out.println("playing");

			}
    	   if(onclick_event.getSource().equals(pause)) {
				
    		    JOptionPane.showMessageDialog(null,"paused the music"," paused",JOptionPane.INFORMATION_MESSAGE);
         	    clip.stop();
    		   
    	   }
    	   
		  
		   if (onclick_event.getSource().equals(loop) ) {
				
				JOptionPane.showMessageDialog(null," please in put the number of time to loop then press loop"," having a problem to loop",JOptionPane.INFORMATION_MESSAGE);
				 clip.loop(2);
		     }
		   if(onclick_event.getSource().equals(reset)) {
      		    JOptionPane.showMessageDialog(null,"reset???????,", "reset options",JOptionPane.INFORMATION_MESSAGE);
      		    clip.setMicrosecondPosition(0);
		   }
			
	    	}

         


}

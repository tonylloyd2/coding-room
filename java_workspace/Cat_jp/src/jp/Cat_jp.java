/**
 * 
 */
package jp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

 // @author lloyd
 
 
@SuppressWarnings("serial")
public class Cat_jp extends JFrame implements ActionListener{
	JTextArea first_hour,second_hour,first_minute , second_minute;
	JLabel title,first_time,Second_time ,Hour1,Hour2,Minute1,Minute2, output;
	JButton AddTimes;
	public Cat_jp() {		 
			//set the frame attributes
			setVisible(true);
			setLayout(null);
			setResizable(true);
			setSize(500,500);
			setTitle("Add Times");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		    AddTimes = new JButton("Add the Times");
		    AddTimes.setBounds(10 , 120 , 225, 20);  
		    AddTimes.addActionListener(this);
			output = new JLabel("The resultant time is : ");
			output.setBounds(100,150,200, 40);
			//set the frame components
			title = new JLabel();
			title.setText("Add times");
			title.setBounds(200, 10, 80, 20);
			first_time = new JLabel();
			first_time.setText("First time :");
			first_time.setBounds(10, 40,80, 20);
			first_hour = new JTextArea();
			first_hour.setBounds(95, 40, 40, 20);
			Hour1 = new JLabel("Hour");
			Hour1.setBounds(140, 40,40, 20);
			Minute1 = new JLabel("Minute"); 
			first_minute = new JTextArea();
			first_minute.setBounds(170, 40,40,20);
			Minute1.setBounds(225 ,40 , 40 , 20);
            
			Second_time = new JLabel("Second Time");
			Second_time.setBounds(10, 80,80 ,20);
			second_hour = new JTextArea();
			second_hour.setBounds(95, 80,40,20);
			Hour2 = new JLabel("Hour");
			Hour2.setBounds(140, 80,40,20);			
			second_minute = new JTextArea();
			second_minute.setBounds(170,80,40,20 );
			Minute2 = new JLabel("Minute");
			Minute2.setBounds(225,80, 40, 20);
					
			//add frame components to the frame
			add(AddTimes);
			add(title);
			add(Second_time);
			add(second_hour);
			add(second_minute);
			add(Hour2);
			add(Minute2);
			add(output);
			add(Hour1);
			add(first_minute);
			add(Minute1);
			add(first_time ); 
			add(first_hour);
			add(AddTimes);
//			add(details);
		
	}
	public static void main(String[] args) {
 			new Cat_jp();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == AddTimes ) {
			
			
			
			if( Integer.parseInt(first_minute.getText()) >= 60 ||
				Integer.parseInt(second_minute.getText()) >= 60 ) {
				output.setText(" minutes should be less than '60' ");
			}
			else {
				int minutes = Integer.parseInt(first_minute.getText()) + Integer.parseInt(second_minute.getText())  ; 
				int hours = Integer.parseInt(first_hour.getText()) + Integer.parseInt(second_hour.getText())  ;
				if (minutes % 60  == 0 || minutes == 60) {
					minutes = 00;
					hours = hours + 1;
				}
				if(minutes % 60 > 0 && minutes > 60) {
				    minutes = minutes - 60;
				    hours = hours + 1;
				}
				String time = hours+" : " + minutes ; 
				output.setText(time);	
			}
		}
	}
}






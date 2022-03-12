package gui;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorChooserUI;
@SuppressWarnings("serial")
public class main1  extends JFrame implements ActionListener{ 
		 
	        JTextArea textfield = new JTextArea();
			final int width = 500;
			final int height = 600;;
			JMenuBar menubar = new JMenuBar();
			JMenu FILE,EDIT,FORMAT,VIEW,HELP;//variables
			JMenuItem new1,new_window,open,save,save_as,page_setup,print,exit, //file submenus
			undo,cut,copy,paste,delete,search_with,find,find_next,find_previous,replace,goTo,select_All,Time_Date,//edit submenus
			word_wrap,font,//format submenus
			Zoom,zoom_in,zoom_out,restore_default_zoom, //view sumenus
			Status_bar,view_help,send_feedback,About_notepad;//help submenus
			
			
			//border to the textarea
			Border border = LineBorder.createBlackLineBorder();
		
			//imageicon 
			ImageIcon image = new ImageIcon("logo.png");
			
			//create a constructor of the frame
			 main1(){
				setVisible(true);
				setSize(width,height);
				setResizable(true);
				setJMenuBar(menubar);//add the menubar to the frame
				setTitle("  Note pad");
				setIconImage(image.getImage());
				
		
				
				//main menu items
			     FILE = new JMenu("file");EDIT = new JMenu("Edit");FORMAT = new JMenu("Format");VIEW = new JMenu("View");HELP = new JMenu("Help");
		         //instatiating submenu items
		         new1 = new JMenuItem("New");new_window = new JMenuItem(" New window");open = new JMenuItem("Open");save = new JMenuItem("Save");save_as = new JMenuItem("Save as ");page_setup = new JMenuItem("Page setup ");print = new JMenuItem("Print");exit = new JMenuItem(" Exit ");
		         undo = new	JMenuItem(" Undo ");cut = new JMenuItem("Cut ");copy = new JMenuItem("Copy");paste = new JMenuItem("Paste"); delete = new JMenuItem(" Delete");search_with = new JMenuItem("Search with ");find = new JMenuItem("Find");find_next = new JMenuItem("Find Next..");find_previous = new JMenuItem("Find Previous");replace =new JMenuItem("Replace");goTo = new JMenuItem("GoTo ");select_All = new JMenuItem("Select All"); Time_Date = new JMenuItem("Time/Date");
		         word_wrap = new JMenuItem("Word wrap"); font = new JMenuItem("Font..");
		         Zoom = new JMenuItem("Zoom");zoom_in = new JMenuItem("Zoom in ");zoom_out = new JMenuItem("Zoom out ");restore_default_zoom = new JMenuItem("Restore zoom default");
		         Status_bar =new JMenuItem("Status bar");view_help = new JMenuItem("View help");send_feedback = new JMenuItem("Send feedback");About_notepad = new JMenuItem("About notepad");
				 //setting gaps between the menu items
		         //adding mini submenus to submenus
		          
		          
		         //addin submenu items to menus
		         FILE.add(new1);FILE.add(new_window);FILE.add(open);FILE.add(save);FILE.add(save_as);FILE.add(page_setup);FILE.add(print);FILE.add(exit);
		         EDIT.add(undo);EDIT.add(cut);EDIT.add(copy);EDIT.add(paste);EDIT.add(delete);EDIT.add(search_with);EDIT.add(find);EDIT.add(find_next);EDIT.add(find_previous);EDIT.add(replace);EDIT.add(goTo);EDIT.add(select_All);EDIT.add(Time_Date);
		         FORMAT.add(word_wrap);FORMAT.add(font);
		         VIEW.add(Zoom);VIEW.add(zoom_in);VIEW.add(zoom_out);VIEW.add(restore_default_zoom);
		         HELP.add(Status_bar);HELP.add(view_help);HELP.add(send_feedback);HELP.add(About_notepad);
		    
		         
		         //adding eventlisteners to copy cut and paste and select
		         cut.addActionListener(this);
		         copy.addActionListener(this);
		         paste.addActionListener(this);
		         select_All.addActionListener(this);
		         
				//adding menu items to the jmenubar
				menubar.add(FILE);
				menubar.add(EDIT);
				menubar.add(FORMAT);
				menubar.add(VIEW);
				menubar.add(HELP);
				
				//edttin the textfield 
//				textfield.setBackground(new Color(133,60,60))
				textfield.setAlignmentX(0);
				textfield.setAlignmentY(200);
				textfield.setFont(new Font("Lucida Calligraphy",Font.BOLD,20));
				add(textfield);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
			
			
			
			
			@Override
			public void actionPerformed(ActionEvent event_on_click) {
				if(event_on_click.getSource().equals(copy) ) {
					textfield.copy();
				}
				if(event_on_click.getSource().equals(paste) ) {
					textfield.paste();;
				}
				if(event_on_click.getSource().equals(cut)) {
					textfield.cut();;
				}
				if(event_on_click.getSource().equals(select_All)) {
					textfield.selectAll();;
				}
				
			}

		}

	 
		




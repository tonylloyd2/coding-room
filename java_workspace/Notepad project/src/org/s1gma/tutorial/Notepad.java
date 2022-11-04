package org.s1gma.tutorial;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.FileFilter;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * @author lloyd
 */
public class Notepad extends JFrame implements ActionListener {
    private JTextArea area = new JTextArea(); 
    
    private JMenuBar newMenubar() {
        JMenuBar menubar = new JMenuBar(); //Sets up the menubar
        String[] titles = {"File", "Edit","View"};    //
        String[][] elements = {
                               {"New", "Open", "Save","print","exit"}, 
                               {"Undo" , "cut" , "copy" ,"paste","Delete" , "Find" ,"find next" , "find previous","replace","go to","select all","time/date","font"},
                               {"zoom"}  
                            };  
        for(int i = 0; i < titles.length; i++) { // basically loops through the menu titles
            String title = titles[i]; // selects the titles from the loop
            String[] elems = elements[i];//basically finds the menuitems for the menu
            menubar.add(newMenu(title, elems)); // adds a new menu with the title and elements

        }
        return menubar;//Returns the menubar ok
    }

    /**
     *
     * @param title The title like "File"
     * @param elements  The elements like "New", "Load", "Save"
     * @return  returns the JMenu
     */
    private JMenu newMenu(String title, String[] elements) {
        JMenu menu = new JMenu(title); //Creates a new JMenu with the title
        for(String element : elements) { //
            JMenuItem menuitem = new JMenuItem(element);
            menu.add(menuitem); // uses the add method in the JMenu class for our menu to add them menuitems
            menuitem.addActionListener(this);
        }
        return menu;
    }
     

    private Notepad() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());// system theme
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        
        setSize(800, 600); 
        setJMenuBar(newMenubar());
        JScrollPane scroller = new JScrollPane(area);//it has the area(JTextArea) in it to select what its the container fork
        scroller.setBorder(BorderFactory.createEmptyBorder());
        add(scroller); 
        
    }

    public static void main(String[] args) {
        new Notepad().setVisible(true);
    
    }

    public void actionPerformed(ActionEvent actionEvent) {
        String cmd = actionEvent.getActionCommand(); // basically retrieves what you've clicked ok
        //FILE MENU ITEMS
        if(cmd.equals("Save")) { // If the button pressed has the text "Save" on it do something inside.
            JFileChooser chooser = new JFileChooser(); // sets up the file choosing dialog. ok
            int option = chooser.showSaveDialog(this); // Shows the save dialog and is the option for what you've clicked
            if(option == JFileChooser.APPROVE_OPTION) {   //if you've pressed the ok or save button or w/e do somethingok
                try {
                    BufferedWriter buf = new BufferedWriter(new FileWriter(chooser.getSelectedFile().getAbsolutePath()));
                    //^ Basically the bufferedwriter is something used for writing to a file along with filewriter
                    // yeah and the chooser.getSelectedFile().getAbsolutePath() basically finds the place in the filechooserik
                    //and writes to it.
                    buf.write(area.getText()); // basically this gets the text in the text area and writes it to the file
                    setTitle(chooser.getSelectedFile().getName()); //this basically gets the file name in the chooser. rofl thisi s easy lol :d thnx, i told you it wasnt hard :Pyh
                    buf.close(); // closes the stream for memory purposesk, now we can run it
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } 
        else if(cmd.equals("Open")) {
            JFileChooser chooser = new JFileChooser(); // filechooser object
            chooser.setFileFilter(new Filter());
            int option = chooser.showOpenDialog(this); // same as before but with open this time. ok w8
            if(option == JFileChooser.APPROVE_OPTION) {
                try {
                    Scanner scanner = new Scanner(chooser.getSelectedFile()); // gets the selected file from chooser
                    while(scanner.hasNext()) {
                        String data = scanner.nextLine(); // Read lines inside the scanner
                        area.setText(data);
                    }
                    setTitle(chooser.getSelectedFile().getName());
                    scanner.close(); // close the scanner for memory purposes.
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        else if(cmd.equals("exit")){
            // System.out.println("window closed");
            dispose();
        }
        else if(cmd.equals("print")){
            try {
                //printer dialog will open
                area.print();
            }catch (Exception e) {
                e.printStackTrace();
            }
        } 
        else if (cmd.equals("New")) {
            area.setText("");
         }
        //EDIT MENU ITEMS
        else if (cmd.equals("Undo")) { }
        else if (cmd.equals("cut")) {
             area.cut();
        }
        else if (cmd.equals("copy")) { 
            area.copy();
        }
        else if (cmd.equals("paste")) {
            area.paste();
         }
        else if (cmd.equals("Delete")) { }
        else if (cmd.equals("Find")) { }
        else if (cmd.equals("find next")) { }
        else if (cmd.equals("find previous")) { }
        // else if (cmd.equals("replace")) { 
        //    //search for the string first
        //    JFrame searchFrame = new JFrame("seach box"); 
        //    searchFrame.setVisible(true);
        //    searchFrame.setSize(100,50);
        //    searchFrame.setLocation(100, 30);
        //    searchFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //    searchFrame.setDefaultLookAndFeelDecorated(true);
        //    JTextField searchtext = new JTextField("enter word to replace");
        //    JButton search  = new JButton("search");
        //    searchtext.setBounds(0, 0, 150, 10);
        //    search.addActionListener(new ActionListener() { 
        //     public void actionPerformed(ActionEvent e) { 
        //      String text_replace = searchtext.getText();
        //     } 
        //   } );
        //    searchFrame.add(searchtext);
        //    searchFrame.add(search);
           
           
           
           
        //     // String txt = area.getText();
        //     // String txt2 = search.getText();
        //     // String txt3 = replace.getText();
        
        //     // if (txt.toLowerCase().contains(txt2.toLowerCase())) {
        //     //         textArea.setText(txt.replaceAll("(?i)" + txt2, txt3));
        
        //     // }
        //     // String text = area.getSelectedText().toString();
        //     // area.replaceSelection(content);
        // }
        else if (cmd.equals("go to")) { }
        else if (cmd.equals("select all")) {
             area.selectAll(); }
        else if (cmd.equals("time/date")) {
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String formattedDate = myDateObj.format(myFormatObj);
            area.setText(formattedDate);
         }
        else if (cmd.equals("font")) {
            // JOptionPane.showConfirmDialog(null, fontFamilyList, "Choose Font Family", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            // fontFamily = String.valueOf(fontFamilyList.getSelectedValue());
            // newFont = new Font(fontFamily, fstyle, fsize);
            // area.setFont(newFont);
         }
        //VIEW
        else if (cmd.equals("zoom")) { }
        
    }
    
    class Filter extends javax.swing.filechooser.FileFilter implements FileFilter {

        public boolean accept(File file) {
            return file.getName().endsWith(".area") || file.getName().endsWith(".java");
        }

        @Override
        public String getDescription() {
            return "Text File (.area)";  
        }                                              
    }
}

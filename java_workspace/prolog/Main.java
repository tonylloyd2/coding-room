package com.company;


import org.jpl7.PrologException;
import org.jpl7.Query;
import org.jpl7.Term;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //calling call frontend which has all the code for the Giu and prolog
frontend frontend = new frontend();
frontend.Main();

        // write your code here
    }

}
class frontend {
    //setting Jframe properties as global variables in class frontend
    JFrame frame = new JFrame("prolog");
    JButton run = new JButton("check");
    final JTextField txt = new JTextField();
    JTextField textField = new JTextField();
    final JLabel label1 = new JLabel();
    JTextArea terminal = new JTextArea();
    public void Main() {
//this method redirect frontend terminal out-stream to RedirectingOutputStream class
        frontend gui = new frontend();
        gui.createFrame();
        System.setOut(new PrintStream(new RedirectingOutputStream(gui), true));
        System.setIn(System.in);
        gui.frameVisibility();

    }
    void createFrame() {

        Image icon = Toolkit.getDefaultToolkit().getImage("swipl.png");
        frame.setIconImage(icon);

        label1.setBounds(300, 130, 300, 30);
        txt.setBounds(300, 100, 300, 30);
        textField.setBounds(300, 150, 350, 30);
        terminal.setBounds(200,400,500,100);
        run.setBounds(400, 200, 80, 40);
        frame.setSize(1000, 1000);
        frame.add(run);
        frame.add(txt);
        frame.add(textField);
        frame.add(label1);
        frame.add(terminal);

        textField.setText("Enter your query here");
        //we set an action listener on button "run",to check the validity of the user's assertion
        run.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    //assigning prolog file location path to a String
                    String con = "consult('/home/cypher/Documents/ccs315_intelligent/intelligent.pl')";
  /*                  Query q1 =
                            new Query(
                                    "consult",
                                    new Term[] {new Atom("/home/cypher/Documents/class projects (2)/intelligent_is/src/com/company/test.pl")}
                            );
                    System.out.println( "consult " + (q1.hasSolution() ? "succeeded2" : "failed2"));

*/
/*
                  Query query = new Query(con);
                    //System.out.println(query.hasSolution() ? "success" : "false");
                    String q =textField.getText();
                    Query query1= new Query(con);
                    //label1.setText(String.valueOf(query1.goal()));
                    if(query1.hasSolution(con)) {

                     System.out.println(query1.hasSolution() ? "true yes n has solution" : "false");
                    }
                    else {
                        System.out.println("has no solution");
                    }
                   // txt.setText(query1.hasSolution()?"true":"false");*/
                    Query query = new Query(con);
                    //DO NOT REMOVE OR COMMENT THIS LINE!!!!!!!!!!!
                 System.out.println(query.hasSolution() ? "":"");
                 //Getting user input or query
                    String q =textField.getText();
                    Query n = new Query(q);
                    System.out.println(n.hasSolution() ? "Query true":"not true");

                }
                catch (PrologException ex){
                    System.out.println(ex);
                }

            }
        });
        frame.setLayout((LayoutManager)null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void frameVisibility(){
        frame.setVisible(true);
    }
    public void appendText(String text) {

        terminal.append(text);
    }

}
class RedirectingOutputStream extends OutputStream {

    private frontend gui;

    public RedirectingOutputStream(frontend gui) {
        this.gui = gui;
    }

    @Override
    public void write(int b) throws IOException {
        gui.appendText(String.valueOf((char) b));
    }
}

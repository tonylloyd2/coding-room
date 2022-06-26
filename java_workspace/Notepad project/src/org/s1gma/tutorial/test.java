package org.s1gma.tutorial;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.FileFilter;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class test {
    public static void main(String[] args) {
            // String txt = area.getText();
            // String txt2 = search.getText();
            // String txt3 = replace.getText();
            // if (txt.toLowerCase().contains(txt2.toLowerCase())) {
            //         textArea.setText(txt.replaceAll("(?i)" + txt2, txt3));
            // }
            // String text = area.getSelectedText().toString();
            // area.replaceSelection(content);
        JFrame searchFrame = new JFrame("seach box"); 
        searchFrame.setVisible(true);
        searchFrame.isResizable();
        searchFrame.setSize(250,100);
        searchFrame.setLocation(300, 30);
        searchFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        searchFrame.setDefaultLookAndFeelDecorated(true);
        JTextField searchtext = new JTextField("enter word to replace");
        JButton search  = new JButton("search");
        search.setBounds(50,0,50,250);
        searchtext.setBounds(0, 0, 50, 250);
        search.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
          String text_replace = searchtext.getText();
         } 
       } );
        searchFrame.add(searchtext);
        searchFrame.add(search);
    }
}

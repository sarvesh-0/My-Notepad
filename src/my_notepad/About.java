package my_notepad;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class About extends JFrame{
    About() {
        setSize(850, 480);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.gif"));
        Image i2 = i1.getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(460,40, 350, 350);
        add(image);
        
        JLabel heading = new JLabel("<html>College Management<br/>System</html>");
        heading.setBounds(40, 30, 400, 110);
        heading.setFont(new Font("Tahoma", Font.BOLD, 37));
        add(heading);
        
        JLabel name = new JLabel("<html>Made by :<br/>(SARVESH TEWARE)</html>");
        name.setBounds(40, 175, 550, 60);
        name.setFont(new Font("Tahoma", Font.BOLD, 27));
        add(name);
        
        JLabel cl = new JLabel("PRMIT&R Amravati-Badnera");
        cl.setBounds(40, 280, 550, 40);
        cl.setFont(new Font("Tahoma", Font.PLAIN, 25));
        add(cl);
        
        JLabel contact = new JLabel("Contact: sarveshteware651@gmail.com");
        contact.setBounds(40, 340, 550, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args){
        new About();
    }
}

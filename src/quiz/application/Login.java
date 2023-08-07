package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    JButton b,b1;
    JTextField tfname;
    Login(){
//        by default java frame is hidden we can use this method view frame

         getContentPane().setBackground(Color.white);
         setLayout(null);
         ImageIcon I=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg/"));
//         add image in jFrame.
        JLabel image=new JLabel(I);
        image.setBounds(0,0,600,500);
      
         add(image);
         
         JLabel heading=new JLabel("++ Quiz ++");
         heading.setBounds(800,60,300,45);
         heading.setFont(new Font("viner Hand ITC",Font.BOLD,40));
//         heading.setForeground(Color.red);
              // or 
         heading.setForeground(new Color(30,144,254));
         add(heading);
         
         JLabel name=new JLabel("Enter your name");
         name.setBounds(810,150,300,20);
         name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
         name.setForeground(new Color(30,144,254));
         add(name);
         
         tfname=new JTextField();
         tfname.setBounds(735,200,300,25);
         tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
         add(tfname);
          
          b=new JButton("rule");
          b.setBounds(735,270,120,25);
          b.setBackground(new Color(30,144,254));
          b.setForeground(Color.WHITE);
           b.addActionListener(this);
          add(b);
          
          b1=new JButton("Back");
          b1.setBounds(915,270,120,25);
          b1.setBackground(new Color(30,144,254));
          b1.setForeground(Color.WHITE);
          b1.addActionListener(this);
          add(b1);
          
         setSize(1150,500);
         setLocation(100,100);
        setVisible(true);

    }
    
 // abstract method override
    public void actionPerformed(ActionEvent e){
        // check button click
    if(e.getSource()==b){
        String name=tfname.getText();
         setVisible(false);
         new Rules(name);
         
         
    }    
    
    else if(e.getSource()==b1){
         setVisible(false);
    }
    }
    
    
    public static void main(String[] args){
        new Login();
 
    }
}

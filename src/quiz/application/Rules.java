package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener{
    String username;
    JButton start,back;
    Rules(String name){
        this.username=name;
      getContentPane().setBackground(Color.WHITE);
      setLayout(null);
      
         JLabel heading=new JLabel("welcome " +name );
         heading.setBounds(50,10,700,30);
         heading.setFont(new Font("viner Hand ITC",Font.BOLD,40));
         heading.setForeground(new Color(30,144,254));
         add(heading);
      
         JLabel rule=new JLabel();
         rule.setBounds(20,90,700,350);
         rule.setFont(new Font("Tohma",Font.PLAIN,16));
         rule.setText("<html>"+"Rules for Quiz Competition:"+ "<br><br>" +
"1. Only Single participation is allowed.<br><br>" +
"2. The medium of the questions will be only English."+"<br><br>" +
"3. All the participants can play all the rounds."+"<br><br>" +
"4. On the average score derives from all the rounds, winners will be declared."+"<br><br>" +
"5. There will be certain time span for each round."+"<br><br>" +
"6. If there is any tie up among the participants about average score, it will be solved by taking"+"<br><br>" +
"another round or set of rounds."+"<br><br>" +
"7. All the rights related with the competition are reserved to Organizers of QuizX."+"<html>");
         add(rule);
      
          back=new JButton("Back");
          back.setBounds(250,500,100,30);
          back.setBackground(new Color(30,144,254));
          back.setForeground(Color.WHITE);
           back.addActionListener(this);
          add(back);
          
          start=new JButton("Start");
          start.setBounds(400,500,100,30);
          start.setBackground(new Color(30,144,254));
          start.setForeground(Color.WHITE);
          start.addActionListener(this);
          add(start);      
         
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);  
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==start){
            new Quiz(username);
        }
        
        else{
            setVisible(false);
            new Login();
        }
    }
    public static void main(String arg[]){
        new Rules("user");
    }
}

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class login_page
{
    public static boolean check(String tf,String ps)
    {
        if(tf.equals("java")&&ps.equals("123"))
        {
            return true;
        }   
        return false;
    }
    public static void appComponents(JPanel panel)
    {
        JLabel lb=new JLabel("Login");
        JTextField tf=new JTextField("");
        JLabel lb2=new JLabel("Password");
        JPasswordField ps=new JPasswordField("");
        
        //creating buttons
        
        JButton bt=new JButton("Cancel");
        JButton bt2=new JButton("Login");
        
        //adding components to panel
        
        panel.add(lb);
        panel.add(tf);
        panel.add(lb2);
        panel.add(ps);
        panel.add(bt);
        panel.add(bt2);
        
        //adding action to button
        
        bt2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(check(tf.getText(),ps.getText()))
                {
                    JOptionPane.showMessageDialog(panel,"Hello "+tf.getText()+"Welcome To Java Swing!","Login Message",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(panel,"Invalid User or Password","Login Message",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        bt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);    
            }
        });
    }
    public static void main(String args[])
    {
        JFrame frame=new JFrame("Login Window!!");
        
        JPanel panel=new JPanel(new GridLayout(3,2,15,15));
        appComponents(panel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//created for close button
        frame.setLocationRelativeTo(null);//created for login button
        frame.setSize(300,150);
        frame.getContentPane().add(panel);
        frame.setVisible(true);//if parameters enterd is trure then open
        
        
    }
}
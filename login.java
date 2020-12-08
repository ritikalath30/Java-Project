import javax.swing.*;
import java.awt.*;

class login extends JFrame
{
	login()
	{
		Container c=getContentPane();
		//FlowLayout f=new FlowLayout();
		c.setLayout(null);
		
		ImageIcon i = new ImageIcon("login1.png");
		JLabel l=new JLabel(i);	
		l.setBounds(0,0,1600,900);
		
		JLabel l1=new JLabel("<html><font size='7' color='white'>Login</font></html>");
		l1.setBounds(600,200,200,45);
		
		JButton b1 = new JButton("<html><font size='5'>Login As Admin</font></html>");
			b1.setBounds(450,300,400,60);
		JButton b2 = new JButton("<html><font size='5'>Login As Student</font></html>");
			b2.setBounds(450,380,400,60);
		
		c.add(l1);
		c.add(b1);
		c.add(b2);
		c.add(l);
		setSize(1600,900);
		setTitle("Login");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		login ob=new login();
	}
}
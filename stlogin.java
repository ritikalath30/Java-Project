import javax.swing.*;
import java.awt.*;

class stlogin extends JFrame
{
	stlogin()
	{
		Container c=getContentPane();
		//FlowLayout f=new FlowLayout();
		c.setLayout(null);
		
		//JFrame f=new JFrame("BackGround");
		//Color c1=new Color(255,150,255);
		//f.getContentPane().setBackground(c1);
		
		JLabel l1=new JLabel("<html><font size='8'>Student Login</font></html>");
		l1.setBounds(160,200,250,45);
		c.add(l1);
		
		JLabel l2=new JLabel("<html><font size='6'>Username</font></html>");
		l2.setBounds(70,300,200,30);
		c.add(l2);
		
		JTextField t1=new JTextField(10);
		t1.setBounds(250,305,200,30);
		c.add(t1);
		
		JLabel l3=new JLabel("<html><font size='6'>Password</font></html>");
		l3.setBounds(70,350,200,30);
		c.add(l3);
		
		JTextField t2=new JTextField(10);
		t2.setBounds(250,355,200,30);
		c.add(t2);
		
		JButton b1 = new JButton("<html><font size='4'>Login</font></html>");
			b1.setBounds(130,450,100,40);
		JButton b2 = new JButton("<html><font size='4'>Back</font></html>");
			b2.setBounds(260,450,100,40);
		c.add(b1);
		c.add(b2);
		
		setSize(1600,900);
		setTitle("Student Login");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		stlogin ob=new stlogin();
	}
}
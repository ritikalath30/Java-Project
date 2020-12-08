import javax.swing.*;
import java.awt.*;
class id1 extends JFrame
{
	id1()
	{	
		Container c=getContentPane();
		
		c.setLayout(null);
		
		JLabel l2=new JLabel("<html><font size='4'>Enter id of student you want to delete</font></html>");
		l2.setBounds(30,110,300,40);
		c.add(l2);
		
		JTextField t1=new JTextField(5);
		t1.setBounds(320,112,150,30);
		c.add(t1);
		
		JButton b1=new JButton("<html><font size='4'>Delete</font></html>");
		b1.setBounds(160,200,100,30);
		c.add(b1);
		  
		JButton b2 = new JButton("<html><font size='4'>Back</font></html>");
		b2.setBounds(300,200,100,30);
		c.add(b2);
			
		
		setVisible(true);
		setSize(550,400);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

public static void main(String args[])
{
		id1 ob=new id1();
}
}
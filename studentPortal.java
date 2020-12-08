import javax.swing.*;
import java.awt.*;

class studentPortal extends JFrame
{		

		studentPortal()
		{
			
		Container c=getContentPane();
		c.setLayout(null);
		
		JLabel l1=new JLabel("<html><font size='7'>STUDENT DASHBOARD</font></html>");
		l1.setBounds(430,80,500,80);
		c.add(l1);
		
		
		JButton b1=new JButton("Show Details");
		b1.setBounds(370,260,220,180);
		c.add(b1);
		
		
		
		
		JButton b2=new JButton("Edit Details");
		b2.setBounds(670,260,220,180);
		c.add(b2);
		
		
		ImageIcon k =new ImageIcon("E:\\Student management system java project\\back.png");
		JButton b3=new JButton("Back",k);
		b3.setBounds(930,570,120,35);
		c.add(b3);
		
		setSize(1600,900);
		setTitle("Student Portal");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		}
		
		public static void main(String args[])
	{
		studentPortal ob=new studentPortal();
	}
}
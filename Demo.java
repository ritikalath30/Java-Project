import javax.swing.*;
import java.awt.*;
class Demo extends JFrame
{
	Demo()
	{	
		Container c=getContentPane();
		//FlowLayout f= new FlowLayout();
		c.setLayout(null);
		
			
		ImageIcon i = new ImageIcon("pic1.jpg");
		JLabel l=new JLabel(i);	
		l.setBounds(0,0,1600,900);
		
		
		JButton b1=new JButton("<html><font size='4'>Next</font></html>");
		b1.setBounds(850,500,150,40);
		
		
		JLabel l2=new JLabel("<html><font size='7' color='white'>Student Management Portal</font></html>");
		  l2.setBounds(380,110,600,55);
		  c.add(l2);
		
		c.add(l);
		
	setVisible(true);
	setSize(1600,900);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	


	}

public static void main(String args[])
{
		Demo ob=new Demo();
}
}
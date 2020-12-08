import javax.swing.*;
import java.awt.*;

class img extends JFrame
{		

		img()
		{
			
		Container c=getContentPane();
		c.setLayout(null);
		
		
		
		setSize(700,500);
		setTitle("Student Portal");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		}
		
		public static void main(String args[])
	{
		img ob=new img();
	}
}
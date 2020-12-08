import javax.swing.*;
import java.awt.*;
class student_details extends JFrame
{
    student_details()
    {
        Container c = getContentPane();
        // FlowLayout f = new FlowLayout();
        c.setLayout(null);
        ImageIcon i = new ImageIcon("STD DETAILS.png");
        JLabel p = new JLabel(i);
        p.setBounds(0,0,1600,900);
        
        
        JButton b2 = new JButton("BACK");
        b2.setBounds(610,590,110,40);
        
		
        c.add(b2);
        c.add(p);
        setSize(1600,900);
        setTitle("Student Details");
        setVisible(true);
      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        student_details sd = new student_details();
    }
}
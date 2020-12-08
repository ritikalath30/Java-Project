import javax.swing.*;
import java.awt.*;
class show_details extends JFrame
{
    show_details()
    {
        Container c = getContentPane();
        // FlowLayout f = new FlowLayout();
        c.setLayout(null);
        ImageIcon i = new ImageIcon("STUDENT DETAILS.png");
        JLabel p = new JLabel(i);
        p.setBounds(0,0,1600,900);
        //JLabel l = new JLabel("<html><font size='6' color=red> STUDENT DETAILS</font></html>");
        //l.setBounds(400,45,300,50);
       
        JLabel l2 = new JLabel("<html><font color=white>FIRST NAME</font></html>");
        l2.setBounds(70,70,100,150);
        JLabel l3 = new JLabel("<html><font color=white>LAST NAME</font></html>");
        l3.setBounds(70,110,100,150);
        JLabel l4 = new JLabel("<html><font color=white>FATHER'S NAME</font></html>");
        l4.setBounds(70,150,100,150);
        JLabel l5 = new JLabel("<html><font color=white>MOTHER'S NAME</font></html>");
        l5.setBounds(70,190,100,150);
        JLabel l6 = new JLabel("<html><font color=white>GENDER</font></html>");
        l6.setBounds(70,230,100,150);
        JLabel l7 = new JLabel("<html><font color=white>DATE OF BIRTH</font></html>");
        l7.setBounds(70,270,100,150);
        JLabel l8 = new JLabel("<html><font color=white>PHONE NUMBER</font></html>");
        l8.setBounds(70,310,100,150);
        JLabel l9 = new JLabel("<html><font color=white>ADDRESS</font></html>");
        l9.setBounds(70,350,100,150);
        JLabel l22 = new JLabel("<html><font color=white>HOBBIES/INTERESTS</font></html>");
        l22.setBounds(70,410,200,150);
        JLabel l23 = new JLabel("<html><font color=white>SPECIAL ACHIEVEMENTS</font></html>");
        l23.setBounds(70,485,200,150);

        
        JLabel l11 = new JLabel("<html><font color=white>SCHOOL NAME</font></html>");
        l11.setBounds(750,70,150,150);
        JLabel l12 = new JLabel("<html><font color=white>PERCENTAGE/CGPA</font></html>");
        l12.setBounds(750,110,150,150);
        JLabel l13 = new JLabel("<html><font color=white>JUNIOR COLLEGE NAME</font></html>");
        l13.setBounds(750,150,150,150);
        JLabel l14 = new JLabel("<html><font color=white>PERCENTAGE/CGPA</font></html>");
        l14.setBounds(750,190,150,150);
        JLabel l15 = new JLabel("<html><font color=white>MHT CET PERCENTILE</font></html>");
        l15.setBounds(750,230,150,150);
        JLabel l16 = new JLabel("<html><font color=white>JEE MAINS PERCENTILE</font></html>");
        l16.setBounds(750,270,150,150);
        JLabel l17 = new JLabel("<html><font color=white>COLLEGE NAME</font></html>");
        l17.setBounds(750,310,150,150);
        JLabel l18 = new JLabel("<html><font color=white>BRANCH</font></html>");
        l18.setBounds(750,350,150,150);
        JLabel l19 = new JLabel("<html><font color=white>YEAR</font></html>");
        l19.setBounds(750,390,150,150);
        JLabel l20 = new JLabel("<html><font color=white>DIVISION</font></html>");
        l20.setBounds(750,430,150,150);
        JLabel l21 = new JLabel("<html><font color=white>ROLL NUMBER</font></html>");
        l21.setBounds(750,470,150,150);
		
		
        JTextField t1 = new JTextField(10);
        t1.setBounds(300,130,180,25);
        JTextField t2 = new JTextField(10);
        t2.setBounds(300,170,180,25);
        JTextField t3 = new JTextField(10);
        t3.setBounds(300,210,180,25);
        JTextField t4 = new JTextField(10);
        t4.setBounds(300,250,180,25);
        JTextField t5 = new JTextField(10);
        t5.setBounds(300,290,180,25);
        JTextField t6 = new JTextField(10);
        t6.setBounds(300,330,180,25);
        JTextField t7 = new JTextField(10);
        t7.setBounds(300,370,180,25);    
        JTextArea ta = new JTextArea(4,10);
        ta.setBounds(300,410,180,50);
        JTextArea ta2 = new JTextArea(3,15);
        ta2.setBounds(300,480,180,50);
        JTextArea ta3 = new JTextArea(4,15);
        ta3.setBounds(300,550,180,50);
       
        
        JTextField t8 = new JTextField(10);
        t8.setBounds(980,130,200,25);
        JTextField t9 = new JTextField(10);
        t9.setBounds(980,170,200,25);
        JTextField t10 = new JTextField(10);
        t10.setBounds(980,210,200,25);
        JTextField t11 = new JTextField(10);
        t11.setBounds(980,250,200,25);
        JTextField t12 = new JTextField(10);
        t12.setBounds(980,290,200,25);
        JTextField t13 = new JTextField(10);
        t13.setBounds(980,330,200,25);
        JTextField t14 = new JTextField(10);
        t14.setBounds(980,370,200,25);
        JTextField t15 = new JTextField(10);
        t15.setBounds(980,410,200,25);
        JTextField t16 = new JTextField(10);
        t16.setBounds(980,450,200,25);
        JTextField t17 = new JTextField(10);
        t17.setBounds(980,490,200,25);
        JTextField t18 = new JTextField(10);
        t18.setBounds(980,530,200,25);
        
        JButton b2 = new JButton("BACK");
        b2.setBounds(610,590,90,30);
        
		c.add(l);
        
        c.add(l2);
        c.add(t1);
        c.add(l3);
        c.add(t2);
        c.add(l4);
        c.add(t3);
        c.add(l5);
        c.add(t4);
        c.add(l6);
        c.add(t5);
        c.add(l7);
        c.add(t6);
        c.add(l8);
        c.add(t7);
        c.add(l9);
        c.add(ta);
        c.add(l22);
        c.add(ta2);
        c.add(l23);
        c.add(ta3);
        
        c.add(l11);
        c.add(t8);
        c.add(l12);
        c.add(t9);
        c.add(l13);
        c.add(t10);
        c.add(l14);
        c.add(t11);
       
        c.add(l15);
        c.add(t12);
        c.add(l16);
        c.add(t13);
        c.add(l17);
        c.add(t14);
        c.add(l18);
        c.add(t15);
        c.add(l19);
        c.add(t16);
        c.add(l20);
        c.add(t17);
        c.add(l21);
        c.add(t18);
        //c.add(b1);
        c.add(b2);
        c.add(p);
        setSize(1600,900);
        setTitle("Show Student Details");
        setVisible(true);
        //setBackground(Color.BLUE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        show_details sd = new show_details();
    }
}
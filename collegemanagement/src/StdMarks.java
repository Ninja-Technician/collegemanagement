import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class StdMarks 
{
	Frame f1;
	Panel p1;
	JLabel l1,l2,l3,l4;
	TextField t1,t2,t3;
	JButton b1;

	StdMarks()
	{
		f1=new Frame("Student Marks");
		p1=new Panel();

		l1=new JLabel("<html><head></head><body><font size=4>STUDENT MARKS</font></body></html>");
		l1.setBounds(200,60,150,50);
		p1.add(l1);

		p1.setLayout(null);
		f1.add(p1);
		f1.setSize(500,500);
		f1.setVisible(true);
	}
	public static void main(String args[])
	{
		StdMarks sm=new StdMarks();
	}
}
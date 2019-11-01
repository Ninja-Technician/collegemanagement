import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class StudentDetail1 implements ActionListener
{
	Frame f1;
	JButton b1,b2;
	Panel p1;
	JLabel l1,l2,l3;
	JComboBox combo,combo1;
	ImageIcon im1,im2;

	StudentDetail1()
	{
		f1=new Frame("All Students Detail Form");	
		p1=new Panel();
		f1.setBounds(250,80,400,400);

		im1=new ImageIcon("C:\\Users\\Hp\\Documents\\NetBeansProjects\\collegemanagement\\src\\images\\save.png");
		im2=new ImageIcon("C:\\Users\\Hp\\Documents\\NetBeansProjects\\collegemanagement\\src\\images\\home.png");

		b1=new JButton("Search",im1 );
		b2=new JButton("Home",im2);

		b1.setBounds(80,270,100,25);
		b2.setBounds(200,270,100,25);

		p1.add(b1);
		p1.add(b2);
		
		l1=new JLabel("<html><head></head><body><font size=4>ALL STUDENT DETAILS </font></body></html>");
		l2=new JLabel("SELECT COURSE:");
		l3=new JLabel("SELECT YEAR");
	
		l1.setBounds(110,80,180,50);
		l2.setBounds(60,170,120,25);
		l3.setBounds(60,210,120,25);

		p1.add(l1);
		p1.add(l2);
		p1.add(l3);

		combo=new JComboBox();
		combo.addItem("BCA");
		combo.addItem("BBA");
		combo.addItem("BCOM");
		combo.addItem("MCA");
		combo.addItem("MBA");
		combo.setEditable(true);

		combo.setBounds(190,170,100,25);
		p1.add(combo);
	
		combo1=new JComboBox();
		combo1.addItem("1st year");
		combo1.addItem("2nd year");
		combo1.addItem("3rd year");
		combo1.addItem("4th year");
		combo1.setEditable(true);

		combo1.setBounds(190,210,100,25);
		p1.add(combo1);

		p1.setLayout(null);
		f1.add(p1);
		f1.setSize(400,400);
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setBackground(Color.lightGray);

		b2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b2)
		{
			mainPage1 obj1=new mainPage1();
	
			f1.setVisible(false);	
		}
	}

	public static void main(String args[])
	{
		StudentDetail1 sp=new StudentDetail1();
	}
}
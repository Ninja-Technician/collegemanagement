import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lab implements  ActionListener
{
	Frame f1;
	Panel p1;
	MenuBar mb;
	Menu m1;
	ImageIcon im,im1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JButton b1;

	Lab()
	{
		f1=new Frame("Computer Lab");
		f1.setBounds(100,40,800, 600);
		mb=new MenuBar();
		f1.setMenuBar(mb);
		p1=new Panel();

		m1=new Menu(" ");
		mb.add(m1);

		im=new ImageIcon("E:\\collegemanagement\\src\\images\\lab7.jpg");
		l1=new JLabel(im);
		l1.setBounds(20,0,750,283);
		p1.add(l1);

		im1=new ImageIcon("E:\\collegemanagement\\src\\images\\back5.png");
		b1=new JButton("Back",im1);
		b1.setBounds(350,490,100,25);
		p1.add(b1);

		l2=new JLabel("<html><body><font size=3>OOPS Lab</font></body></html>");
		l2.setBounds(150,320,130,25);
		p1.add(l2);

		l3=new JLabel("<html><body><font size=3>Java Programming</font></body></html>");
		l3.setBounds(150,350,130,25);
		p1.add(l3);

		l4=new JLabel("<html><body><font size=3>Software Engineering</font></body></html>");
		l4.setBounds(150,380,130,25);
		p1.add(l4);

		l5=new JLabel("<html><body><font size=3>Operating System</font></body></html>");
		l5.setBounds(150,410,150,25);
		p1.add(l5);
	
		l6=new JLabel("<html><body><font size=3>Artificial Intelligence(LISP/PROLOG)</font></body></html>");
		l6.setBounds(150,440,250,25);
		p1.add(l6);

		l7=new JLabel("<html><body><font size=3>Cryptography & Network Security</font></body></html>");
		l7.setBounds(420,320,200,25);
		p1.add(l7);

		l8=new JLabel("<html><body><font size=3>C Programming</font></body></html>");
		l8.setBounds(420,350,200,25);
		p1.add(l8);

		l9=new JLabel("<html><body><font size=3>Computer Graphics</font></body></html>");
		l9.setBounds(420,380,200,25);
		p1.add(l9);

		l10=new JLabel("<html><body><font size=3>Project</font></body></html>");
		l10.setBounds(420,410,200,25);
		p1.add(l10);

		l11=new JLabel("<html><body><font size=3>Data Structure</font></body></html>");
		l11.setBounds(420,440,200,25);
		p1.add(l11);

		p1.setLayout(null);
		f1.add(p1);
		f1.setVisible(true);
		f1.setSize(800,600);
		f1.setResizable(false);
		f1.setBackground(Color.lightGray);

		
		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			mainPage1 obj1=new mainPage1();
			obj1.m11.setEnabled(true);
			obj1.m21.setEnabled(true);
			obj1.m22.setEnabled(true);
			obj1.m23.setEnabled(true);
			obj1.m31.setEnabled(true);
			obj1.m32.setEnabled(true);
			obj1.m33.setEnabled(true);
			obj1.m34.setEnabled(true);
			obj1.m35.setEnabled(true);
			obj1.m61.setEnabled(true);
			obj1.m63.setEnabled(true);
			obj1.sm1.setEnabled(true);
			obj1.sm2.setEnabled(true);
			obj1.m81.setEnabled(true);
			obj1.m82.setEnabled(true);
			obj1.m83.setEnabled(true);
			obj1.m84.setEnabled(true);
			obj1.m72.setEnabled(true);
			obj1.m92.setEnabled(true);
			obj1.m64.setEnabled(true);
			obj1.m85.setEnabled(true);
			obj1.m86.setEnabled(true);
			obj1.sm3.setEnabled(true);
			f1.setVisible(false);
		}
	}

	
	public static void main(String args[])
	{
		Lab obj=new Lab();
	}
}
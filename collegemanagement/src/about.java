import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class about implements ActionListener
{
	Frame f1;
	Panel p1;
	ImageIcon im,im1;
	JLabel l,l1;
	MenuBar mb;
	Menu m1;
	MenuItem m11,m12;
	JButton b1;

	about()
	{
		f1=new Frame("About Us");
		f1.setBounds(100,40,810, 600);
		p1=new Panel();

		mb=new MenuBar();
		f1.setMenuBar(mb);

		m1=new Menu("");
		mb.add(m1);

		im=new ImageIcon("E:\\collegemanagement\\src\\images\\college-campus.jpg");
		l=new JLabel(im);
		l.setBounds(0,0,800,330);
		p1.add(l);

		l1=new JLabel("<html><body><font size=3>Mount Ida College is one of the premier Institutions in the field of 		Technical and Management Education.The college was formed in the year 2005.It has been approved by All India 		Council Of Technical Education and affiliated with Delhi University. At present it is imparting MBA, MCA, BCA, 		BBA, BCOM Courses in differentdisciplines.  Institute has also planned to have Master's and Doctor's Programmes 		in near future. The Institute distinguishes itself from other colleges and Institutes due to its holistic approach and 		unique foresighted planning in providing technical and professional education with the state-of-the-art techniques. 		The main objective of an Institute is to generate a bunch of highly creative professionals, who can contribute not 		only in the Human Resource Development but also in the Nation Building Exercise. Allround personal growth of 				the students and development of fine skills are the key objectives at Mount Ida College.  We groom students as an 		effective personality for immediate employment. </font></body></html>");

		l1.setBounds(10,310,800,185);
		p1.add(l1);

		im1=new ImageIcon("E:\\collegemanagement\\src\\images\\back5.png");

		b1=new JButton("Back",im1);
		b1.setBounds(320,500,100,25);
		p1.add(b1);

		p1.setLayout(null);
		f1.add(p1);
		f1.setVisible(true);
		//f1.setSize(810,600);
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
		about obj=new about();
	}
}

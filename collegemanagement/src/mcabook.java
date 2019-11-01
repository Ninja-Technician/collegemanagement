import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class mcabook implements ActionListener
{
	Frame f1;
	Panel p1;
	Label l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JButton b1;
	ImageIcon im;

	mcabook()
	{
		f1=new Frame("MCA books");
		f1.setBounds(200,40,700,600);
		p1=new Panel();

		l=new Label("NAME OF BOOKS");
		l.setBounds(300,40,150,25);
		p1.add(l);
		l.setBackground(Color.lightGray);

		l1=new Label(" 1) Introduction to Computers");
		l1.setBounds(120,80,180,25);
		p1.add(l1);
		l1.setBackground(Color.lightGray);

		l2=new Label(" 2) The C Programming Language ");
		l2.setBounds(120,110,200,25);
		p1.add(l2);
		l2.setBackground(Color.lightGray);

		l3=new Label(" 3)  Data Structures using C & C++");
		l3.setBounds(120,140,200,25);
		p1.add(l3);
		l3.setBackground(Color.lightGray);

		l4=new Label(" 4) Computer Organization & Architecture ");
		l4.setBounds(120,170,230,25);
		p1.add(l4);
		l4.setBackground(Color.lightGray);

		l5=new Label(" 5) Operating Systems, Concepts and Design");
		l5.setBounds(120,200,270,25);
		p1.add(l5);
		l5.setBackground(Color.lightGray);
	
		l6=new Label(" 6) Multimedia : Making it Work ");
		l6.setBounds(120,230,270,25);
		p1.add(l6);
		l6.setBackground(Color.lightGray);

		l7=new Label(" 7) Computer Networks");
		l7.setBounds(120,260,250,25);
		p1.add(l7);
		l7.setBackground(Color.lightGray);

		l8=new Label(" 8) An Introduction to Database Concepts");
		l8.setBounds(120,290,270,25);
		p1.add(l8);
		l8.setBackground(Color.lightGray);

		l9=new Label(" 9) Object Oriented Programming in C++");
		l9.setBounds(120,320,270,25);
		p1.add(l9);
		l9.setBackground(Color.lightGray);
	
		l10=new Label(" 10) Introduction to cryptography");
		l10.setBounds(120,350,240,25);
		p1.add(l10);
		l10.setBackground(Color.lightGray);

		l11=new Label(" 11) The Complete Reference Java2");
		l11.setBounds(120,380,200,25);
		p1.add(l11);
		l11.setBackground(Color.lightGray);

		l12=new Label(" 12) Artificial Intelligence ");
		l12.setBounds(120,410,240,25);
		p1.add(l12);
		l12.setBackground(Color.lightGray);

		l13=new Label(" 13) Managing the Data Warehouse");
		l13.setBounds(120,440,240,25);
		p1.add(l13);
		l13.setBackground(Color.lightGray);

		l14=new Label(" 14) Algorithm for graphics and Image Processing");
		l14.setBounds(120,470,300,25);
		p1.add(l14);
		l14.setBackground(Color.lightGray);

		l15=new Label(" 15) Internet and WWW ");
		l15.setBounds(120,500,240,25);
		p1.add(l15);
		l15.setBackground(Color.lightGray);

		im=new ImageIcon("C:\\Users\\Hp\\Documents\\NetBeansProjects\\collegemanagement\\src\\images\\back5.png");

		b1=new JButton("Back",im);
		b1.setBounds(550,500,100,25);
		p1.add(b1);

		p1.setLayout(null);
		f1.add(p1);
		f1.setSize(700,600);
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setBackground(Color.lightGray);

		
		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			Library lib=new Library();
			f1.setVisible(false);
		}
	}

	
	public static void main(String args[])
	{
		mcabook ca=new mcabook();
	}
}
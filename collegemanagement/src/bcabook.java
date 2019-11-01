import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class bcabook implements ActionListener
{
	Frame f1;
	Panel p1;
	Label l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JButton b1;
	ImageIcon im;

	bcabook()
	{
		f1=new Frame("BCA books");
		f1.setBounds(200,40,700, 600);
		p1=new Panel();

		l=new Label("NAME OF BOOKS");
		l.setBounds(300,40,150,25);
		p1.add(l);
		l.setBackground(Color.lightGray);

		l1=new Label(" 1) Communicative English");
		l1.setBounds(120,80,150,25);
		p1.add(l1);
		l1.setBackground(Color.lightGray);

		l2=new Label(" 2) Programming in C Language");
		l2.setBounds(120,110,180,25);
		p1.add(l2);
		l2.setBackground(Color.lightGray);

		l3=new Label(" 3) Advanced Mathematics");
		l3.setBounds(120,140,170,25);
		p1.add(l3);
		l3.setBackground(Color.lightGray);
	
		l4=new Label(" 4) Introduction to Internet and HTML Scripting");
		l4.setBounds(120,170,200,25);
		p1.add(l4);
		l4.setBackground(Color.lightGray);

		l5=new Label(" 5) Advanced Visual And Windows Programming");
		l5.setBounds(120,200,270,25);
		p1.add(l5);
		l5.setBackground(Color.lightGray);

		l6=new Label(" 6) Object Oriented Programming with C++");
		l6.setBounds(120,230,270,25);
		p1.add(l6);
		l6.setBackground(Color.lightGray);

		l7=new Label(" 7) Data Communication and Network");
		l7.setBounds(120,260,250,25);
		p1.add(l7);
		l7.setBackground(Color.lightGray);

		l8=new Label(" 8) Website Development and E Commerce");
		l8.setBounds(120,290,270,25);
		p1.add(l8);
		l8.setBackground(Color.lightGray);

		l9=new Label(" 9) Internet Technologies and Programming");
		l9.setBounds(120,320,270,25);
		p1.add(l9);
		l9.setBackground(Color.lightGray);

		l10=new Label(" 10) Multimedia and Applications");
		l10.setBounds(120,350,240,25);
		p1.add(l10);
		l10.setBackground(Color.lightGray);

		l11=new Label(" 11) Data and File Structure");
		l11.setBounds(120,380,200,25);
		p1.add(l11);
		l11.setBackground(Color.lightGray);

		l12=new Label(" 12) Operating System and Unix");
		l12.setBounds(120,410,240,25);
		p1.add(l12);
		l12.setBackground(Color.lightGray);

		l13=new Label(" 13) Scientific and statistical Computing");
		l13.setBounds(120,440,240,25);
		p1.add(l13);
		l13.setBackground(Color.lightGray);

		l14=new Label(" 14) Mathemactical Foundation of Computer Science");
		l14.setBounds(120,470,300,25);
		p1.add(l14);
		l14.setBackground(Color.lightGray);

		l15=new Label(" 15) Software Project Management");
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
		bcabook ca=new bcabook();
	}
}
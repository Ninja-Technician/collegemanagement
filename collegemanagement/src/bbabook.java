import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class bbabook implements ActionListener
{
	Frame f1;
	Panel p1;
	Label l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JButton b1;
	ImageIcon im;

	bbabook()
	{
		f1=new Frame("BBA books");
		f1.setBounds(200,40,700,600);
		p1=new Panel();

		l=new Label("NAME OF BOOKS");
		l.setBounds(300,30,150,25);
		p1.add(l);
		l.setBackground(Color.lightGray);

		l1=new Label(" 1)  Principles of Management (Management Theory) ");
		l1.setBounds(120,70,300,25);
		p1.add(l1);
		l1.setBackground(Color.lightGray);
	
		l2=new Label(" 2) Organisation Theory & Behaviour");
		l2.setBounds(120,100,200,25);
		p1.add(l2);
		l2.setBackground(Color.lightGray);

		l3=new Label(" 3) Business Communication Skills");
		l3.setBounds(120,130,200,25);
		p1.add(l3);
		l3.setBackground(Color.lightGray);
	
		l4=new Label(" 4) Human Resource Management");
		l4.setBounds(120,160,200,25);
		p1.add(l4);
		l4.setBackground(Color.lightGray);

		l5=new Label(" 5) Financial Management");
		l5.setBounds(120,190,270,25);
		p1.add(l5);
		l5.setBackground(Color.lightGray);

		l6=new Label(" 6) Accounting & Financial Management");
		l6.setBounds(120,220,270,25);
		p1.add(l6);
		l6.setBackground(Color.lightGray);

		l7=new Label(" 7)  Cost Accounts");
		l7.setBounds(120,250,250,25);
		p1.add(l7);
		l7.setBackground(Color.lightGray);

		l8=new Label(" 8) Money, Banking & Financial Institutions");
		l8.setBounds(120,280,270,25);
		p1.add(l8);
		l8.setBackground(Color.lightGray);

		l9=new Label(" 9)  Marketing Management");
		l9.setBounds(120,310,270,25);
		p1.add(l9);
		l9.setBackground(Color.lightGray);

		l10=new Label(" 10) Sales Management");
		l10.setBounds(120,340,240,25);
		p1.add(l10);
		l10.setBackground(Color.lightGray);

		l11=new Label(" 11) Logistics & Supply Chain Management");
		l11.setBounds(120,370,250,25);
		p1.add(l11);
		l11.setBackground(Color.lightGray);

		l12=new Label(" 12) Managerial Economics");
		l12.setBounds(120,400,240,25);
		p1.add(l12);
		l12.setBackground(Color.lightGray);
	
		l13=new Label(" 13) International Marketing Management");
		l13.setBounds(120,430,240,25);
		p1.add(l13);
		l13.setBackground(Color.lightGray);

		l14=new Label(" 14) Business Environment ");
		l14.setBounds(120,460,300,25);
		p1.add(l14);
		l14.setBackground(Color.lightGray);

		l15=new Label(" 15) Export, Import Procedure & Documentation");
		l15.setBounds(120,490,270,25);
		p1.add(l15);
		l15.setBackground(Color.lightGray);

		im=new ImageIcon("C:\\Users\\Hp\\Documents\\NetBeansProjects\\collegemanagement\\src\\images\\back5.png");
	
		b1=new JButton("Back",im);
		b1.setBounds(300,530,100,25);
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
		bbabook ca=new bbabook();
	}
}
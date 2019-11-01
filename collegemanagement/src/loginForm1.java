import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class loginForm1 implements ActionListener
{
	JFrame f1;
	Panel p1;
	JLabel l1,l2,l3;
	JButton b1,b2;
	TextField t1,t2;
	ImageIcon im,im1;

	loginForm1()
	{
		f1=new JFrame("Login...");
		p1=new Panel();
		p1.setLayout(null);
		f1.add(p1);

		l1=new JLabel("<html><head></head><body><font size=4> Username</font>  </body></html>");
		l2=new JLabel("<html><head></head><body><font size=4>Password</font> </body></html>");

		l1.setBounds(70,55,80,80);
		l2.setBounds(70,105,100,100);

		p1.add(l1);
		p1.add(l2);

		im=new ImageIcon("C:\\Users\\Hp\\Documents\\NetBeansProjects\\collegemanagement\\src\\images\\login.png");
		im1=new ImageIcon("C:\\Users\\Hp\\Documents\\NetBeansProjects\\collegemanagement\\src\\images\\cancel.png");

		b1=new JButton("Login",im);
		b2=new JButton("Cancel",im1);

		b1.setBounds(80,230,100,25);
		b2.setBounds(200,230,100,25);

		p1.add(b1);
		p1.add(b2);

		t1=new TextField();
		t2=new TextField();

		t2.setEchoChar('*');

		t1.setBounds(200,85,120,25);
		t2.setBounds(200,140,120,25);

		p1.add(t1);
		p1.add(t2);

		f1.setBackground(Color.gray);
		f1.setSize(400,350);
		f1.setVisible(true);
		f1.setResizable(false);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
		}
		if(ae.getSource()==b2)
		{
		}
	}
	public static void main(String args[])
	{
		loginForm1 frm=new loginForm1();
	}
}
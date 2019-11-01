import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;

class marks extends DBCON implements ActionListener
{
	Frame f1;
	Panel p1;
	JLabel l1,l2,l3,l4;
         JComboBox c1;
	JButton b1,b2,b3;
	TextField t1,t2,t3;
	ImageIcon im,im1,im2;
	

	marks()
	{
		f1=new Frame("Student Marks");
		f1.setBounds(250,100,400, 400);
		p1=new Panel();

		l1=new JLabel("<html><head></head><body><font size=4>STUDENT MARKS</font></body></html>");
		l2=new JLabel("Enter Student ID:");
		l3=new JLabel("Enter Internal Marks:");
		l4=new JLabel("Enter External Marks:");

		l1.setBounds(140,60,120,25);
		l2.setBounds(60,110,100,25);
		l3.setBounds(60,150,130,25);
		l4.setBounds(60,190,130,25);
	
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
                c1=new JComboBox();
		c1.setBounds(230,110,120,25);
		p1.add(c1);
                try
                {
                    String idquery="Select stid from admision;";
                    Statement stmt2=con.createStatement();
                    ResultSet rs2=stmt2.executeQuery(idquery);
                    
                    while(rs2.next())
                    {
                        c1.addItem(Integer.toString(rs2.getInt(1)));
                    }
                }
                catch(Exception e)
                {
                    System.out.println("Problem"+e);
                }

	//	t1=new TextField();
		t2=new TextField();
		t3=new TextField();

	//	t1.setBounds(230,110,120,25);
		t2.setBounds(230,150,120,25);
		t3.setBounds(230,190,120,25);

	//	p1.add(t1);
		p1.add(t2);
		p1.add(t3);

		im=new ImageIcon("E:\\collegemanagement\\src\\images\\save.png");
		im1=new ImageIcon("E:\\collegemanagement\\src\\images\\home.png");
		im2=new ImageIcon("E:\\collegemanagement\\src\\images\\out.png");

		b1=new JButton("Submit",im);
		b2=new JButton("Home",im1);
		//b3=new JButton("Logout",im2);

		b1.setBounds(80,260,100,25);
		b2.setBounds(210,260,100,25);
		//b3.setBounds(340,260,100,25);

		p1.add(b1);
		p1.add(b2);
		//p1.add(b3);

		p1.setLayout(null);
		f1.add(p1);	
		f1.setSize(400,400);
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setBackground(Color.lightGray);

		b2.addActionListener(this);
		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b2)
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

		if(ae.getSource()==b1)
		{
                        int id=Integer.parseInt(c1.getSelectedItem().toString());
                        String intmr=t2.getText();
                        String extmr=t3.getText();
                        String insertquery="insert into marks values(?,?,?)";
			try
			{
                            PreparedStatement pst=con.prepareStatement(insertquery);
                            pst.setInt(1, id);
                            pst.setInt(2, Integer.parseInt(intmr));
                            pst.setInt(3, Integer.parseInt(extmr));
                            pst.executeUpdate();
				
				JOptionPane.showMessageDialog(f1,"Data inserted");
			}
	
			catch(Exception e)
			{
				System.out.println("error occured");
			}
		}
	}

	public static void main(String args[])
	{
		marks ma=new marks();
	}
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;

class AccountDetails extends DBCON implements ActionListener
{
	Frame f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	Panel p1;
	JButton b1,b2,b3,b4;
	TextField t1,t2,t3,t4,t5;
	JComboBox combo,c1;
	JComboBox combo1;
	ImageIcon im,im1,im2,im3;

	AccountDetails()
	{
		f1=new Frame("ACCOUNT DETAILS");
		f1.setBounds(200,40,600, 600);
		p1=new Panel();

		l1=new JLabel("<html><head></head><body><font size=4>STUDENT ACCOUNT DETAILS:</font></body></html>");
		l2=new JLabel("<html><head></head><body><font size=4>STUDENT ID: </font></body></html>");
		l3=new JLabel("<html><head></head><body><font size=4>FIRST NAME:</font></body></html>");
		l4=new JLabel("<html><head></head><body><font size=4>LAST NAME:</font></body></html>");
		l5=new JLabel("<html><head></head><body><font size=4>COURSE:</font></body></html>");
		l6=new JLabel("<html><head></head><body><font size=4>PAYMENT FOR:</font></body></html>");
		l7=new JLabel("<html><head></head><body><font size=4>YEAR OF PAYMENT:</font></body></html>");
		l8=new JLabel("<html><head></head><body><font size=4>AMOUNT:</font></body></html>");

		l1.setBounds(180, 20,300,55);
		l2.setBounds(100,100,100,30);
		l3.setBounds(100,140,100,30);
		l4.setBounds(100,180,100,30);
		l5.setBounds(100,220,100,30);
		l6.setBounds(100,260,120,30);
		l7.setBounds(100,300,150,30);
		l8.setBounds(100,340,100,30);

		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
		p1.add(l5);
		p1.add(l6);
		p1.add(l7);
		p1.add(l8);
	
		im=new ImageIcon("E:\\collegemanagement\\src\\images\\save.png");
		im1=new ImageIcon("E:\\collegemanagement\\src\\images\\reset1.png");
		im2=new ImageIcon("E:\\collegemanagement\\src\\images\\back5.png");
                im3=new ImageIcon("E:\\collegemanagement\\src\\images\\view.png");

		b1=new JButton("Submit",im);
		b2=new JButton("Reset",im1);
		b3=new JButton("Back",im2);

		b1.setBounds(140,450,100,25);
		b2.setBounds(270,450,100,25);
		b3.setBounds(400,450,100,25);

		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
                
                b4=new JButton("View ",im3);
		b4.setBounds(475,100,100,25);
		p1.add(b4);

		//t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		t4=new TextField();
		t5=new TextField();

		//t1.setBounds(300,100,150,25);
		t2.setBounds(300,140,150,25);
		t3.setBounds(300,180,150,25);
		t4.setBounds(300,220,150,25);
		t5.setBounds(300,340,150,25);

		//p1.add(t1);
		p1.add(t2);
		p1.add(t3);
		p1.add(t4);
		p1.add(t5);

		combo=new JComboBox();
                combo.addItem("--Select--");
		combo.addItem("Tuition fee");
		combo.addItem("Bus Fee");
		combo.addItem("Exam Fee");
		combo.addItem("Hostel Fee");
		combo.setEditable(true);

		combo.setBounds(300,260,150,25);

		p1.add(combo);

		combo1=new JComboBox();
                combo1.addItem("--Select--");
		combo1.addItem("1st year");
		combo1.addItem("2nd year");
		combo1.addItem("3rd year");
		combo1.addItem("4th year");
		combo1.setEditable(true);

		combo1.setBounds(300,300,150,25);

		p1.add(combo1);

		p1.setLayout(null);
		f1.add(p1);
		f1.setVisible(true);
		//f1.setSize(600,600);
		f1.setResizable(false);
		f1.setBackground(Color.lightGray);


		b3.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
                b4.addActionListener(this);
                
                c1=new JComboBox();
		c1.setBounds(300,100,150,25);
		p1.add(c1);
                
                t2.setEditable(false);
                t3.setEditable(false);
                t4.setEditable(false);
                t5.setEditable(false);
                
                
                try
                {
                    String idquery="Select stid from admision;";
                    Statement stmt2=con.createStatement();
                    ResultSet rs2=stmt2.executeQuery(idquery);
                    
                    while(rs2.next())
                    {
                        c1.addItem("--Select--");
                        c1.addItem(Integer.toString(rs2.getInt(1)));
                    }
                }
                catch(Exception e)
                {
                    System.out.println("Problem"+e);
                }
                
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b3)
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
                
                if(ae.getSource()==b4)
		{
                    t5.setEditable(true);
                     try
                    {
                        
                        int id=Integer.parseInt(c1.getSelectedItem().toString());
                        String viewquery="select * from admision where stid="+id;
                        
                        Statement stm=con.createStatement();
                        ResultSet rs=stm.executeQuery(viewquery);
                        
                        while(rs.next())
                        {
                            //t1.setText(Integer.toString(rs.getInt(1)));
                            t2.setText(rs.getString(2));
                            t3.setText(rs.getString(3));
                            t4.setText(rs.getString(9));
                           
                        }
                        
                        
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(f1,"Data fetching error "+e);
                    }
                }

		if(ae.getSource()==b1)
		{
                    
                    String stid=c1.getSelectedItem().toString();
                    
                    String stfname=t2.getText();
                    String stlname=t3.getText();
                    String course=t4.getText();
                    String Payment=combo.getSelectedItem().toString();
                    String yop=combo1.getSelectedItem().toString();
                    String amt=t5.getText();
                    try
                    {
                       String insertquery="insert into Payment values(?,?,?,?,?,?,?);";
                        
                        PreparedStatement pst=con.prepareStatement(insertquery);
                        
                        pst.setInt(1,Integer.parseInt(stid));
                        pst.setString(2,stfname);
                        pst.setString(3,stlname);
                        pst.setString(4,course);
                        pst.setString(5,Payment);
                        pst.setString(6,yop);
                        pst.setInt(7, Integer.parseInt(amt));
                        pst.executeUpdate();
                        
                        JOptionPane.showMessageDialog(f1,"Payment Successful");
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(f1,"Payment Failed "+e);
                    }
			
			
		}

		
		if(ae.getSource()==b2)
			{
				//t1.setText(" ");
                                c1.setSelectedIndex(0);
				t2.setText(" ");
				t3.setText(" ");
				t4.setText(" ");
				combo.setSelectedIndex(0);
				combo1.setSelectedIndex(0);	
				t5.setText(" ");
			}	
	}

	public static void main(String args[])
	{
		AccountDetails obj=new AccountDetails();
	}
}
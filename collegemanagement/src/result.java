import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;


class result extends DBCON implements ActionListener
{
	Frame f1;
	Panel p1;
	JLabel l1,l2,l3,l4,l5;
	TextField t1,t2,t3;
	JButton b1,b2,b3;
	ImageIcon im1,im2,im3;
	JComboBox c1;

	result()
	{
		f1=new Frame("Results");
		f1.setBounds(250,60,500,500);
		p1=new Panel();

		c1=new JComboBox();
		c1.setBounds(280,120,100,25);
		p1.add(c1);
                 try
                {
                    String idquery="Select sid from marks;";
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


		l1=new JLabel("<html><body><font size=5>View Result</font></body></html>");
		l1.setBounds(200,50,120,25);
		p1.add(l1);
	
		l2=new JLabel("<html><body><font size=3>Select Student ID</font></body></html>");
		l2.setBounds(100,120,100,25);
		p1.add(l2);

		l3=new JLabel("<html><body><font size=3>Internal Marks </font></body></html>");
		l3.setBounds(100,170,100,25);
		p1.add(l3);

		l4=new JLabel("<html><body><font size=3>External Marks </font></body></html>");
		l4.setBounds(100,220,100,25);
		p1.add(l4);

		l5=new JLabel("<html><body><font size=3>Total Marks </font></body></html>");
		l5.setBounds(100,270,100,25);
		p1.add(l5);

		t1=new TextField();
		t1.setBounds(280,170,100,25);
		p1.add(t1);

		t2=new TextField();
		t2.setBounds(280,220,100,25);
		p1.add(t2);

		t3=new TextField();
		t3.setBounds(280,270,100,25);
		p1.add(t3);

		im1=new ImageIcon("E:\\collegemanagement\\src\\images\\save.png");
		im2=new ImageIcon("E:\\collegemanagement\\src\\images\\home.png");
		im3=new ImageIcon("E:\\collegemanagement\\src\\images\\reset1.png");

		b1=new JButton("Search",im1);
		b1.setBounds(70,350,100,25);
		p1.add(b1);

		b2=new JButton("Home",im2);
		b2.setBounds(310,350,100,25);
		p1.add(b2);

		b3=new JButton("Reset",im3);
		b3.setBounds(190,350,100,25);
		p1.add(b3);

		p1.setLayout(null);
		f1.add(p1);
		f1.setSize(500,500);
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setBackground(Color.lightGray);
		

		b2.addActionListener(this);
		b1.addActionListener(this);
		b3.addActionListener(this);
	
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b2)
		{
			mainPage1 obj1=new mainPage1();
			f1.setVisible(false);
		}

		if(ae.getSource()==b1)
		{
                    String id=c1.getSelectedItem().toString();
                    
                try
                {
                    String idquery="Select * from marks where sid="+id;
                    
                    Statement stmt2=con.createStatement();
                    ResultSet rs=stmt2.executeQuery(idquery);
                    
                    while(rs.next())
                    {
                        c1.addItem(Integer.toString(rs.getInt(1)));
                        t1.setText(rs.getString(2));
                        t2.setText(rs.getString(3));
                        int m1=Integer.parseInt(rs.getString(2));
                        int m2=Integer.parseInt(rs.getString(3));
                        int mt=m1+m2;
                        t3.setText(Integer.toString(mt));
                        
                    }
                }
                catch(Exception e)
                {
                    System.out.println("Problem"+e);
                }
		
		}

		if(ae.getSource()==b3)
		{
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");
		}
	}



	public static void main(String args[])
	{
		result re=new result();
	}
}
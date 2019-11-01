import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;

class Profile extends DBCON implements ActionListener
{
	Frame f1;
	Panel p1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
	JButton b1,b2,b3,b4,b5,b6;
	ImageIcon im,im1,im2,im3,im4;
	JLabel l;
	JComboBox c1;

	Profile()
	{
		f1=new Frame("Student profile");
		p1=new Panel();
		f1.setBounds(200,40,700,600);
	
		c1=new JComboBox();
		c1.setBounds(300,80,100,25);
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

		l1=new JLabel("<html><head></head><body><font size=4>STUDENT ID:</font></body></html>");
		l2=new JLabel("<html><head></head><body><font size=4>FIRST NAME:</font></body></html>");
		l3=new JLabel("<html><head></head><body><font size=4>LAST NAME:</font></body></html>");
		l4=new JLabel("<html><head></head><body><font size=4>FATHER NAME:</font></body></html>");
		l5=new JLabel("<html><head></head><body><font size=4>ADDRESS:</font></body></html>");
		l6=new JLabel("<html><head></head><body><font size=4>GENDER:</font></body></html>");
		l7=new JLabel("<html><head></head><body><font size=4>DATE OF BIRTH:</font></body></html>");
		l8=new JLabel("<html><head></head><body><font size=4>DATE OF ADMISSION:</font></body></html>");
		l9=new JLabel("<html><head></head><body><font size=4>COURSE:</font></body></html>");
		l10=new JLabel("<html><head></head><body><font size=4>PHN NO:</font></body></html>");
		l11=new JLabel("<html><head></head><body><font size=4>EMAIL ID:</font></body></html>");
		l12=new JLabel("<html><head></head><body><font size=5> PROFILE</font></body></html>");

		l1.setBounds(80, 75,100,30);
		l2.setBounds(80,110,100,30);
		l3.setBounds(80,145, 100,30);
		l4.setBounds(80,180,130,30);
		l5.setBounds(80,215,100,30);
		l6.setBounds(80,250,100,30);
		l7.setBounds(80,285,140,30);
		l8.setBounds(80,340,150,30);
		l9.setBounds(80,373,100,30);
		l10.setBounds(80,405,100,30);
		l11.setBounds(80,440,100,30);
		l12.setBounds(280, 20,300,55);

		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
		p1.add(l5);
		p1.add(l6);
		p1.add(l7);
		p1.add(l8);
		p1.add(l9);
		p1.add(l10);
		p1.add(l11);
		p1.add(l12);
	
		im=new ImageIcon("E:\\collegemanagement\\src\\images\\reset1.png");

		b1=new JButton("Reset",im);
		b1.setBounds(500,355,100,25);
		p1.add(b1);
	
		im1=new ImageIcon("E:\\collegemanagement\\src\\images\\back5.png");

		b2=new JButton("Back",im1);
		b2.setBounds(500,435,100,25);
		p1.add(b2);

		im2=new ImageIcon("E:\\collegemanagement\\src\\images\\view.png");

		b3=new JButton("View ",im2);
		b3.setBounds(500,115,100,25);
		p1.add(b3);
	
		im3=new ImageIcon("E:\\collegemanagement\\src\\images\\update.png");

		b4=new JButton("Update ",im3);
		b4.setBounds(500,195,100,25);
		p1.add(b4);

		im4=new ImageIcon("E:\\collegemanagement\\src\\images\\delusr.png");

		b5=new JButton("Delete ",im4);
		b5.setBounds(500,275,100,25);
		p1.add(b5);
                
                b6=new JButton("Edit ");
		b6.setBounds(500,155,100,25);
		p1.add(b6);

		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		t4=new TextField();
		t5=new TextField();
		t6=new TextField();
		t7=new TextField();
		t8=new TextField();
		t9=new TextField();
		t10=new TextField();
		t11=new TextField();
		t12=new TextField();
		t13=new TextField();
		t14=new TextField();
		t15=new TextField();
	
		t1.setBounds(300,80,150,25);
		t2.setBounds(300,115,150,25);
		t3.setBounds(300,150,150,25);
		t4.setBounds(300,185,150,25);
		t5.setBounds(300,220,150,25);
		t6.setBounds(300,255,150,25);
		t7.setBounds(300,290,150,25);
		t8.setBounds(350,290,40,25);
		t9.setBounds(400,290,50,25);
		t10.setBounds(300,340,150,25);
		t11.setBounds(350,340,40,25);
		t12.setBounds(400,340,50,25);
		t13.setBounds(300,375,150,25);
		t14.setBounds(300,410,150,25);
		t15.setBounds(300,445,150,25);

               // p1.add(t1);
		p1.add(t2);
		p1.add(t3);
		p1.add(t4);
		p1.add(t5);
		p1.add(t6);
		//p1.add(t12);
		p1.add(t13);
		p1.add(t7);
		p1.add(t14);
		p1.add(t15);
		//p1.add(t8);
		//p1.add(t9);
		p1.add(t10);
		//p1.add(t11);
	
		l=new JLabel("(dd/mm/yyyy)");
		l.setBounds(80,315,80,25);
		p1.add(l);
	
		p1.setLayout(null);
		f1.add(p1);
		f1.setSize(700,600);
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setBackground(Color.lightGray);
		
		b2.addActionListener(this);
		b3.addActionListener(this);
		b1.addActionListener(this);
		b5.addActionListener(this);
		b4.addActionListener(this);
                b6.addActionListener(this);
                
                
                t2.setEditable(false);
                t3.setEditable(false);
                t4.setEditable(false);
                t5.setEditable(false);
                t6.setEditable(false);
                t7.setEditable(false);
                t10.setEditable(false);
                t13.setEditable(false);
                t14.setEditable(false);
                t15.setEditable(false);
                
                b4.setEnabled(false);
                b5.setEnabled(false);
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
			reset();
		}

		if(ae.getSource()==b3)  //view
		{
                    b5.setEnabled(true);
                    try
                    {
                        //int id=Integer.parseInt(t1.getText());
                        int id=Integer.parseInt(c1.getSelectedItem().toString());
                        String viewquery="select * from admision where stid="+id;
                        
                        Statement stm=con.createStatement();
                        ResultSet rs=stm.executeQuery(viewquery);
                        
                        while(rs.next())
                        {
                            t2.setText(rs.getString(2));
                            t3.setText(rs.getString(3));
                            t4.setText(rs.getString(4));
                            t5.setText(rs.getString(5));
                            t6.setText(rs.getString(6));
                            t7.setText(rs.getString(7));
                            t10.setText(rs.getString(8));
                            t13.setText(rs.getString(9));
                            t14.setText(Long.toString(rs.getLong(10)));
                            t15.setText(rs.getString(11));
                        }
                        
                        
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(f1,"View button Exception "+e);
                    }
                 
                    
		}

		if(ae.getSource()==b5)
		{
                    try
                    {
                        //int id=Integer.parseInt(t1.getText());
                        int id=Integer.parseInt(c1.getSelectedItem().toString());
                        String delquery="delete from admision where stid="+id;
                        
                        PreparedStatement pst=con.prepareStatement(delquery);
                        pst.executeUpdate();
                        
                        JOptionPane.showMessageDialog(f1,"data deleted");
                        reset();
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(f1,"data not deleted"+e);
                    }
		}


		if(ae.getSource()==b4)
		{
			try
                        {
                            //int id=Integer.parseInt(t1.getText());
                            int id=Integer.parseInt(c1.getSelectedItem().toString());
                            String updatequery="update admision set fname='"+t2.getText()+"',lname='"+t3.getText()+"',fhname='"+t4.getText()+"',address='"+t5.getText()+"',gender='"+t6.getText()+"', phno="+Long.parseLong(t14.getText())+",eid='"+t15.getText()+"' where stid="+id;
                            
                            PreparedStatement pst=con.prepareStatement(updatequery);
                            pst.executeUpdate();
                            
                            
                            JOptionPane.showMessageDialog(f1,"Values updated");
                            reset();
                        }
                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(f1,"Values not get updated"+e);
                        }
		}
                if(ae.getSource()==b6)
		{
                     t2.setEditable(true);
                     t3.setEditable(true);
                     t4.setEditable(true);
                     t5.setEditable(true);
                     t6.setEditable(true);
                     t7.setEditable(true);
                     t10.setEditable(true);
                     t13.setEditable(true);
                     t14.setEditable(true);
                     t15.setEditable(true);
                
                     b4.setEnabled(true);
                     //b5.setEnabled(true);
                    
                    JOptionPane.showMessageDialog(f1,"Now Edit The profile");
                }
        }
                void reset()
                {
                        t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");
			t4.setText(" ");
			t5.setText(" ");
			t6.setText(" ");
			t7.setText(" ");
			t8.setText(" ");
			t9.setText(" ");
			t10.setText(" ");
			t11.setText(" ");
			t12.setText(" ");
			t13.setText(" ");
			t14.setText(" ");
			t15.setText(" ");
                }
	

	public static void main(String args[])
	{
		Profile sp=new Profile();
	}
}
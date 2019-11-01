import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;


class StaffAdForm extends DBCON implements ActionListener
{
	Frame f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l13,l14,l15;
	Panel p1;
	JButton b1,b2,b3;
	TextField t1,t2,t3,t4,t5,t8,t9,t10,t11,t12;
	JComboBox c2,c3,c4;
	JComboBox c5;
	JComboBox c6,c7,c8;
	ImageIcon im1,im2,im3;

	StaffAdForm()
	{
		f1=new Frame("Registration Form");
		p1=new Panel();
		f1.setBounds(200,40,700,650);

		l1=new JLabel("<html><head></head><body><font size=4>STAFF ID:</font></body></html>");
		l2=new JLabel("<html><head></head><body><font size=4>FIRST NAME:</font></body></html>");
		l3=new JLabel("<html><head></head><body><font size=4>LAST NAME:</font></body></html>");
		l4=new JLabel("<html><head></head><body><font size=4>FATHER NAME:</font></body></html>");
		l5=new JLabel("<html><head></head><body><font size=4>ADDRESS:</font></body></html>");
		l6=new JLabel("<html><head></head><body><font size=4>GENDER:</font></body></html>");
		l7=new JLabel("<html><head></head><body><font size=4>DATE OF BIRTH:</font></body></html>");
		l8=new JLabel("<html><head></head><body><font size=4>DATE OF JOINING:</font></body></html>");
		l9=new JLabel("<html><head></head><body><font size=4>QUALIFICATION:</font></body></html>");
		l10=new JLabel("<html><head></head><body><font size=4>PHN NO:</font></body></html>");
		l11=new JLabel("<html><head></head><body><font size=4>EMAIL ID:</font></body></html>");
		l13=new JLabel("<html><head></head><body><font size=4> STAFF ADMISSION FORM:</font></body></html>");
		l14=new JLabel("<html><head></head><body><font size=4> EXPERIENCE:</font></body></html>");
		l15=new JLabel("<html><head></head><body><font size=4> DESIGNATION:</font></body></html>");

		l1.setBounds(150, 75,100,30);
		l2.setBounds(150,110,100,30);
		l3.setBounds(150,145, 100,30);
		l4.setBounds(150,180,130,30);
		l5.setBounds(150,215,100,30);
		l6.setBounds(150,250,100,30);
		l7.setBounds(150,285,140,30);
		l8.setBounds(150,320,150,30);
		l9.setBounds(150,355,150,30);
		l10.setBounds(150,390,100,30);
		l11.setBounds(150,425,100,30);
		l13.setBounds(240,20,300,55);
		l14.setBounds(150,450,120,55);
		l15.setBounds(150,485,120,55);

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
		p1.add(l13);
		p1.add(l14);
		p1.add(l15);

		im1=new ImageIcon("E:\\collegemanagement\\src\\images\\save.png");
		im2=new ImageIcon("E:\\collegemanagement\\src\\images\\reset1.png");
		im3=new ImageIcon("E:\\collegemanagement\\src\\images\\back5.png");
	
		b1=new JButton("Submit",im1);
		b2=new JButton("Reset",im2);
		b3=new JButton("Back",im3);

		b1.setBounds(200,570,100,25);
		b2.setBounds(320,570,100,25);
		b3.setBounds(440,570,100,25);

		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		t4=new TextField();
		t5=new TextField();
		t8=new TextField();
		t9=new TextField();
		t10=new TextField();
		t11=new TextField();
		t12=new TextField();

		t1.setBounds(400,80,150,25);
		t2.setBounds(400,115,150,25);
		t3.setBounds(400,150,150,25);
		t4.setBounds(400,185,150,25);
		t5.setBounds(400,220,150,25);
		t8.setBounds(400,395,150,25);
		t9.setBounds(400,430,150,25);
		t10.setBounds(400,465,150,25);
		t11.setBounds(400,500,150,25);
		t12.setBounds(400,360,150,25);

		p1.add(t1);
		p1.add(t2);
		p1.add(t3);
		p1.add(t4);
		p1.add(t5);
		p1.add(t8);
		p1.add(t9);
		p1.add(t10);
		p1.add(t11);
		p1.add(t12);

		c5=new JComboBox();
                c5.addItem("--Select--");
		c5.addItem("Male");
		c5.addItem("Female");
		c5.setSelectedIndex(0);
		c5.setBounds(400,255,80,25);
		p1.add(c5);

		c2=new JComboBox();
		c2.addItem("DD");
		c2.addItem("1");
		c2.addItem("2");
		c2.addItem("3");
		c2.addItem("4");
		c2.addItem("5");
		c2.addItem("6");
		c2.addItem("7");
		c2.addItem("8");
		c2.addItem("9");
		c2.addItem("10");
		c2.addItem("11");
		c2.addItem("12");
		c2.addItem("13");
		c2.addItem("14");
		c2.addItem("15");
		c2.addItem("16");
		c2.addItem("17");
		c2.addItem("18");
		c2.addItem("19");
		c2.addItem("20");
		c2.addItem("21");
		c2.addItem("22");
		c2.addItem("23");
		c2.addItem("24");
		c2.addItem("25");
		c2.addItem("26");
		c2.addItem("27");
		c2.addItem("28");
		c2.addItem("29");
		c2.addItem("30");
		c2.addItem("31");
		c2.setEditable(true);
		c2.setSelectedIndex(0);

		c3=new JComboBox();
		c3.addItem("MM");
		c3.addItem("01");
		c3.addItem("02");
		c3.addItem("03");
		c3.addItem("04");	
		c3.addItem("05");
		c3.addItem("06");
		c3.addItem("07");
		c3.addItem("08");
		c3.addItem("09");
		c3.addItem("10");
		c3.addItem("11");
		c3.addItem("12");
		c3.setEditable(true);
		c3.setSelectedIndex(0);

		c4=new JComboBox();
		c4.addItem("YYYY");
		c4.addItem("1970");
		c4.addItem("1971");
		c4.addItem("1972");
		c4.addItem("1973");
		c4.addItem("1974");
		c4.addItem("1975");	
		c4.addItem("1976");

		c4.addItem("1977");
		c4.addItem("1978");
		c4.addItem("1979");
		c4.addItem("1980");
		c4.addItem("1981");
		c4.addItem("1982");
		c4.addItem("1983");
		c4.addItem("1984");
		c4.addItem("1985");
		c4.addItem("1986");
		c4.addItem("1987");
		c4.addItem("1988");
		c4.addItem("1989");
		c4.addItem("1990");
		c4.addItem("1991");
		c4.addItem("1992");
		c4.addItem("1993");
		c4.addItem("1994");
		c4.addItem("1995");
		c4.addItem("1996");
		c4.addItem("1997");
		c4.addItem("1998");
		c4.addItem("1999");
		c4.addItem("2000");
		c4.addItem("2001");
		c4.addItem("2002");
		c4.addItem("2003");
		c4.addItem("2004");
		c4.addItem("2005");
		c4.addItem("2006");
		c4.addItem("2007");
		c4.addItem("2008");
		c4.addItem("2009");
		c4.addItem("2010");
		c4.addItem("2011");

		c4.setEditable(true);
		c4.setSelectedIndex(0);

		c2.setBounds(400,290,50,25);
		c3.setBounds(470,290,50,25);
		c4.setBounds(540,290,60,25);
	
		p1.add(c2);
		p1.add(c3);
		p1.add(c4);
	
		c6=new JComboBox();
		c6.addItem("DD");
		c6.addItem("1");
		c6.addItem("2");
		c6.addItem("3");
		c6.addItem("4");
		c6.addItem("5");
		c6.addItem("6");
		c6.addItem("7");
		c6.addItem("8");
		c6.addItem("9");		
		c6.addItem("10");
		c6.addItem("11");
		c6.addItem("12");
		c6.addItem("13");
		c6.addItem("14");
		c6.addItem("15");
		c6.addItem("16");
		c6.addItem("17");
		c6.addItem("18");
		c6.addItem("19");
		c6.addItem("20");
		c6.addItem("21");
		c6.addItem("22");
		c6.addItem("23");
		c6.addItem("24");
		c6.addItem("25");
		c6.addItem("26");
		c6.addItem("27");
		c6.addItem("28");
		c6.addItem("29");
		c6.addItem("30");
		c6.addItem("31");
		c6.setEditable(true);
		c6.setSelectedIndex(0);
			
		c7=new JComboBox();
		c7.addItem("MM");
		c7.addItem("01");
		c7.addItem("02");
		c7.addItem("03");
		c7.addItem("04");
		c7.addItem("05");
		c7.addItem("06");
		c7.addItem("07");
		c7.addItem("08");
		c7.addItem("09");
		c7.addItem("10");
		c7.addItem("11");
		c7.addItem("12");
		c7.setEditable(true);
		c7.setSelectedIndex(0);

		c8=new JComboBox();
		c8.addItem("YYYY");
		c8.addItem("1970");
		c8.addItem("1971");
		c8.addItem("1972");
		c8.addItem("1973");
		c8.addItem("1974");
		c8.addItem("1975");
		c8.addItem("1976");
		c8.addItem("1977");
		c8.addItem("1978");
		c8.addItem("1979");
		c8.addItem("1980");		
		c8.addItem("1981");
		c8.addItem("1982");
		c8.addItem("1983");
		c8.addItem("1984");
		c8.addItem("1985");
		c8.addItem("1986");
		c8.addItem("1987");
		c8.addItem("1988");
		c8.addItem("1989");
		c8.addItem("1990");
		c8.addItem("1991");
		c8.addItem("1992");
		c8.addItem("1993");
		c8.addItem("1994");
		c8.addItem("1995");
		c8.addItem("1996");
		c8.addItem("1997");
		c8.addItem("1998");
		c8.addItem("1999");
		c8.addItem("2000");
		c8.addItem("2001");
		c8.addItem("2002");
		c8.addItem("2003");
		c8.addItem("2004");
		c8.addItem("2005");
		c8.addItem("2006");
		c8.addItem("2007");	
		c8.addItem("2008");
		c8.addItem("2009");
		c8.addItem("2010");
		c8.addItem("2011");
		c8.setEditable(true);
		c8.setSelectedIndex(0);
		
		c6.setBounds(400,325,50,25);
		c7.setBounds(470,325,50,25);
		c8.setBounds(540,325,60,25);
		
		p1.add(c6);
		p1.add(c7);
		p1.add(c8);

		p1.setLayout(null);
		f1.add(p1);
		f1.setVisible(true);
		f1.setSize(700,650);
		f1.setResizable(false);	
		f1.setBackground(Color.lightGray);

		b3.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
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

		if(ae.getSource()==b1)
		{
                    String stfid=t1.getText();
                    String stffname=t2.getText();
                    String stflname=t3.getText();
                    
                    String stffh=t4.getText();
                    String stfaddress=t5.getText();
                    
                    String gender=c5.getSelectedItem().toString();
                    
                    String dobdt=c2.getSelectedItem().toString();
                    String dobmon=c3.getSelectedItem().toString();
                    String dobyear=c4.getSelectedItem().toString();
                    
                    String dob=dobdt+"/"+dobmon+"/"+dobyear;                   
                    
                    String jodt=c6.getSelectedItem().toString();
                    String jomon=c7.getSelectedItem().toString();
                    String joyear=c8.getSelectedItem().toString();
                    
                    String joining=jodt+"/"+jomon+"/"+joyear;
                    String qual=t12.getText();
                    String stph=t8.getText();
                    String stemid=t9.getText();
                    String exp=t10.getText();
                    String deg=t11.getText();
                    
                   
                    try
                    {
                        String insertquery="insert into staff values(?,?,?,?,?,?,?,?,?,?,?,?,?);";
                        
                        PreparedStatement pst=con.prepareStatement(insertquery);
                        
                        pst.setInt(1, Integer.parseInt(stfid));
                        pst.setString(2,stffname);
                        pst.setString(3,stflname);
                        pst.setString(4,stffh);
                        pst.setString(5,stfaddress);
                        pst.setString(6,gender);
                        pst.setString(7,dob);
                        pst.setString(8,joining);
                        pst.setString(9,qual);
                        pst.setLong(10, Long.parseLong(stph));
                        pst.setString(11,stemid);
                        pst.setString(12,exp);
                        pst.setString(13,deg);
                        
                        pst.executeUpdate();
                        
                        
                        JOptionPane.showMessageDialog(f1,"DATA INSERTED");
                    }
                    catch(Exception ex)
                    {
                        JOptionPane.showMessageDialog(f1,"DATA FAIL TO INSERT"+ex);
                    }
		}
		if(ae.getSource()==b2)
		{
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");
			t4.setText(" ");
			t5.setText(" ");
			c5.setSelectedIndex(0);
			c2.setSelectedIndex(0);
			c3.setSelectedIndex(0);
			c4.setSelectedIndex(0);
			c6.setSelectedIndex(0);
			c7.setSelectedIndex(0);
			c8.setSelectedIndex(0);
			t10.setText(" ");
			t8.setText(" ");
			t9.setText(" ");
			t11.setText(" ");
			t12.setText(" ");
		}

	}



	public static void main(String args[])
	{
		StaffAdForm obj=new StaffAdForm();
	}
}
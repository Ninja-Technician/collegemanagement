import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.sql.*;

class mainPage1 extends DBCON implements ActionListener
{
	Frame f1;
	Panel p1;
	MenuBar mb;
	Menu m1,m2,m3,m6,m7,sm1,sm2,sm3,m9;
	MenuItem m11;
	MenuItem m21,m22,m23;
	MenuItem m31,m32,m33,m34,m35;
	MenuItem m61,m63,m64;
	MenuItem m651;
	MenuItem m71,m72,m74,m75;
	MenuItem m81,m82,m83,m84,m85,m86;
	MenuItem m92;
	ImageIcon im1,im2,im3,im4;
	JLabel l1,l2;

	JLabel l3,l4;
	JButton b11,b12;
	TextField t3,t4;
	ImageIcon im5,im6;

	mainPage1() 
	{
		f1=new Frame("College Management");
		f1.setBounds(50,10,900,768);
		mb=new MenuBar();
		f1.setMenuBar(mb);
		p1=new Panel();

		m1=new Menu("Home    ");
		m2=new Menu("Campus     ");
		m3=new Menu("Department     ");
		m6=new Menu("Admission    ");
		m7=new Menu("Examination     ");
		sm1=new Menu("View/Change Details   ");
		sm2=new Menu("Student Details");
		sm3=new Menu("Staff Details");
		m9=new Menu("Help");

		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m6);
		mb.add(m7);
		mb.add(m9);

		m11=new MenuItem("About Us");
		m11.setEnabled(false);
		m1.add(m11);

		m21=new MenuItem("Laboratory");
		m22=new MenuItem("Library");
		m23=new MenuItem("Hostel");

		m21.setEnabled(false);
		m22.setEnabled(false);
		m23.setEnabled(false);

		m2.add(m21);
		m2.add(m22);
		m2.add(m23);

		m31=new MenuItem("MCA Department");
		m32=new MenuItem("MBA Department");
		m33=new MenuItem("BCOM Department");
		m34=new MenuItem("BBA Department");
		m35=new MenuItem("BCA Department");


		m3.add(m31);
		m3.add(m32);
		m3.add(m33);
		m3.add(m34);
		m3.add(m35);

		m61=new MenuItem("Student Admission");
		m63=new MenuItem("Account Details");
		m64=new MenuItem("Staff Admission");



		m6.add(m61);
		m6.add(m63);
		m6.add(m64);
		m6.add(sm1);
		sm1.add(sm2);
		sm1.add(sm3);

		m81=new MenuItem("Student Profile");
		m82=new MenuItem("Upload Student Marks");
		m83=new MenuItem("View All Student Admission Details");
		m84=new MenuItem("View All Student Account Details");
		m85=new MenuItem("Staff Profile");
		m86=new MenuItem("View All Staff Details");

		sm2.add(m81);
		sm2.add(m82);
		sm2.add(m83);
		sm2.add(m84);
		sm3.add(m85);
		sm3.add(m86);

		m72=new MenuItem("Results");
		m7.add(m72);

		m92=new MenuItem("Change Password");
		m9.add(m92);
		

		for(int i=0; i<150; i++ )
		{
			if(i<=50)
			{
				im1=new ImageIcon("E:\\collegemanagement\\src\\images\\im5.jpg");
				l1=new JLabel(im1);
				l1.setBounds(50,50,800,420);
				p1.add(l1);
			}
			else if((i>50)&&(i<100))
			{
				im2=new ImageIcon("E:\\collegemanagement\\src\\images\\im2.jpg");
				l1=new JLabel(im2);
				l1.setBounds(50,50,800,420);
				p1.add(l1);
			}
			else 
			{
				im3=new ImageIcon("E:\\collegemanagement\\src\\images\\im3.jpg");
				l1=new JLabel(im3);
				l1.setBounds(50,50,800,420);
				p1.add(l1);
			}
		}
		l2=new JLabel("<html><body><font size=5 color=blue >WELCOME TO RAWAL COLLEGE</font></body></html>");
		l2.setBounds(270,20,350,25);
		p1.add(l2);

		l3=new JLabel("<html><head></head><body><font size=4> USERNAME</font>  </body></html>");
		l4=new JLabel("<html><head></head><body><font size=4>PASSWORD</font> </body></html>");

		l3.setBounds(150,480,80,80);
		l4.setBounds(450,480,80,80);

		p1.add(l3);
		p1.add(l4);

		im5=new ImageIcon("E:\\collegemanagement\\src\\images\\login.png");
		im6=new ImageIcon("E:\\collegemanagement\\src\\images\\out.png");

		b11=new JButton("Login",im5);
		b12=new JButton("Logout",im6);

		b11.setBounds(320,580,100,25);
		b12.setBounds(460,580,100,25);

		p1.add(b11);
		p1.add(b12);

		t3=new TextField();
		t4=new TextField();

		t4.setEchoChar('*');

		t3.setBounds(280,510,120,25);
		t4.setBounds(580,510,120,25);

		p1.add(t3);
		p1.add(t4);

		p1.setLayout(null);
		f1.add(p1);
		f1.setVisible(true);
		f1.setSize(900,768);
		f1.setBackground(Color.lightGray);
		f1.setResizable(false);

		
		m31.addActionListener(this);
		m61.addActionListener(this);
		m63.addActionListener(this);
		m64.addActionListener(this);
		m81.addActionListener(this);
		m83.addActionListener(this);
		m84.addActionListener(this);
		m82.addActionListener(this);
		m85.addActionListener(this);
		m86.addActionListener(this);
		m22.addActionListener(this);
		m11.addActionListener(this);
		m32.addActionListener(this);
		m33.addActionListener(this);
		m34.addActionListener(this);
		m35.addActionListener(this);
		m21.addActionListener(this);
		m23.addActionListener(this);
		m72.addActionListener(this);
		m92.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
                
               
                m31.setEnabled(false);
		m61.setEnabled(false);
		m63.setEnabled(false);
		m64.setEnabled(false);
		m81.setEnabled(false);
		m83.setEnabled(false);
		m84.setEnabled(false);
		m82.setEnabled(false);
		m85.setEnabled(false);
		m86.setEnabled(false);
		m22.setEnabled(false);
		m11.setEnabled(false);
		m32.setEnabled(false);
		m33.setEnabled(false);
		m34.setEnabled(false);
		m35.setEnabled(false);
		m21.setEnabled(false);
		m23.setEnabled(false);
		m72.setEnabled(false);
		m92.setEnabled(false);
                
                
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==m61)
		{
			StudAdForm obj2=new StudAdForm();
			f1.setVisible(false);
		}
		if(ae.getSource()==m63)
		{
			AccountDetails obj3=new AccountDetails();
			f1.setVisible(false);
		}	
		if(ae.getSource()==m64)
		{
			StaffAdForm obj3=new StaffAdForm();
			f1.setVisible(false);
		}
		if(ae.getSource()==m81)
		{
			Profile sd=new Profile();
			f1.setVisible(false);
		}
		if(ae.getSource()==m83)
		{
                    try {
                        SearchDetail sd=new SearchDetail();
                    } catch (Exception ex) {
                        Logger.getLogger(mainPage1.class.getName()).log(Level.SEVERE, null, ex);
                    }
			f1.setVisible(false);
		}
		if(ae.getSource()==m84)
		{
                    try {
                        SearchDetail1 sd=new SearchDetail1();
                        f1.setVisible(false);
                    } catch (Exception ex) {
                        Logger.getLogger(mainPage1.class.getName()).log(Level.SEVERE, null, ex);
                    }
		}
		if(ae.getSource()==m82)
		{
			marks sd=new marks();
			f1.setVisible(false);
		}
		if(ae.getSource()==m85)
		{
			StaffProfile sd=new StaffProfile();
			f1.setVisible(false);
		}
		if(ae.getSource()==m84)
		{
	
		}
		if(ae.getSource()==m22)
		{
			Library lib=new Library();
			f1.setVisible(false);
		}
		if(ae.getSource()==m11)
		{
			about lib=new about ();
			f1.setVisible(false);
		}       
		if(ae.getSource()==m31)
		{
			MCA b1=new MCA();
			f1.setVisible(false);
		}
		if(ae.getSource()==m32)
		{
			MBA b1=new MBA();
			f1.setVisible(false);
		}
		if(ae.getSource()==m33)
		{
			BCOM b1=new BCOM();
			f1.setVisible(false);
		}
		if(ae.getSource()==m34)
		{
			BBA b1=new BBA();
			f1.setVisible(false);
		}
		if(ae.getSource()==m35)
		{
			BCA b1=new BCA();
			f1.setVisible(false);
		}
		if(ae.getSource()==m21)
		{
			Lab b1=new Lab();
			f1.setVisible(false);
		}
		if(ae.getSource()==m23)
		{
			Hostel b1=new Hostel();
			f1.setVisible(false);
		}
		if(ae.getSource()==m72)
		{
			result b1=new result();
			f1.setVisible(false);
		}
		if(ae.getSource()==m92)
		{
			ChangePassword cp=new ChangePassword();
			f1.setVisible(false);
		}
		if(ae.getSource()==b11)
		{
			String user=t3.getText();
  			String password=t4.getText();
                        String dbuser,dbpass;
                        int count=0;
                        try
                        {
                            String log="select * from login";
                            Statement st=con.createStatement();
                            ResultSet rs=st.executeQuery(log);
                            while(rs.next())
                            {
                                dbuser=rs.getString(1);
                                dbpass=rs.getString(2);
                                if(dbuser.equalsIgnoreCase(user)&& dbpass.equals(password))
                                {
                                     count++;
                            
                                m31.setEnabled(true);
                                m61.setEnabled(true);
                                m63.setEnabled(true);
                                m64.setEnabled(true);
                                m81.setEnabled(true);
                                m83.setEnabled(true);
                                m84.setEnabled(true);
                                m82.setEnabled(true);
                                m85.setEnabled(true);
                                m86.setEnabled(true);
                                m22.setEnabled(true);
                                m11.setEnabled(true);
                                m32.setEnabled(true);
                                m33.setEnabled(true);
                                m34.setEnabled(true);
                                m35.setEnabled(true);
                                m21.setEnabled(true);
                                m23.setEnabled(true);
                                m72.setEnabled(true);
                                m92.setEnabled(true);
                                }
                            }
                            if(count>=1)
                            {
                                JOptionPane.showMessageDialog(f1,"Login Success");
                            }
                            else
                             {
                                  JOptionPane.showMessageDialog(f1,"Login Failed");
                             }
                        }
                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(f1,"Login Error"+e);
                        }
                        
                        
                        
		}
		if(ae.getSource()==b12)
		{
			JOptionPane.showMessageDialog(f1,"Logout Successfully");
		}
	}
	public static void main(String args[])
	{
		mainPage1 obj=new mainPage1();
	}
}
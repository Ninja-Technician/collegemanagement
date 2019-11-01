import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class ChangePassword extends DBCON implements ActionListener
{
	JFrame f1;
	Panel p1;
	JLabel l1,l2,l3;
	JButton b1,b2;
	TextField t1,t2,t3;
	ImageIcon im1,im2;

	ChangePassword()
	{
		f1=new JFrame("Change Password");
		f1.setBounds(250,100,400,350);
		p1=new Panel();
		p1.setLayout(null);
		f1.add(p1);

		l1=new JLabel("Old Password");
		l2=new JLabel("New Password");
		l3=new JLabel("Confirm Password");

		l1.setBounds(70,55,80,25);
		l2.setBounds(70,105,130,25);
		l3.setBounds(70,155,130,25);

		p1.add(l1);
		p1.add(l2);
		p1.add(l3);

		im2=new ImageIcon("E:\\collegemanagement\\src\\images\\ok.png");

		b1=new JButton("Ok",im2);
		b1.setBounds(100,230,100,25);
		p1.add(b1);

		im1=new ImageIcon("E:\\collegemanagement\\src\\images\\back5.png");

		b2=new JButton("Back",im1);
		b2.setBounds(210,230,100,25);
		p1.add(b2);

		t1=new TextField();
		t2=new TextField();
		t3=new TextField();

		t1.setEchoChar('*');
		t2.setEchoChar('*');
		t3.setEchoChar('*');

		t1.setBounds(200,55,120,25);
		t2.setBounds(200,105,120,25);
		t3.setBounds(200,155,120,25);

		p1.add(t1);
		p1.add(t2);
		p1.add(t3);

		f1.setSize(400,350);
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setBackground(Color.lightGray);

		b1.addActionListener(this);
		b2.addActionListener(this);
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
                    String op=t1.getText();
                    String np=t2.getText();
                    String cp=t3.getText();
                    int count=0;
                    
                    try
                    {
                        String psw="select * from login ";
                        Statement stm=con.createStatement();
                        ResultSet rs=stm.executeQuery(psw);
                        
                        
                        while(rs.next())
                        {
                            String dbps=rs.getString(2);
                            if(dbps.equals(op)&&np.equals(cp))
                            {
                                
                                String spw="update login set password='"+np+"'";
                                PreparedStatement pst=con.prepareStatement(spw); 
                                pst.executeUpdate();
                                count++;
                            }
                        }
                        if(count==1)
                        {
                            JOptionPane.showMessageDialog(f1, "Password Changed");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(f1, "Try again");
                        }
                        
                        
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(f1, "Error in database "+e);
                    }
		}
	}

	public static void main(String args[])
	{
		ChangePassword frm=new ChangePassword();
	}
}
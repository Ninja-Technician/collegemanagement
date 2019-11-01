import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

class LoginDemo extends JFrame
{
		 JButton SUBMIT;
		 JLabel label1,label2;
		 final JTextField  text1,text2;

		Connection con;
	
		  LoginDemo()
		{
		  	  setTitle("Login Form");
			    setLayout(null);
			    label1 = new JLabel();
			    label1.setText("Username:");

			    text1 = new JTextField(15);

			    label2 = new JLabel();
			    label2.setText("Password:");

			    text2 = new JPasswordField(15);

			    SUBMIT=new JButton("SUBMIT");

			    label1.setBounds(350,100,100,20);
			    text1.setBounds(450,100,200,20);
			    label2.setBounds(350,130,100,20);
			    text2.setBounds(450,130,200,20);
			    SUBMIT.setBounds(450,160,100,20);

			   add(label1);
			   add(text1);
			   add(label2);
			   add(text2);
			   add(SUBMIT);

			   setVisible(true);
			   setSize(1024,768);

			   SUBMIT.addActionListener(new ActionListener()
			{
				   public void actionPerformed(ActionEvent ae)
                                    {
					    String value1=text1.getText();
					    String value2=text2.getText();
   
  				  	
                                    }
 			});
  		}

	  public static void main(String arg[])
	{
		  LoginDemo ld=  new LoginDemo();
	}
}
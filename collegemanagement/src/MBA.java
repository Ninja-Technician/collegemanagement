import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class MBA implements ActionListener
{
	Frame f1;
	TextArea ta;
	MenuBar mb;
	Menu m1;
	MenuItem m11,m12;

	MBA()
	{
		f1=new Frame("MBA Syllabus");
		f1.setBounds(200,40,600,600);
		mb=new MenuBar();
		f1.setMenuBar(mb);

		m1=new Menu("MBA");
		mb.add(m1);

		m11=new MenuItem("Click for syllabus");
		m1.add(m11);

		m12=new MenuItem("Exit");
		m1.add(m12);

		ta=new TextArea();
		f1.add(ta);

		f1.setVisible(true);
		f1.setSize(600,600);
		f1.setResizable(false);
		f1.setBackground(Color.lightGray);
	
		m11.addActionListener(this);
		m12.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==m11)
		{
			FileDialog fd=new FileDialog(f1,"File Open");
			fd.setVisible(true);

			String str=fd.getDirectory()+fd.getFile();

			try
			{
				File f=new File(str);
				FileInputStream fip=new FileInputStream(f);

				int a=fip.available();

				for(int i=0; i<a; i++)
				{
					ta.setText(ta.getText()+(char)fip.read());
				}
			}
			catch(Exception e)
			{
				System.out.println("File not found");
			}
		}

		if(ae.getSource()==m12)
		{
			mainPage1 obj1=new mainPage1 ();
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
	}



	public static void main(String args[])
	{
		MBA obj=new MBA();
	}
}
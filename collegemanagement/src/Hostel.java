import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Hostel implements  ActionListener
{
	Frame f1;
	Panel p1;
	MenuBar mb;
	Menu m1;
	ImageIcon im,im1,im2;
	JLabel l1,l2;
	JButton b1;
	
	Hostel()
	{
		f1=new Frame("Hostel");
		f1.setBounds(100,40,820, 600);
		mb=new MenuBar();
		f1.setMenuBar(mb);
		p1=new Panel();

		m1=new Menu(" ");
		mb.add(m1);

		im=new ImageIcon("E:\\collegemanagement\\src\\images\\hostel0.jpg");
		l1=new JLabel(im);
		l1.setBounds(0,0,400,300);
		p1.add(l1);
	
		im2=new ImageIcon("E:\\collegemanagement\\src\\images\\hostel1.jpg");
		l2=new JLabel(im2);
		l2.setBounds(400,0,400,300);
		p1.add(l2);

		im1=new ImageIcon("E:\\collegemanagement\\src\\images\\back5.png");
		b1=new JButton("Back",im1);
		b1.setBounds(350,500,100,25);
		p1.add(b1);
	
		l2=new JLabel("<html><body><font size=3>Mount Ida is equipped with hostel facility for Boys and Girls 		separately. It is having a big hostel: which provides 3 seater Room with attached bathroom and other ancillary 		facilities. Furnishing includes a Bed, Study Table, Chair, Mattress, Bed Sheets, Pillow, a bed sheet to cover him self 		in summer, blanket in winter and a separate almirah for each students. The management of the institute is very 		particular that the rooms are kept clear clean airy and well ventilated and maintain hygienic surroundings. Each 		wing of the hostels has all students' recreation room. Internet facility is also available in both hostels boys and gilrs. 		Both hostels are completely wi fi. Mess facility is an integral part of the hostel. Which makes homely comfortable 		stay with a sense of camaraderie diary and fraternity amongst the students means provided in the hostel mess are 		wholesome and nourishing. Mess caters, to the test of the students of different region and with varied culinary 		preferences how ever there are certain guidelines which are followed while planning the meals, mess menu is 		planned and managed by the students in consultation with the caretaker and the management, whose responsible for 		managing the appears in the hostel. The mess committee has representation from 		students.</font></body></html>");

		l2.setBounds(10,260,800,300);
		p1.add(l2);
	
		p1.setLayout(null);
		f1.add(p1);
		f1.setVisible(true);
		f1.setSize(820,600);
		f1.setResizable(false);
		f1.setBackground(Color.lightGray);
		
		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
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
	}


	public static void main(String args[])
	{
		Hostel obj=new Hostel();
	}
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Library implements  ActionListener
{
	Frame f1;
	Panel p1;
	MenuBar mb;
	Menu m1,sm1;
	MenuItem m12;
	MenuItem sm11,sm12,sm13,sm14,sm15;
	ImageIcon im,im1;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1;
	TextField t1,t2,t3,t4,t5,t6;

	Library()
	{
		f1=new Frame("Library Details...");
		f1.setBounds(100,40,800, 600);
		mb=new MenuBar();
		f1.setMenuBar(mb);
		p1=new Panel();

		m1=new Menu("Contents");
		mb.add(m1);
		
		m12=new MenuItem("Journals");
		m1.add(m12);

		sm1=new Menu("Books");
		m1.add(sm1);
		
		sm11=new MenuItem("BCA");
		sm12=new MenuItem("MCA");
		sm13=new MenuItem("BBA");
		sm14=new MenuItem("BCOM");
		sm15=new MenuItem("MBA");
	
		sm1.add(sm11);
		sm1.add(sm12);
		sm1.add(sm13);
		sm1.add(sm14);
		sm1.add(sm15);
	
		im=new ImageIcon("E:\\collegemanagement\\src\\images\\liba.jpg");
		l1=new JLabel(im);
		l1.setBounds(80,0,598,283);
		p1.add(l1);
	
		im1=new ImageIcon("E:\\collegemanagement\\src\\images\\back5.png");
		b1=new JButton("Back",im1);
		b1.setBounds(350,490,100,25);
		p1.add(b1);

		l2=new JLabel("<html><body><font size=3>Total no. of volume</font></body></html>");
		l2.setBounds(230,300,130,25);
		p1.add(l2);

		l3=new JLabel("<html><body><font size=3>Title available</font></body></html>");
		l3.setBounds(230,330,130,25);
		p1.add(l3);

		l4=new JLabel("<html><body><font size=3>Total no. of Journals</font></body></html>");
		l4.setBounds(230,360,130,25);
		p1.add(l4);

		l5=new JLabel("<html><body><font size=3>Total no. of Newspapers</font></body></html>");
		l5.setBounds(230,390,150,25);
		p1.add(l5);

		l6=new JLabel("<html><body><font size=3>Popular Magazines</font></body></html>");
		l6.setBounds(230,420,130,25);
		p1.add(l6);
	
		l7=new JLabel("<html><body><font size=3>Total titles of CD'S & Floppy</font></body></html>");
		l7.setBounds(230,450,170,25);
		p1.add(l7);

		t1=new TextField("70294");
		t1.setBounds(450,300,50,25);
		p1.add(t1);
		t1.setEditable(false);

		t2=new TextField("8380");
		t2.setBounds(450,330,50,25);
		p1.add(t2);
		t2.setEditable(false);

		t3=new TextField("235");
		t3.setBounds(450,360,50,25);
		p1.add(t3);
		t3.setEditable(false);

		t4=new TextField("10");
		t4.setBounds(450,390,50,25);
		p1.add(t4);
		t4.setEditable(false);

		t5=new TextField("36");
		t5.setBounds(450,420,50,25);
		p1.add(t5);
		t5.setEditable(false);
	
		t6=new TextField("737");
		t6.setBounds(450,450,50,25);
		p1.add(t6);
		t6.setEditable(false);
	
		p1.setLayout(null);
		f1.add(p1);
		f1.setVisible(true);
		f1.setSize(800,600);
		f1.setResizable(false);
		f1.setBackground(Color.lightGray);

		b1.addActionListener(this);
		sm11.addActionListener(this);
		sm12.addActionListener(this);
		sm13.addActionListener(this);
		sm14.addActionListener(this);
		sm15.addActionListener(this);
		m12.addActionListener(this);
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

		if(ae.getSource()==sm11)
		{
			bcabook b=new bcabook();
			f1.setVisible(false);
		}

		if(ae.getSource()==sm12)
		{
			mcabook b=new mcabook();
			f1.setVisible(false);
		}

		if(ae.getSource()==sm13)
		{
			bbabook b=new bbabook();
			f1.setVisible(false);
		}

		if(ae.getSource()==sm14)
		{
			bcombook bk=new bcombook();
			f1.setVisible(false);
		}

		if(ae.getSource()==sm15)
		{
			mbabook bk=new mbabook();
			f1.setVisible(false);
		}

		if(ae.getSource()==m12)
		{
			journal bk=new journal();
			f1.setVisible(false);
		}
	}

	public static void main(String args[])
	{
		Library obj=new Library();
	}
}
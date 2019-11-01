import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class SearchStaffDetail extends DBCON implements  WindowListener,ActionListener
{
	
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;

	JFrame f1;
	JPanel p1;
	JLabel l1;
	JButton bt1, bt2;
	JTable tab;
	JScrollPane sp;	
	Vector content = new Vector();
	Vector header = new Vector();
	static String pas;
	ImageIcon im1;

	SearchStaffDetail() throws Exception
	{
		f1 = new JFrame("View Detail Form");
		f1.setBounds(100,20,1200,600);
		p1 = new JPanel();
		p1.setLayout(null);
		p1.setSize(1200, 600);
		im1=new ImageIcon("E:\\collegemanagement\\src\\images\\back5.png");		
	
		bt2 = new JButton("Back",im1);
		bt2.setBounds(370,520,100,20);
		p1.add(bt2);
		bt2.addActionListener(this);

		try
		{
			
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from staff");
			ResultSetMetaData mt = rs.getMetaData();
			int count = mt.getColumnCount();
			for (int i = 1; i <= count; i++)
			{
				header.addElement(mt.getColumnName(i));
			}
			while (rs.next())
			{
				Vector row = new Vector(count);
				for (int i = 1; i <= count; i++)
				{
					row.addElement(rs.getObject(i));
				}
				content.addElement(row);
			}
			con.close();
		}

		catch (Exception ex)
		{
			JOptionPane.showMessageDialog(f1,"Exception: "+ex);
		}
	
		tab = new JTable(content,header);
		tab.setColumnSelectionAllowed(true);
		tab.setAutoscrolls(true);
		tab.setFont(new Font("Verdana", Font.CENTER_BASELINE,10));
		tab.setColumnSelectionAllowed(true);
	
		tab.setCursor(Cursor.getSystemCustomCursor("TEXT_CURSOR"));
		TableColumn col;
		for (int i = 0; i < tab.getColumnCount(); i++)
		{
			col = tab.getColumnModel().getColumn(i);
			col.setMaxWidth(150);
		}
		sp = new JScrollPane(tab);
		sp.setBounds(0,0,1200,500);
		sp.setAutoscrolls(true);
		sp.setVisible(true);
		p1.add(sp);
		f1.add(p1);
		f1.setResizable(false);
		p1.setBackground(Color.lightGray);
		f1.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource()== bt2)
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

	public void windowOpened(WindowEvent we)
	{
	}
	public void windowClosed(WindowEvent we)
	{
	}
	public void windowIconified(WindowEvent we)
	{
	}	
	public void windowDeiconified(WindowEvent we)
	{
	}
	public void windowActivated(WindowEvent we)
	{
	}
	public void windowDeactivated(WindowEvent we)
	{
	}
	public void windowClosing(WindowEvent we)
	{
	f1.dispose();
	}

	public static void main(String as[]) 
	{
            try {
                SearchStaffDetail cp = new SearchStaffDetail();
            } catch (Exception ex) {
                Logger.getLogger(SearchStaffDetail.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
}
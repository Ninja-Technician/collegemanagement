import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.awt.event.*;
public class table1  
{
	public static void main(String []args)
	{
		Vector columnsname=new Vector();
		Vector data=new Vector();
		JPanel jp=new JPanel();

		JFrame f=new JFrame();
		f.setSize(600,400);


		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con =DriverManager.getConnection("Jdbc:Odbc:ds");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from admission");
			//System.out.println("Connection");
			ResultSetMetaData md=rs.getMetaData(); 
			int  coulm=md.getColumnCount();
			for(int i=1;i<=coulm;i++)
			{
				columnsname.addElement(md.getColumnName(i));
				//System.out.println(columnsname);
			}
	
			while(rs.next())
			{
				Vector row =new Vector(coulm);
				for(int i=1;i<=coulm;i++)
				{
					row.addElement(rs.getObject(i));
				}
				data.addElement(row);
			}

			rs.close();
			st.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		try
		{
			JTable table=new JTable(data,columnsname);
			TableColumn col;
			for(int i=0;i<table.getColumnCount();i++)
			{
				col=table.getColumnModel().getColumn(i);
				col.setMaxWidth(100);
			}


			JScrollPane sp=new JScrollPane(table);
			jp.add(sp);
			f.add(jp);
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
		f.setVisible(true);
	}
}

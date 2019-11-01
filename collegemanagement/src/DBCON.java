import java.sql.*;
public class DBCON 
{
        Connection con;
        DBCON()
        {   
            
            try
            {
                
                String ConnectionURL ="jdbc:mysql://localhost:3306/collegemang";
                
                Class.forName("com.mysql.jdbc.Driver");
                
                con=DriverManager.getConnection(ConnectionURL,"root","Raj");
                
                System.out.println("connection success");
            }
            catch(Exception e)
            {
                System.out.println("connection fail"+e);
            }
        }
        public static void main(String args[])
        {
            DBCON obj=new DBCON();
        }
    
    
}

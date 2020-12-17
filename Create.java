import java.sql.*;
class Create
{
public static void main(String args[])
{
	try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3309/pavan","root","");
Statement st=con.createStatement();
String s="CREATE TABLE STUDENT " +
                   "(sno INTEGER not NULL, " +
                   " sname VARCHAR(255), " + 
                   " age INTEGER)";
st.executeUpdate(s);
System.out.println("Table Created Succesfully");
con.close();
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
package jdbcProject;
import java.sql.*;

public class CreateTable {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/demo1","root","root");
		PreparedStatement ps = c.prepareStatement("create table std_info (id integer primary key, name varchar(15), phno bigint unique)");
		System.out.println("TABLE HAS BEEN CREATED");
		ps.execute();
	}

}

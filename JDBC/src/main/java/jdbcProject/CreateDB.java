package jdbcProject;
import java.sql.*;

public class CreateDB {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		PreparedStatement ps = c.prepareStatement("create database demo1");
		ps.execute();
		c.close();

	}

}

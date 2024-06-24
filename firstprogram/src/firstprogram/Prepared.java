package firstprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Prepared {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		String str="create table hospital(hname varchar(20),pname varchar(20),pid int)";
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		PreparedStatement ps=con.prepareCall(str);
		ps.execute();
		System.out.println("table is created");
		
	}
		catch(SQLException e) {
			e.printStackTrace();
		}

}
}
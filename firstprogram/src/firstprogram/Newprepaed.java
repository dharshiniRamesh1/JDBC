package firstprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Newprepaed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// TODO Auto-generated method stub
			String str="select *from employee1";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement ps=con.prepareCall(str);
			ResultSet rs= ps.executeQuery();
			
			
			while(rs.next()) 
			{
				
				int E_id=rs.getInt(1);
				String e_name=rs.getString(2);
				int salary=rs.getInt(3);
				int age=rs.getInt(4);
				String gender=rs.getString(5);
				String D_O_J=rs.getString(6);
				System.out.println("Table Deatails:" + E_id +" " +e_name +" " +salary +" " +age +" " +gender +" "  +D_O_J);
				
			}
		}
			catch(SQLException e) {
				e.printStackTrace();
			}

	}

}

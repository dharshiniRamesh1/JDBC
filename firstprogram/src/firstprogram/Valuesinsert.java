package firstprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Valuesinsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// TODO Auto-generated method stub
			String str="insert into employee1(E_id, e_name, salary, age, gender, D_O_J) values(?,?,?,?,?,?)";
			Scanner sc=new Scanner(System.in);
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement ps=con.prepareCall(str);
		
			
            System.out.println("Enter the details");
			int E_id=sc.nextInt();
			String e_name=sc.next();
			int salary=sc.nextInt();
			int age=sc.nextInt();
			String gender=sc.next();
			String D_O_J=sc.next();
			
			ps.setInt(1, E_id);
			ps.setString(2, e_name);
			ps.setInt(3, salary);
			ps.setInt(4, age);
			ps.setString(5, gender);
			ps.setString(6, D_O_J);
			ps.execute();
			
			
			
			//*while(rs.next()) 
			//{
			//	
				//int E_id=rs.getInt(1);
				//String e_name=rs.getString(2);
				//int salary=rs.getInt(3);
				//int age=rs.getInt(4);
				//String gender=rs.getString(5);
				//String D_O_J=rs.getString(6);
				//System.out.println("Table Deatails:" + E_id +" " +e_name +" " +salary +" " +age +" " +gender +" "  +D_O_J);
				
			//}*//
		}
			catch(SQLException e) {
				e.printStackTrace();
			}

	}

}

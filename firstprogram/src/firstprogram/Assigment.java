package firstprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Assigment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// TODO Auto-generated method stub
			String str="insert into employee1(E_id, e_name, salary, age, gender, D_O_J) values(?,?,?,?,?,?)";
			Scanner sc=new Scanner(System.in);
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement ps=con.prepareCall(str);
		
			
            System.out.println("Enter the details");
           ;
			//System.out.println("Enter gender");
			//String gender=sc.next();
			//System.out.println("Enter D_O_J");
			//String D_O_J=sc.next();
            System.out.println("Enter E_id");
			ps.setInt(1, sc.nextInt());
			System.out.println("e_name");
			ps.setString(2, sc.next());
			System.out.println("enter salary");
			ps.setInt(3, sc.nextInt());
			System.out.println("Enter nage");
			ps.setInt(4, sc.nextInt());
			System.out.println("Enter gender");
			ps.setString(5, sc.next());
			System.out.println("Enter D_O_J");
			ps.setString(6, sc.next());
			ps.execute();
            
			
			String str1="select *from employee1";
			PreparedStatement ps1=con.prepareCall(str1);
			ResultSet rs= ps1.executeQuery("select *from employee1");
			
			while(rs.next()) 
			{
				
				int E_id =rs.getInt(1);
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

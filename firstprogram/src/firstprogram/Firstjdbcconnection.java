package firstprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Firstjdbcconnection {
	public static void main(String[]args) {
		
		try {
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			String str="insert into employee1(E_id, e_name, salary, age, gender, D_O_J) values(10001,'divaya',3400,55,'female','11-06-2004')";
			Statement st=cn.createStatement();
			st.execute(str);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Connect is established");
	}

}

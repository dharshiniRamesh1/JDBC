package employeepackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Employedao {

		
		static Connection cn;
		static PreparedStatement ps;
		ResultSet rs;
		String url="jdbc:mysql://localhost:3306/employee";
		String username="root";
		String password="root";
		Employedao(){
			try {
			cn=DriverManager.getConnection(url,username,password);
			}
			catch(SQLException e){
				e.printStackTrace();
				
			}
			
		}

	/*public static void insert(Employe Data) {
		System.out.print("");
	try {
		String str="insert into employee1 values(?,?,?,?,?,?)";
		
	
	ps=cn.prepareStatement(str);
	ps.setInt(1, Data.getE_id());
	ps.setString(2, Data.getE_name());
	ps.setInt(3, Data.getSalary());
	ps.setInt(4, Data.getAge());
	ps.setString(5, Data.getGender());
	ps.setString(6, Data.getD_O_J());
	ps.execute();
	System.out.println("Data inserted successfully");
	
	
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}*/

public static void delete(Employe Data) {
	System.out.print("");

try {
	String str="delete from employee1 where E_id=1041";
	
//
   ps=cn.prepareStatement(str);
//ps.setInt(1, Data.getE_id());
//ps.setString(2, Data.getE_name());
//ps.setInt(3, Data.getSalary());
//ps.setInt(4, Data.getAge());
//ps.setString(5, Data.getGender());
//ps.setString(6, Data.getD_O_J());
   ps.execute();
System.out.println("Data inserted successfully");


}
catch (SQLException e) {
	// TODO: handle exception
	e.printStackTrace();
}
}

/*public static void fetch(Employe Data) {
	System.out.print(Data.getAge());
String str="select*from employee1";
try {
	

ps=cn.prepareStatement(str);
ps.setInt(1, Data.getE_id());
ps.setString(2, Data.getE_name());
ps.setInt(3, Data.getSalary());
ps.setInt(4, Data.getAge());
ps.setString(5, Data.getGender());
ps.setString(6, Data.getD_O_J());
ps.execute();
System.out.println("Data inserted successfully");


}
catch (SQLException e) {
	// TODO: handle exception
	e.printStackTrace();
}
}*/
}	
	

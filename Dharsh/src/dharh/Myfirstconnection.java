package dharh;


public class Myfirstconnection {
		public static void main(String[]args) {
			
			try {
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("Connect is established");
		}

	}

}

package employeepackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe emp = new Employe(1040, "Melissa Powell", 4500, 35, "female", "2023-01-24" );
			//new Employedao();
			//Employedao.insert(emp);
			new Employedao().delete(emp);
		//	new Employedao().fetch(emp);
			
		}
	}

	




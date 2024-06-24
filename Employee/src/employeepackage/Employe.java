package employeepackage;

public class Employe {
	int E_id ;
	String e_name;
	int salary;
	int age;
	String gender;
	String D_O_J;
	Employe(int E_id, String e_name, int salary, int age, String gender, String D_O_J){
		this.E_id=E_id;
		this.e_name=e_name;
		this.salary=salary;
		this.age=age;
		this.gender=gender;
		this.D_O_J=D_O_J;
		
		
	}
	public int getE_id() {
		return E_id;
	}
	public void setE_id(int e_id) {
		E_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getD_O_J() {
		return D_O_J;
	}
	public void setD_O_J(String d_O_J) {
		D_O_J = d_O_J;
	}
	
	
	

}

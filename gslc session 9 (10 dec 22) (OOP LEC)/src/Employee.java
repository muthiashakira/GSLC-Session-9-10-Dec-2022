/*
 * Class untuk Employee
 */

public class Employee extends Person {
	
	public int officeNum;
	public int salary;
	public Date datehired;
    
	public Employee(int officeNum, int salary, Date datehired, 
			String name, String address, String phone_number, String email) {
		super(name, address, phone_number, email);
		// TODO Auto-generated constructor stub
		this.officeNum = officeNum;
		this.salary = salary;
		this.datehired = datehired;
	}

	public Employee(String name, String address, String phone_number, String email) {
		super(name, address, phone_number, email);
		// TODO Auto-generated constructor stub
	}

}

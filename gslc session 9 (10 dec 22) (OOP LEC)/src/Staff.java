/*
 * Class untuk Staff
 */

public class Staff extends Employee {
	
	public String title = " ";

	public Staff(String name, String address, String phone_number, String email) {
		super(name, address, phone_number, email);
		// TODO Auto-generated constructor stub
	}

	public Staff(int officeNum, int salary, Date datehired, 
			String name, String address, String phone_number, String email) {
		super(officeNum, salary, datehired, name, address, phone_number, email);
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
       return "Staff: " + name + 
    		   "\nSalary: " + salary +  
    		   "\nDate hired (mm/dd/yy): " + datehired.getDate() +  
    		   "\nOffice number: " + officeNum  + 
    		   "\nAddress" + address + 
    		   "\nPhone Number: " + phone_number + 
    		   "\nEmail: " + email;
    }
	
}
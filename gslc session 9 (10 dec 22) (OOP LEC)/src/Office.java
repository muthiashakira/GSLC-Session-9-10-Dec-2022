/*
 * Class untuk Office
 */

public class Office extends Employee {
	
	public String office_hours = "";
	public String rank = "";

	public Office(String name, String address, String phone_number, String email, 
			int officeNum, int salary, Date datehired,
			String office_hours, String rank) {
		super(name, address, phone_number, email);
		// TODO Auto-generated constructor stub
		this.officeNum = officeNum;
		this.salary = salary;
		this.datehired = datehired;
		this.office_hours = office_hours;
		this.rank = rank;
	}
	
		@Override
	public String toString()
    {
        return "Office: " + name + 
        		"\nRank (Bronze / Gold / Platinum): " + rank + 
        		"\nSalary: " + salary +  
        		"\nDate hired (mm/dd/yy): " + datehired.getDate() +  
        		"\nOffice number: " + officeNum + 
        		"\nAddress: " + address + 
        		"\nPhone Number: " + phone_number + 
        		"\nOffice hours:  " + office_hours + 
        		"\nEmail: " + email;
    }
	
}

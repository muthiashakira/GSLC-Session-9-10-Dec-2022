/*
 * Class untuk Customer
 */

public class Customer extends Person {
	
	public final String member;

	public Customer(String name, String address, String phone_number, String email, String member) {
		super(name, address, phone_number, email);
		// TODO Auto-generated constructor stub
		this.member = member;
	}
	
	@Override
    public String toString() {
      return "Customer :" + name + 
    		  "\nMember (Bronze / Gold / Platinum) " + member + 
    		  "\nAddress: " + address + 
    		  "\nPhone number: " + phone_number + 
    		  "\nEmail Address " + email ;
    }
	
}

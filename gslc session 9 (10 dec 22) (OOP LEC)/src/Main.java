/*
 * 
 * Membuat program yang bisa menyimpan data Customer dan Employee
 * 
 * User dapat memilih menu mana yang user ingin simpan datanya
 * Membuat menu:
 * 1) To Create a Customer
 * 2) To Create an Employee
 * 
 * Jika user memasukkan nomor 1, maka program akan menyuruh user untuk memasukkan data diri untuk Customer (Seperti dibawah): 
 * Enter your Name:
 * Enter your Address:
 * Enter your Phone Number:
 * Enter your Email Address:
 * Enter your Customer's Member (Bronze / Gold / Platinum):
 * 
 * Setelah user mengisi data diri untuk Customer maka program akan mengeluarkan hasil data diri yang sudah diisi oleh user.
 * 
 * Jika user memasukkan angka 2, maka program akan menyuruh user untuk memasukkan data diri untuk Employee (Seperti dibawah):  
 * Enter your Name:
 * Enter your Address:
 * Enter your Phone Number:
 * Enter your Email Address:
 * 
 * Setelah user mengisi data diri untuk Employee maka program akan mengeluarkan menu lagi untuk Employee memilih apakah user 
 * seorang Office member atau Staff member (Seperti dibawah):
 * 1) To Create an Office Member
 * 2) To Create a Staff Member
 * 
 * Jika user memasukkan nomor 1, maka program akan menyuruh user untuk memasukkan data diri untuk Office Member (Seperti dibawah): 
 * Enter your Office Number:
 * Enter your Salary:
 * Enter Date of Hired (mm/dd/yy):
 * Enter your Office Hours:
 * Enter your Rank (Bronze / Gold / Platinum):
 * 
 * Setelah user mengisi data diri untuk Office Member maka program akan mengeluarkan hasil data diri yang sudah diisi oleh user.
 * 
 * Jika user memasukkan nomor 2, maka program akan menyuruh user untuk memasukkan data diri untuk Staff Member (Seperti dibawah): 
 * Enter your Office Number:
 * Enter your Salary:
 * Enter Date of Hired (mm/dd/yy):
 * 
 * Setelah user mengisi data diri untuk Staff Member maka program akan mengeluarkan hasil data diri yang sudah diisi oleh user.
 * 
 */

import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1) To Create a Customer\n" + "2) To Create an Employee\n" + "Type The Number and Enter: ");
		int choice = Integer.parseInt(sc.nextLine());
		
		if(choice == 1) {
        	System.out.println("To Create a Customer");
            
            System.out.print("Enter your Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter your Address: ");
            String address = sc.nextLine();
            
            System.out.print("Enter your Phone Number: ");
            String phone = sc.nextLine();
             
            System.out.print("Enter your Email Address: ");
            String email = sc.nextLine();
             
            System.out.print("Enter your Customer's Member (Bronze / Gold / Platinum): ");
            String member = sc.nextLine();
             
            Customer s1 = new Customer(name, address, phone, email, member);
            System.out.println(s1);
        } 
        else {
        	System.out.print("Enter your Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter your Address: ");
            String address = sc.nextLine();
            
            System.out.print("Enter your Phone Number: ");
            String phone = sc.nextLine();
    
            System.out.print("Enter your Email Address: ");
            String email = sc.nextLine();
            
               System.out.print("1) To Create an Office Member\n" + "2) To Create a Staff Member\n" + "Type the number and Enter: ");
               choice = Integer.parseInt(sc.nextLine());
           
               if(choice == 1) {
            	   System.out.print("Enter your Office Number: ");
                   int officeNum = Integer.parseInt(sc.nextLine());
                   
                   System.out.print("Enter your Salary: ");
                   int salary = Integer.parseInt(sc.nextLine());
                   
                   System.out.print("Enter Date of Hired (mm/dd/yy): ");
                   String hired_date = sc.nextLine();
                   Date m1 = new Date(hired_date);
            
                   System.out.print("Enter your Office Hours: "); 
                   String office_hours = sc.nextLine();
                   
                   System.out.print("Enter your Rank (Bronze / Gold / Platinum): ");
                   String rank = sc.nextLine();
                   
                   Office o1 = new Office(name, address, phone, email, officeNum, salary, m1, office_hours, rank);
                   
                   System.out.println(o1);
               }
               else {
                    System.out.print("Enter your Office Number: ");
                    int officeNum = Integer.parseInt(sc.nextLine());
                          
                    System.out.print("Enter your Salary: ");
                    int salary = Integer.parseInt(sc.nextLine());
                          
                    System.out.print("Enter Date of Hired (mm/dd/yy): ");
                    String hired_date = sc.nextLine();
                    Date m1 = new Date(hired_date);
                    
                    Staff s1 = new Staff(officeNum, salary, m1, name, address, phone, email);
                          
                    System.out.println(s1);
                          
              }
        }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

package  Workshop.UserLoginValidator;

import java.util.Scanner;

public class UserValidatorApp {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the First Name : ");
	String firstName = sc.nextLine();
	System.out.print("Enter the Last Name : ");
	String lastName = sc.nextLine();
	System.out.println("Enter the Phone Number : ");
	String phoneNumber = sc.nextLine();
	System.out.print("Enter the Email : ");
	String email = sc.nextLine();
	System.out.print("Enter the Password : ");
	String password = sc.nextLine();
	System.out.print("Enter the Age : ");
	int age = sc.nextInt();
	System.out.print("Enter the Pincode : ");
	int pincode = sc.nextInt();
	
	User user = new User(firstName,lastName,phoneNumber,email,password,age,pincode);
	
	System.out.println("--------Users---------");
	System.out.println("Name : " + user.getFirstName() + " " + user.getLastName());
	System.out.println("Phone Number :" +user.getPhoneNumber());
	System.out.println("Email : " + user.getEmail());
	System.out.println("Age : " + user.getAge());
	System.out.println("Pincode" + user.getPincode());
	
	
	Login login = new Login(user.getEmail() , user.getPassword());
	
	System.out.println("-------------Login-----------");
	System.out.println("Email : " +  login.getEmail());
	System.out.println("Password" + login.getPassword());
	
	}
}
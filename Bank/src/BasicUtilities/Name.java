package BasicUtilities;

import java.util.Scanner;

import javax.sound.midi.Soundbank;


public class Name {
	protected String firstName;
	protected String middleName;
	protected String lastName;
	
	//Getters And Setters
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		//System.out.println(firstName);
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		//System.out.println(middleName);
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		//System.out.println(lastName);
		this.lastName = lastName;
	}
	public static Name setName() {
		Scanner Scan = new Scanner(System.in);
		Name N = new Name();
		System.out.println("\n\t\t   LastName FirstName MiddleName");
		System.out.print("\tFull Name :");
		N.setLastName(Scan.next());
		N.setFirstName(Scan.next());
		N.setMiddleName(Scan.next());
		//System.out.println(N);
		return N;	
	}
	public String toString() {
		return getLastName()+" "+getFirstName()+" "+getMiddleName();
	}
}
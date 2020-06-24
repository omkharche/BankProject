package BasicUtilities;

import java.util.Scanner;

public class FormUtilities {

	public String selectGender() {
		Scanner Scan = new Scanner(System.in);
		System.out.println("\t\t  M-Male / F-Female / O-Other ");
		boolean validGender = false;
		while(validGender == false) {
			System.out.print("\tGender : ");
			String Gender = Scan.next();
			if(Gender.equalsIgnoreCase("M")) {
				validGender = true;
				return "Male";
			}
			else if(Gender.equalsIgnoreCase("F")) {
				validGender = true;
				return "Female";
			}
			else if(Gender.equalsIgnoreCase("O")) {
				validGender = true;
				return "Other";
			}
			else
				validGender = false;
		}
		return "";
	}
}


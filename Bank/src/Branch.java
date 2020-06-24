import java.util.Scanner;

import BasicUtilities.Address;

interface Branch {
	
	static String accountTypes[][] = {
				{"Savings","BSBD","BSBDSS"},
				{"Current"},
				{"Term Deposits","Recuring Deposit","Fixed Deposit"},
				{"Share Accounts","Traiding","Demant"},
				{"NRO","NRI","NRE","FCNR"}
	};	
	
	static String branchName = "PUNE  SSI (1140)";
	//static Address branchAddress = Address.acceptAddress();
	static long Telephone = 89457356;
	static long MICR_code = 411014007;
	static String IFSC_code = "KOJB000145";

	static String acceptAccountType() {
		boolean validChoice = false;
		Scanner Scan = new Scanner(System.in);
		byte choice=0,choice2=0;
		while(validChoice == false){
			System.out.println("\tAccount Types :");
			for(int i=0; i<accountTypes.length; i++)
				System.out.println("\t\t"+(i+1)+"- "+Branch.accountTypes[i][0]);
			
			System.out.print("\tSelect Situable Type For You :");
			choice = Scan.nextByte();
		
			if(choice >= 6) {
				System.out.println("Kindly Select From the Given Options...");
			}
			else {
				validChoice = true;
				System.out.println("\t~"+Branch.accountTypes[choice-1][0]+" Accountss");
				for(int i=0; i<accountTypes[choice-1].length-1;i++) {
					System.out.println("\t\t"+(i+1)+"- "+Branch.accountTypes[choice-1][i+1]);
				}
			}
		}
		validChoice = false;
		while(validChoice == false){
			System.out.print("\tSelect the type of "+Branch.accountTypes[choice-1][0]+" : ");
			choice2 = Scan.nextByte();
			if(choice2 >= Branch.accountTypes[choice-1].length) {
				System.out.println("Kindly Select the Valid Option..");
				validChoice = false;
			}
			else {
				validChoice = true;
			}
		}
	return Branch.accountTypes[choice-1][choice2];		
	}
	
	static void openAccount(Customer C) {
		C = Customer.setCustDetails(C);
		C = Account.setAccountDetails(C);
		
	}

}
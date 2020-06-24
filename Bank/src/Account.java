import java.util.Scanner;

import javax.sound.midi.Soundbank;

public abstract class Account {
	protected int accNo;
	protected float accBalance;
	protected String accType;
	protected String branchName;
	protected Branch branch;
	protected String dateofAccountOpening;
	
	// Getters And Setters
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public float getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(float accBalance) {
		this.accBalance = accBalance;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public String getDateofAccountOpening() {
		return dateofAccountOpening;
	}
	public void setDateofAccountOpening(String dateofAccountOpening) {
		this.dateofAccountOpening = dateofAccountOpening;
	}
	public abstract void  createAccount(); 
	
	/*public abstract void accStatement();
	
	public abstract void manageLoans();
	
	public abstract void manageCards();
	
	public abstract void manageFDnRD();*/
	
	
	public static Account acceptAccountType() {
		boolean validChoice = false;
		Scanner Scan = new Scanner(System.in);
		byte choice=0,choice2=0;
		while(validChoice == false){
			System.out.println("\tAccount Types :");
			for(int i=0; i<Branch.accountTypes.length; i++)
				System.out.println("\t\t"+(i+1)+"- "+Branch.accountTypes[i][0]);
			
			System.out.print("\tSelect Situable Type For You :");
			choice = Scan.nextByte();
		
			if(choice >= 6) {
				System.out.println("Kindly Select From the Given Options...");
			}
			else {
				validChoice = true;
				System.out.println("\t~"+Branch.accountTypes[choice-1][0]+" Accountss");
				for(int i=0; i<Branch.accountTypes[choice-1].length-1;i++) {
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
		switch(choice) {
			case 1:
				switch(choice2) {
					case 1:
						BSBD B = new BSBD();
						B.createAccount();
						return  (BSBD)B;
					
					case 2:
						BSBDSS Bs = new BSBDSS();
						return  (BSBDSS)Bs;
				}
				
			case 2:
				CurrentAccount C = new CurrentAccount();
				return (CurrentAccount)C;
			
			case 3:
				switch(choice2) {
					case 1:
						RecuringDepostit  RD = new RecuringDepostit();
						return (RecuringDepostit)RD;
				
					case 2:
						FixedDeposit FD = new FixedDeposit();
						return (FixedDeposit)FD;
						
				}
			
			case 4:
				ShareAccount S = new ShareAccount();
				return (ShareAccount)S;
			
			case 5:
				switch(choice2) {
					case 1:
						NRI Ni = new NRI();
						return  (NRI)Ni;
						
					case 2:
						NRE Ne = new NRE();
						return  (NRE)Ne;
						
					case 3:
						FCNR Fc = new FCNR();
						return  (FCNR)Fc;
				
				}
		}
		return null;
	}
	
	public static Customer setAccountDetails(Customer C) {
		System.out.println("\n\t ~Account Details  ");
		C.setAccount(Account.acceptAccountType());

		return C;
	}
}

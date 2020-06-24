import java.util.Scanner;
import BasicUtilities.*;

public class Customer {
	
	protected int custID;
	protected short mPin;
	protected Name custName;
	protected long mobileNo;
	protected Address custAddress;
	protected byte age;
	protected String Gender;
	protected IdProof personalID;
	protected Account Account;
	protected Beneficiary beneficiary;
	
	
	// Getters And Setters
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	
	public short getmPin() {
		return mPin;
	}
	public void setmPin(short mPin) {
		this.mPin = mPin;
	}
	
	public String getCustName() {
		return custName.getLastName()+" "+custName.getFirstName()+" "+custName.getMiddleName();
	}
	public void setCustName(Name custName) {
		this.custName = custName;
	}
	
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public Address getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(Address custAddress) {
		this.custAddress = custAddress;
	}
	
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}

	public Beneficiary getBeneficiary() {
		return beneficiary;
	}
	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}
	
	public IdProof getPersonalId() {
		return personalID;
	}
	public void setPersonalId(IdProof personalID) {
		this.personalID = personalID;
	}
	public IdProof getPersonalID() {
		return personalID;
	}
	public void setPersonalID(IdProof personalID) {
		this.personalID = personalID;
	}
	public Account getAccount() {
		return Account;
	}
	public void setAccount(Account account) {
		Account = account;
	}
	
	
	public static Customer setCustDetails(Customer C) {
		Scanner Scan = new Scanner(System.in);
		byte choice = 0; 
		
	
		DrawLine line = new DrawLine();
		FormUtilities form = new FormUtilities();
		
		
		System.out.println("\t\tKindly Fill All the Mendetoery Fields :");
		System.out.println("\n\t ~Personal Details..");
		line.drawTabLine();
		C.setCustName(Name.setName());
		System.out.print("\tAge : ");
		C.setAge(Scan.nextByte());
		
		System.out.print("\tMobile No : ");
		C.setMobileNo(Scan.nextLong());
		
		C.setGender(form.selectGender());		
		line.drawTabLine();
		
		C.setCustAddress(Address.acceptAddress());	
		line.drawTabLine();
		
		C.setPersonalId(IdProof.acceptIdProof());		
		line.drawTabLine();
		
		System.out.print("\tWant to add Beneficiary For Your Account [Y/n] : " );
		String Choice = Scan.next();
		if(Choice.equalsIgnoreCase("Y")) {
			C.setBeneficiary(Beneficiary.acceptBeneficiary());
		}
		line.drawTabLine();
		return C;
	}	
}

import java.util.Scanner;

public class IdProof {
	protected String IdType;
	protected String IdNo;
	
	public String getIdType() {
		return IdType;
	}
	public void setIdType(String idType) {
		IdType = idType;
	}
	public String getIdNo() {
		return IdNo;
	}
	public void setIdNo(String idNo) {
		IdNo = idNo;
	}
	
	public static IdProof acceptIdProof() {
		Scanner Sc = new Scanner(System.in);
		IdProof Id = new IdProof();
		boolean validChoice = false;
		System.out.println("\t\t\t 1-Aadhar Card 2-Pan Card");
		while(validChoice == false) {
			System.out.print("\tPersonal ID Type : ");
			byte Ch = Sc.nextByte();
			if(Ch == 1) {
				Id.setIdType("Aadhar");
				validChoice = true;
			}
			else if(Ch == 2) {
				Id.setIdType("PAN");
				validChoice = true;
			}
			else 
				validChoice = false;
		}
		System.out.print("\tPersonal ID No. : ");
		Id.setIdNo(Sc.next());	
	return Id;
	}
}

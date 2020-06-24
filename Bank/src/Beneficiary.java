import java.util.Scanner;
import BasicUtilities.*;
public class Beneficiary {
	
	protected Name beneficiaryName;
	protected String relationWithAccountHolder;
	
	//Getters And Setters
	
	public Name getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(Name beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	
	public String getRelationWithAccountHolder() {
		return relationWithAccountHolder;
	}
	public void setRelationWithAccountHolder(String relationWithAccountHolder) {
		this.relationWithAccountHolder = relationWithAccountHolder;
	}
	
	public static Beneficiary acceptBeneficiary() {
		Scanner Sc = new Scanner(System.in);
		Beneficiary B = new Beneficiary();
		DrawLine line = new DrawLine();
		System.out.println("\n\t Fill the Benificiary Details Given Below");
		line.drawLine();
		FormUtilities form = new FormUtilities();
		Name name = new Name();
		B.setBeneficiaryName(name.setName());
		System.out.print("\tRelation With Account Holder : ");
		B.setRelationWithAccountHolder(Sc.next());
		return B;
	}
}

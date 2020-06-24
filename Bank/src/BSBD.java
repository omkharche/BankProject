
public class BSBD  extends SavingsAccount{ 
	/*public static float intrestRate;
	public static float minBalanceToMaintainO;
	public static float chargesForNotMaintaingTheMinBalance;
	public static float maintenanceCharges;*/
	@Override
	public void createAccount() {
		System.out.println("Inside BSBD");
	}

	@Override
	public void setAccountLimitations() {
		minBalanceToMaintainO = 1500F;
		
	}
}

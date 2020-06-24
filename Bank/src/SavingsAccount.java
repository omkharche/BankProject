
public abstract class SavingsAccount extends Account {
	public static float intrestRate;
	public static float minBalanceToMaintainO;
	public static float chargesForNotMaintaingTheMinBalance;
	public static float maintenanceCharges;
	
	public abstract  void createAccount();
	public void showProfile() {
		
	}
	public abstract void setAccountLimitations();
}

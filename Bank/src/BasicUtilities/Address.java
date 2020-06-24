package BasicUtilities;

import java.util.Scanner;

public class Address {
	protected int houseNo;
	protected String buildingName;
	protected String roadName;
	protected String City;
	protected int pinCode;
	protected String landMark;
	
	// Getters And Setters 
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	
	public static Address acceptAddress() {
		Scanner Sc = new Scanner(System.in);
		Address Add = new Address();
		System.out.println("\t\t House No  Builing Name  Road Name  City  Pincode ");
		System.out.print("\tAddress : ");
		Add.setHouseNo(Sc.nextInt());
		Add.setBuildingName(Sc.next());
		Add.setRoadName(Sc.next());
		Add.setCity(Sc.next());
		Add.setPinCode(Sc.nextInt());
		return Add;
	}
	public String toString() {
		return getHouseNo()+" "+getBuildingName()+" "+getRoadName()+" "+getCity()+" "+getPinCode();
	}
}

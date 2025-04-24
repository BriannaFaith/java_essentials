package javaProgram;

public class bankTypes {
	
	public enum BankType { // enum
		SAVINGS, LOANS, PROPERTY
	}
	
	//method
	public void displayBankType(BankType bankType) {
		System.out.println("The selected Bank Type is : " + bankType);
	}

}

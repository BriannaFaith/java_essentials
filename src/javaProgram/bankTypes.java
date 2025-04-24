package javaProgram;

import java.util.Scanner;

public class bankTypes {
	
	public enum BankType { // enum
		SAVINGS, LOANS, PROPERTY
	}
	
	//method
	public void displayBankType(BankType bankType) {
		System.out.println("The selected Bank Type is : " + bankType);
	}
	
	//object with scanner
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter bank type: "); //prompts user for input
		String bank_type = scanner.nextLine().toUpperCase();
		BankType selectedType = BankType.valueOf(bank_type); //checks the value is of the enum type
		
		bankTypes bank = new bankTypes();
		bank.displayBankType(selectedType);
		scanner.close();
		
	}

}

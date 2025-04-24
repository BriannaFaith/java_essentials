package javaProgram;

public class objectOriented extends bankTypes { // inheritance with bankType class
// classes and objects -- bank use_cases
	//variables
	double balance;
	String accountNumber;
	String accountNumberDetails;
	BankType bankType;
	
	
	//constructor
	public objectOriented(double initialBalance, String accountNumber, String accountNumberDetails, BankType bankType) { //passed in the arguments
		balance =initialBalance;
		this.accountNumber = accountNumber;
		this.accountNumberDetails = accountNumberDetails;
		this.bankType = bankType;
		System.out.println("Your initial balance is " +balance);
	}

	//methods
	public void deposit(double amount) {
		balance +=amount;
		System.out.println("The balance is : " +balance);
	}
	
	public void withdraw(double amount) {
		if (amount<=balance) {
			balance-= amount;
			System.out.println("New balance after withdrawal :"+balance);
		}
		else {
			System.out.println("Insufficient account balance " + balance +" to withdraw " +amount);
		}
	}
	
	public void displayAccountDetails() {
		System.out.println("AccountNumber : " + accountNumber);
		System.out.println("AccountHolder Name :"+accountNumberDetails);
	}
	
	//polymorphism - an object calling a method triggers many forms
	@Override
	public void displayBankType(BankType bankType) {
		System.out.println("This is the new behaviour for :" +bankType);
		System.out.println("This is the new behaviour for :" +bankType);
	}

	
	// object
	public static void main(String args[]){
		objectOriented myAccount = new objectOriented(100, "001", "John Doe", BankType.LOANS);
		myAccount.displayAccountDetails();
		myAccount.displayBankType(BankType.LOANS);
		myAccount.deposit(50); //150.0
		myAccount.withdraw(20); // 130.0
		
		objectOriented friendAccount = new objectOriented(100, "002", "Jane Doe", BankType.SAVINGS);
		friendAccount.displayAccountDetails();
		friendAccount.displayBankType(BankType.SAVINGS); //inherited the method 
		friendAccount.deposit(200); //300
		friendAccount.withdraw(400); //insufficient
	}

	
	
}

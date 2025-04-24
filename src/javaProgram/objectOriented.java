package javaProgram;

public class objectOriented {
// classes and objects -- bank use_cases
	double balance;
	String accountNumber;
	String accountNumberDetails;
	
	
	//constructor
	public objectOriented(double initialBalance, String accountNumber, String accountNumberDetails) {
		balance =initialBalance;
		this.accountNumber = accountNumber;
		this.accountNumberDetails = accountNumberDetails;
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
	// object
	public static void main(String args[]){
		//objectOriented myAccount = new objectOriented (); - without a constructor
		objectOriented myAccount = new objectOriented(100, "001", "John Doe");
		//myAccount.balance = 100;
		myAccount.displayAccountDetails();
		myAccount.deposit(50); //150.0
		myAccount.withdraw(20); // 130.0
		
		objectOriented friendAccount = new objectOriented(100, "002", "Jane Doe");
		//friendAccount.balance = 100;
		friendAccount.deposit(200); //300
		friendAccount.withdraw(400); //insufficient
	}
	
}

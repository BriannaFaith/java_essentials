package javaProgram;

public class objectOriented {
// classes and objects -- bank use_cases
	double balance;
	//methods
	public void deposit(double amount) {
		balance +=amount;
		System.out.println("The balance is : " +balance);
	}
	
	public void withdraw(double amount) {
		if (amount<=balance) {
			balance-= amount;
		}
		else {
			System.out.println("Insufficient account balance " + balance +" to withdraw " +amount);
		}
	}
	
	// object
	public static void main(String args[]){
		objectOriented myAccount = new objectOriented ();
		myAccount.balance = 100;
		myAccount.deposit(50);
		myAccount.withdraw(20);
		
		objectOriented friendAccount = new objectOriented();
		friendAccount.balance = 100;
		friendAccount.deposit(200);
		friendAccount.withdraw(400);
	}
	
}

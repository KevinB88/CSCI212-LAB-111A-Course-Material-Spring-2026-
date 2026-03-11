package lab_lecture8;

public class BankAccount {
	
	private double balance; 
	
	public BankAccount(double balance){
		this.balance = balance; 
	}
	
	public void withdraw(double amount) throws InsufficientFundsException {
		
		if(amount > balance) {
			throw new InsufficientFundsException("Withdrawal exceeds account balance!");
		}
		balance -= amount; 
		System.out.println("Successfully withdrawed $" + amount);
	}
	
	public void displayBalance() {
		System.out.println("Balance: $" + balance);
	}

}

package lab_lecture8;

public class ExceptionsExample {
	
	// need to specify the exception we defined within the main method
	public static void main(String[] args) throws InsufficientFundsException {
		
		//Example #1 
		int x = 10; 
		int y = 0;
		// We get an "exception" after attempting to divide by 0 
		// generally an illegal operation in math 
//		System.out.println(x/y); 
		
		
		//Example #2
		//i: 		   0 1 2 
		int[] array = {1,2,3}; 
		
		for(int i = 0; i < 4; i++) {
//			System.out.println(array[i]); 
		}
		
		
		BankAccount b = new BankAccount(100);
		b.displayBalance(); 
		b.withdraw(35);
		System.out.println(); 
		b.withdraw(70);
		
	
	}

}

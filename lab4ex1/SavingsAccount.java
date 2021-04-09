package lab4ex1;

public class SavingsAccount extends Account {
	
	final private int minimumBalance = 500;
	
	SavingsAccount(){
		
	}
	SavingsAccount(long accNum, double balance, Person accHolder){
		super(accNum,balance, accHolder);
	}

	@Override
	void withdraw(double amount) {
		 
		if(getBalance() - amount >= minimumBalance) {
			setBalance(getBalance()-amount);
		}
		else {
			System.out.println("Amount will exceed minimum Balance!!!");
		}
		
	}
	
}


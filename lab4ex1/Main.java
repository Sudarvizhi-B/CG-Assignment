package lab4ex1;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Smith",21);
		Person p2 = new Person("Kathy",22);
		
		Account a1 = new Account(9200109,2000,p1);
		Account a2 = new Account(6534556,3000, p2);
		
		SavingsAccount sa = new SavingsAccount(6534556,3000, p2);
		CurrentAccount ca = new CurrentAccount(9836372,3000, p2);
		
		a1.deposit(2000);
		System.out.println("Smith balance "+a1.getBalance());
		a2.withdraw(2000);
		System.out.println("Kathy balance "+a2.getBalance());
		
		sa.withdraw(3000);
		ca.withdraw(2000);
	}

}

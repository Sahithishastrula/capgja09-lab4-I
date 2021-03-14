package Lab4Ex1;

public class SavingsAccount extends Account {
	final double minBal=500;
	

	public SavingsAccount(long accno, double balance, Person person) {
		super(accno, balance, person);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(super.getBalance()-amount>minBal) {
			super.setBalance(super.getBalance()-amount);
			System.out.println("Withraw amount is :"+amount);
			System.out.println("Current Balance is: "+super.getBalance());
		}
			
		else {
			System.out.println("Minimum balance is required");
		}
	}
	
}

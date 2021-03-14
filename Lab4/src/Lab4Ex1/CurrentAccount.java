package Lab4Ex1;

public class CurrentAccount extends Account {
	double overdraftlimit=20000;
	
	public CurrentAccount(long accno, double balance, Person person) {
		super(accno, balance, person);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(super.getBalance()-amount>overdraftlimit) {
			super.setBalance(super.getBalance()-amount);
			System.out.println("withdraw amount = "+amount);
			System.out.println("current balance = "+super.getBalance());
		}
		else {
			System.out.println("limit exceeded");
		}
	}
	
}

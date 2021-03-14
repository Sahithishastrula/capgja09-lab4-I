package Lab4Ex1;

public class Account {
	private long accno;
	private double balance;
	private Person person;
	public Account(long accno, double balance, Person person) {
		super();
		if(balance>500) {
			this.accno = accno;
			this.balance = balance;
			this.person = person;
		}
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Account [ AccountNumber = "+this.accno+" Blance = "+this.balance+" Person = "+this.person+"]";
	}
	public void deposit(double amount) {
		this.balance+=amount;
		System.out.println("Deposited amount is:"+amount);
		System.out.println("Current Balance is:"+this.balance);
	}
	public void withdraw(double amount) {
		this.balance-=amount;
		System.out.println("Withdraw amount is:"+amount);
		System.out.println("Current BAlance is :"+this.balance);
	}
	
}

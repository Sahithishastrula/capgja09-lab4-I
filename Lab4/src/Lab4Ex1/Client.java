package Lab4Ex1;
import java.util.*;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		Person p1 = new Person("Smith", 0);
		long acc1=Math.abs(r.nextLong());
		SavingsAccount sa1 = new SavingsAccount(acc1, 2000, p1);
		System.out.println(sa1);
		sa1.deposit(2000);
		double bal = sa1.getBalance();
		System.out.println("The final balance is " + bal);


		Person p2 = new Person("Kathy", 0);
		long acc2=Math.abs(r.nextLong());
		CurrentAccount ca1 = new CurrentAccount(acc2,3000,p2);
		System.out.println(ca1);
		ca1.withdraw(2000);
		double bal2 = ca1.getBalance();
		System.out.println("The final balance is " + bal2);

	}

}


public class Exercise9_07 {

	public static void main(String[] args) {
		Account bank = new Account(1122, 20000);
		bank.setInRate(4.5);
		bank.withdraw(2500);
		bank.deposit(3000);
		System.out.println("Ballance: " + bank.getBallance()
				+"\nMonthly Intrest: " + bank.getMonthlyIntrest()
				+"\nDate Created: " + bank.getDate());

	}

}

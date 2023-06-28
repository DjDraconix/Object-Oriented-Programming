
public class Exercise11_03 {

	public static void main(String[] args) {
		CheckingAccount check = new CheckingAccount(509, 1200.0, 50);
		SavingsAccount save = new SavingsAccount(509, 1700.0);
		
		System.out.println(check.toString());
		System.out.println();
		System.out.println(save.toString());

	}

}

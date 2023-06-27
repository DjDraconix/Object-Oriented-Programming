import java.util.Scanner;
public class Exercise10_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Account[] user = new Account[10];
		for(int i = 0; i < 10; i++) {
			user[i] = new Account(0, 100.0);
		}
		System.out.print("Enter an id: ");
		int account = in.nextInt();
		int input = 0;
		while (input != 4) {
			System.out.println("Main Menu\n1: check ballance\n2: wihdraw\n3: deposit\n4: exit");
			System.out.print("Enter a choice: ");
			input = in.nextInt();
			double money = 0.0;
			switch (input) {
			case 1: System.out.println("The ballance is " + user[account].getBallance()); 
				break;
			case 2: System.out.print("Enter an ammount to withdraw: ");
			money = in.nextDouble();
			user[account].withdraw(money);
				break;
			case 3:  System.out.print("Enter an ammount to deposite: ");
			money = in.nextDouble();
			user[account].deposit(money);
				break;
			case 4: System.out.println("Thanks for visiting");
				break;
			default: System.out.println("Entry not accepted please try again"); 
				break;
			}
		}
		in.close();
	}
}

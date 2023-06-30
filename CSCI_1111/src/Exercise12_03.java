import java.util.Scanner;
public class Exercise12_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] list = new int[100];
		for (int i = 0; i < 100; i++) {
			list[i] = (int) (Math.random() * 100);
		}
		
		System.out.print("Enter the index for a randome number 0 - 99: ");
		int user = in.nextInt();
		
		if (user >= 0 && user < 100) {
			System.out.println(list[user]);
		} else {
			System.out.println("Out of Bounds");
		}
		in.close();
	}

}

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_15 {

	public static void main(String[] args) throws IOException {
		
		File ex15 = new File("Exercise12_15.txt");
		ex15.createNewFile();
		if (ex15.exists()) {
			System.out.println("Is there");
		} else {
			System.out.println("Failed to find");
			System.exit(0);
		}
		
		Scanner in = new Scanner(new File("Exercise12_15.txt"));
		PrintWriter fout = new PrintWriter("Exercise12_15.txt");
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 100);
			System.out.print(num + " ");
			fout.write(num + " ");
		}
		System.out.println();
		int counter = 0;
		while (in.hasNext()) {
			counter++;
		}
		System.out.println(counter);
		
		
		
		fout.close();
		in.close();
	}

}

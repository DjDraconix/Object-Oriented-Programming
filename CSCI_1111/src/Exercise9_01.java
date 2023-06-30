import java.util.Scanner;

public class Exercise9_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			System.out.print("Enter how wide and how high a rectangle are: ");
			double a = in.nextDouble();
			double b = in.nextDouble();
			Rectangle first = new Rectangle(a ,b);
			double areaF = first.getArea();
			double perF = first.getPerimeter();
			System.out.println("Width: " + a 
					+"\nHeight: " + b
					+"\nArea: " + areaF
					+"\nPerimeter: " + perF);
		}
		
		in.close();

	}

}

import java.util.Scanner;

public class Exercise11_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the three side lengths of a triangle: ");
		double s1 = in.nextDouble();
		double s2 = in.nextDouble();
		double s3 = in.nextDouble();
		System.out.print("Enter the color of the triangle: ");
		String color = in.next();
		System.out.print("Is the triangle filled true/false: ");
		boolean filled = in.nextBoolean();

		Triangle user = new Triangle(s1, s2, s3, "", false);
		user.setColor(color);
		user.setFilled(filled);
		
		System.out.println("Area: " + user.getArea()
				+"\nPerimeter: " + user.getPerimeter()
				+"\nColor: " + user.getColor()
				+"\nDate Created: " + user.getDateCreated()
				+"\nFilled: " + user.isFilled());

		in.close();
	}
}

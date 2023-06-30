import java.util.Scanner;

public class Exercise13_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the sides of a triangle: ");
		double s1 = in.nextDouble();
		double s2 = in.nextDouble();
		double s3 = in.nextDouble();
		System.out.print("Enter the color of the triangle: ");
		String color = in.next();
		System.out.print("Is it filled true or false: ");
		boolean filled = in.nextBoolean();
		
		GeometricObject user = new Triangle(s1, s2, s3, color, filled);
		
		System.out.println("The area is: " + user.getArea() + "\nThe perimeter is: " 
		+ user.getPerimeter() + "\nThe color is: " + user.getColor() 
		+ "\nIs it filled: " + user.isFilled());
		
		in.close();
	}

}

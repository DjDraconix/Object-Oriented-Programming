
public class Execrise13_07 {

	public static void main(String[] args) {
		GeometricObject[] user = new Triangle[5];
		for (int i = 0; i < 5; i++ ) {
			user[i] = new Triangle(i+3, i+4, i+5, "Red", true);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Area: " + user[i].getArea()
					+ "\nHow to color: " + user[i].howToColor());
		}

	}

}

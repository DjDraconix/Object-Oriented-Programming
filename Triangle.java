
public class Triangle extends GeometricObject implements Colorable {
	double side1 = 1;
	double side2 = 1;
	double side3 = 1;
	Triangle() {
	}

	Triangle(double s1, double s2, double s3, String color, boolean filled) {
		super(color, filled);
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide1(double s1) {
		side1 = s1;
	}

	public void setSide2(double s2) {
		side2 = s2;
	}

	public void setSide3(double s3) {
		side3 = s3;
	}
	@Override
	public double getArea() {
		double s = (side1 + side2 + side3) / 2.0;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		area = Math.round(area * 100) / 100.0;
		return area;
	}
	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	@Override
	public String howToColor() {
		return "Color all three sides";
	}
}

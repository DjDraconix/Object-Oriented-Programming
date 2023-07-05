import java.lang.Cloneable;

public class Octagon extends GeometricObject implements Comparable<Object>, Cloneable{
	double side = 1;
	Octagon(double s1, String color, boolean filled) {
		super(color, filled);
		side = s1;
	}
	
	@Override
	public double getPerimeter() {
		return (side * 8);
	}
	
	@Override
	public double getArea() {
		double area = (2 + (2 / Math.sqrt(4)) * side * side);
		return area;
	}
	
	public int compareTo(Octagon arg0) {
		if (getArea() > arg0.getArea()){
			return 1;
		} else if (getArea() < arg0.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public int compareTo(Object o) {
		if (toString().equals(o.toString())) {
			return 0;
		} else {
		return 1;
		}
	}

	@Override
	public String toString() {
		return "Created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled
				+ "\nSide length: " + side + "\nArea: " + getArea() + " and Perimeter: " + getPerimeter();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String howToColor() {
		// TODO Auto-generated method stub
		return "Color each side";
	}

}

import java.lang.Cloneable;

public class Octagon extends GeometricObject implements Comparable{
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
		// TODO Auto-generated method stub
		return 0;
	}

	

}

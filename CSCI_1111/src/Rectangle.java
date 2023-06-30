
public class Rectangle {
	double width = 1;
	double height = 1;

	public Rectangle(double a, double b) {
		width = a;
		height = b;		
	}

	double getArea(){
		double area = width * height * 1.00;
		area = Math.round(area * 100) / 100.0;
		return area;
	}
	
	double getPerimeter() {
		double per = width * 2.0 + height * 2.0;
		return per;
	}
}

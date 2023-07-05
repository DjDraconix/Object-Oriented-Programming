import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public abstract class GeometricObject {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
	LocalDateTime now = LocalDateTime.now();
	
	String color = null;
	boolean filled = false;
	String dateCreated = dtf.format(now);
	
	GeometricObject(){
		
	}
	
	GeometricObject(String newColor, boolean newFilled) {
		color = newColor;
		filled = newFilled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean newFilled) {
		filled = newFilled;
	}
	
	public String getDateCreated() {
		return dateCreated;
	}
	
	public abstract String toString();
	
	public abstract double getPerimeter();
	
	public abstract double getArea();

	public abstract String howToColor();
}

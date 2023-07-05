
public class Exercise13_11 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon user = new Octagon(7, "Red", true);
		Octagon clone = (Octagon)user.clone();
		
		System.out.println(user.compareTo(clone));

	}

}

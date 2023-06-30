
public class SavingsAccount extends Account {
	double minimumBallance = 0.0;

	SavingsAccount(int newId, double newBallance) {
		super(newId, newBallance);
	}
	
	public void withdrawFromSavigs(double amount) {
		if (getBallance() - amount > 0) {
			setBallance(getBallance() - amount);
		} else {
			System.out.println("This account dose not allow overdrafting."
					+ "\nYou have " + getBallance() + " left in your account.");
		}
	}
	
	public void depositInSavings(double amount) {
		setBallance(getBallance() + amount);
	}
	
	public String toString() {
		return "Acount Id: " + getId() + "\nDate Created: " + getDate() + 
				"\nBallance: " + getBallance();
	}
}

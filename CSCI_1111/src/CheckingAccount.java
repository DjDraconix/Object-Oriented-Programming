
public class CheckingAccount extends Account {
	double overdraft = 50.0;
	
	CheckingAccount(int newId, double newBallance, double over) {
		super(newId, newBallance);
		overdraft = over;
	}
	
	public void withdrawFromChecking(double amount) {
		if (getBallance() - amount > 0) {
			setBallance(getBallance() - amount);
		} else if (Math.abs(getBallance() - amount) < overdraft) {
			setBallance(getBallance()-amount);
		} else {
			System.out.println("Not enuff funds, overdraft is at " + overdraft);
		}
	}
	
	public void depositInChecking(double amount) {
		setBallance(getBallance() + amount);
	}
	
	public String toString() {
		return "Acount Id: " + getId() + "\nDate Created: " + getDate() + 
				"\nBallance: " + getBallance() + "\nOverdraft Alowance: " + overdraft;
	}
}

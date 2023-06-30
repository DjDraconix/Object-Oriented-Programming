import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class Account {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
	LocalDateTime now = LocalDateTime.now();
	private int id = 0;
	private double ballance = 0;
	private double annualIntrestRate = 0;
	private String dateCreated = dtf.format(now);
	
	Account(int newId, double newBallance){
		id = newId;
		ballance = newBallance;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public double getBallance() {
		return ballance;
	}
	
	public void setBallance(double newBallance) {
		ballance = newBallance;
	}
	
	public double getInRate() {
		return annualIntrestRate;
	}
	
	public void setInRate(double newInRate) {
		annualIntrestRate = newInRate;
	}
	
	public String getDate() {
		return dateCreated;
	}
	
	public double getMonthlyIntrestRate() {
		double mInRate = (annualIntrestRate / 100.0) / 12.0;
		return mInRate;
	}
	
	public double getMonthlyIntrest() {
		double mInRate = getMonthlyIntrestRate();
		double monthlyIn = ballance * mInRate;
		monthlyIn = Math.round(monthlyIn * 100) / 100.0;
		return monthlyIn;
	}
	
	public void withdraw(double amount) {
		ballance = ballance - amount;
	}
	
	public void deposit(double amount) {
		ballance = ballance + amount;
	}
}

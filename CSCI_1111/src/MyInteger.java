
public class MyInteger {
	int value = 0;
	MyInteger(int newValue){
		value = newValue;
	}
	
	public int getMyInteger() {
		return value;
	}
	
	public boolean isEven() {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isOdd() {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isPrime() {
		boolean prime = true;
		for (int i = 2; i <= value / 2; ++i) {
			if (value % i == 0) {
				prime = false;
			}
		}
		return prime;
	}
	
	public static boolean isEven(int newValue) {
		if (newValue % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isOdd(int newValue) {
		if (newValue % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isPrime(int newValue) {
		boolean prime = true;
		for (int i = 2; i <= newValue / 2; ++i) {
			if (newValue % i == 0) {
				prime = false;
			}
		}
		return prime;
	}
	
	public static boolean isEven(MyInteger newValue) {
		return newValue.isEven();
	}
	
	public static boolean isOdd(MyInteger newValue) {
		return newValue.isOdd();
	}
	
	public static boolean isPrime(MyInteger newValue) {
		return newValue.isPrime();
	}
	
	public boolean equals(int newValue) {
		if (newValue == value) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean equals(MyInteger newValue) {
		if (newValue.value == value) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int parseInt(char[] newChar) {
		int hold = 0;
		for (char i : newChar) {
			hold += Character.getNumericValue(i);
		}
		return hold;
	}
	
	public static int parseInt(String newString) {
		char[] newChar = new char[newString.length()];
		for (int i = 0; i < newString.length(); i++) {
			newChar[i] = newString.charAt(i);
		}
		int hold = parseInt(newChar);
		return hold;
	}
}

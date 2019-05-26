package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double a, double b) throws IllegalArgumentException{
		if (b == 0.0) {
			throw new IllegalArgumentException();
		}
		return a/b;
	}
	public String reverseString(String s) throws IllegalStateException{
		if (s.length() == 0) {
			throw new IllegalStateException();
		}
		String returnString = "";
		for (int i = s.length(); i >= 0; i--) {
			returnString += Character.toString(s.charAt(i));
		}
		return returnString;
	}
}

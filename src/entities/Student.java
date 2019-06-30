package entities;

public class Student {
	public String name;
	public double firstTrimester;
	public double secondTrimester;
	public double thirdTrimester;
	public double minimun = 60.00;
	
	public double finalGrade() {
		double total = firstTrimester + secondTrimester + thirdTrimester;
		return total;
	}
	public double result() {
		return finalGrade() - minimun;
	}
}

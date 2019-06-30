package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary*percentage/100;
	}
	public String toString() {
		return name+", $ "+String.format("%.2f", netSalary());
	}
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.grossSalary = 6000.00;
		employee.tax = 1000.00;
		employee.increaseSalary(10.00);
		System.out.println(employee.netSalary());
	}
}

package application;

import java.util.Scanner;

import entities.CurrencyConverter;
import entities.Employee;
import entities.Rectangle;
import entities.Student;

public class exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("(Rectangle) 	Enter #1:%n"
						+ "(Employee) 	Enter #2:%n"
						+ "(Student)	Enter #3:%n"
						+ "(Dolar conv)	Enter #4:%n");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			rectangle(sc);
			break;
		case 2:
			employee(sc);
			break;
		case 3:
			student(sc);
			break;
		case 4:
			dolar(sc);
		}
	}

	public static void dolar(Scanner sc) {
		System.out.print("What is the dollar price?");
		CurrencyConverter.price = sc.nextDouble();
		System.out.print("How many dollars will be bought?");
		double quantity = sc.nextDouble();
		System.out.printf("Ammount to be paid in Reais = %.2f%n", CurrencyConverter.cost(quantity));
		System.out.println();
	}
	public static void employee(Scanner sc) {
		//Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		sc.nextLine();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		System.out.println("Employee: " + employee);
		System.out.println();
	}
	public static void rectangle(Scanner sc) {
		//Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
	}
	public static void student(Scanner sc) {
		//Scanner sc = new Scanner(System.in);
		Student student = new Student();
		student.name = sc.nextLine();
		sc.nextLine();
		student.firstTrimester = sc.nextDouble();
		student.secondTrimester = sc.nextDouble();
		student.thirdTrimester = sc.nextDouble();
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		if(student.result()>0) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS",student.result()*-1);
		}
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		double num1 = input.nextDouble();
		input = new Scanner(System.in);
		System.out.println("Enter Number 2: ");
		double num2 = input.nextDouble();
		Calculator cal = new Calculator();
		System.out.println(("Additon: " + cal.add(num1, num2) + 
				"  Subtraction: " + cal.subtract(num1, num2)));
	}

}

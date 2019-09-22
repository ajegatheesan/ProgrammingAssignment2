import java.util.Scanner;

public class bmi {

	public static void main(String[] args) {

		double kilograms, meters, inches, pounds, choice, BMI;
		System.out.println("BMI Categories:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("BMI of 30 or greater\n\n");
		
		System.out.println("Which formula would you like to use? 0 = standard, 1 = metric.");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextDouble();
		while ( choice < 0 || choice > 1)
		{
			System.out.println("You did not enter a 0 or a 1. Try again");
			choice = sc.nextDouble();
		}
		
		if (choice == 0)
		{
			System.out.println("What is your weight in pounds?");
			Scanner scc = new Scanner(System.in);
			pounds = scc.nextDouble();
			
			System.out.println("What is your height in inches?");
			Scanner height = new Scanner(System.in);
			inches = height.nextDouble();
			
			BMI = ((703*pounds)/((inches*inches)));
			System.out.printf("Your BMI is %.2f", BMI);
		}
		
		if (choice == 1)
		{
			System.out.println("What is your weight in kilograms?");
			Scanner scc = new Scanner(System.in);
			kilograms = scc.nextDouble();
			
			System.out.println("What is your height in meters?");
			Scanner height = new Scanner(System.in);
			meters = height.nextDouble();
			
			BMI = ((kilograms)/((meters*meters)));
			System.out.printf("Your BMI is %.2f", BMI);
			
		}
		
		
	}

}
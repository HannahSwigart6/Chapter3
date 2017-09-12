package tutorial;
import java.util.Scanner;
public class AddingInput {
	


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		double salary;
		double StartingWage;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your salary >>");
		salary = input.nextDouble();
		
		System.out.println("Enter your starting wage >>");
		StartingWage  = input.nextDouble();
		predictRaise(StartingWage)
		predictRaise(salary);
		
		
		
	}
	private static void predictRaise(double salary)
	{
		// TODO Auto-generated method stub
		double newSalary;
		final double Raise_Rate=1.10;
		
		newSalary = salary * Raise_Rate;
		System.out.println("Current salary: "+salary+ "    After raise: " +newSalary+ ".");
	}

}

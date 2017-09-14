package excercises;
import java.util.Scanner;
public class NumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NumberOne, NumberTwo;
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter in a number >>");
		NumberOne = input.nextInt();
		
		System.out.println("Enter in another number >>");
		NumberTwo = input.nextInt();
		
		displayTwiceTheNumber(NumberOne, NumberTwo);
		displayNumberplusFive(NumberOne, NumberTwo);
		//displayNumberSquared(NumberOne, NumberTwo);
	}

	public static void displayTwiceTheNumber(int x, int y)
	{
		int NumberOne, NumberTwo;
		
		
		NumberOne = x * 2;
		NumberTwo = y * 2;
	
		System.out.println(NumberOne);
		System.out.println(NumberTwo);
	}
	public static void displayNumberplusFive(int x, int y)
	{
		int NumberOne, NumberTwo;
		
		NumberOne = x +5;
		NumberTwo = y +5;
		
		System.out.println(NumberOne);
		System.out.println(NumberTwo);
		
	}
	public static void displayNumberSquared()
	{
		int NumberTwo, NumberOne;
		int i = 2;
		int square = (int) Math.pow(i, 2);
		
		NumberOne = square;
		NumberTwo = square;
	}
}

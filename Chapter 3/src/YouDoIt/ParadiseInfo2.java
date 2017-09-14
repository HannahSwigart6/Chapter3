package YouDoIt;
import java.util.Scanner;
public class ParadiseInfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double price, discount, savings;
Scanner keyboard = new Scanner(System.in);

System.out.print("Enter cutoff price for discount >>");
price = keyboard.nextDouble();

System.out.print("Enter discount rate as a whole number >>");
discount = keyboard.nextDouble();

savings = computerDiscountInfo(price, discount);
	}

	private static double computerDiscountInfo(double price, double discount) {
		// TODO Auto-generated method stub
		return 0;
	}

}

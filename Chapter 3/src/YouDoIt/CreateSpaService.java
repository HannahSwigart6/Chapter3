package YouDoIt;
import java.util.Scanner;
public class CreateSpaService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		firstService = getData(firstService);
		secondService = getData(secondService);
		
		System.out.println("First service details:");
		System.out.println(firstService.getServiceDescription() + " $" +
		firstService.getPrice());
		
		System.out.println("Second service details:");
		System.out.println(secondService.getServiceDescription() + " $" +
		secondService.getPrice());
		}
public static SpaService getData(SpaService s)
	{
		String service;
		double price;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter service >>");
		service = keyboard.nextLine();
		
		System.out.print("");
	}
}

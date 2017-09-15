package tutorial;

public class SpaService {
	private static  String serviceDescription;
	private double Price;
	
	 public static void main(String[] args)
	 {
		 
	 }
	public  void setServiceDescription(String service) {
		// TODO Auto-generated method stub
		serviceDescription = service;
	}
	public void setPrice(double pr) 
	{
	Price = pr;
	}
	public String getServiceDescription() 
	{
	return  serviceDescription;	
	}
public double getPrice()
{
	return Price;
}
}

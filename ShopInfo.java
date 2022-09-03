import java.util.Scanner;

public class ShopInfo {

	public Customer create()
	{
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Customer Id ");
		int custId=sc.nextInt();
		System.out.println("Enter customer name :");
		String custName =sc.next();
		System.out.println("Enter Customer mobNo :");
		String mobNo=sc.next();

		System.out.println("Enter city :");
		String city=sc.next();
		System.out.println("Enter State :");
		String state =sc.next();
		System.out.println("Enter pincode :");
		int pincode=sc.nextInt();

		System.out.println("Enter product Id :");
		int prodId=sc.nextInt();
		System.out.println("Enter product name :");
		String prodName=sc.next();
		System.out.println("Enter product Price :");
		double prodPrice=sc.nextDouble();
		System.out.println("Enter product Qty:");
		int prodQty=sc.nextInt();

		Product prod=new Product(prodId, prodName, prodPrice, prodQty);
		Address addr=new Address(city, state, pincode);
		Customer cust=new Customer(custId, custName, mobNo, prod, addr);
		return cust;
		
	}
	public static void display(Customer cust)
	{
		System.out.println("-------------------------CUSTOMER DETAILS-------------------");
		System.out.println("Customer Id :"+cust.getCustId());
		System.out.println("Customer Name :"+cust.getCustName());
		System.out.println("Customer mobNo :"+cust.getMobNo());
		System.out.println("-------------------------ADDRESS DETAILS--------------------");
		System.out.println("City :"+cust.getAddr().getCity());
		System.out.println("State :"+cust.getAddr().getState());
		System.out.println("Pincode :"+cust.getAddr().getPincode());
		System.out.println("-------------------------PRODUCT DETAILS-------------------");
		System.out.println("Product Id :"+cust.getProd().getProdId());
		System.out.println("Product Name :"+cust.getProd().getProdName());
		System.out.println("Product Price :"+cust.getProd().getProdPrice());
		System.out.println("Product Qty:"+cust.getProd().getProdQty());
		System.out.println("-------------------------THANK YOU--------------------------");
	}
}

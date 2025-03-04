import java.util.Scanner;
public class Finalprice{
	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter the unit price of the item:");
		double unitprice= scanner.nextDouble();
		System.out.print("Enter the quantity required:");
		int quantity= scanner.nextInt();
		double totalprice = unitprice * quantity;
		System.out.println("The total price of the items are:"+totalprice);
		scanner.close();
	}
}
import java.util.Scanner;
public class SimpleIntrest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principal amount =");//Taking Principal input
		double Principal = sc.nextDouble();
		System.out.print("Enter the Rate =");//Taking rate input
		double Rate = sc.nextDouble();
		System.out.print("Enter the Time =");//Taking time input
		double Time = sc.nextDouble();
		double SimpleIntrest = Principal*Rate*Time;//calculating the Simple Intrest
		SimpleIntrest = SimpleIntrest/100;
		System.out.println("The Simple Intrest amount is ="+SimpleIntrest);//Printing the Output
		sc.close();
	}
}
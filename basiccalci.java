import java.util.Scanner;
public class basiccalci{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number:");
		int number1 = scanner.nextInt();
		System.out.print("Enter second number:");
		int number2 = scanner.nextInt();
		int sum = number1+number2;
		int product= number1*number2;
		int subtraction= number1-number2;
		int divide= number1/number2;
		System.out.println("The sum is "+sum+", product is "+product+",subtraction is"+subtraction+",division is"+divide+".");
		scanner.close();
	}
}

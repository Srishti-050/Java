import java.util.Scanner;
public class Swapnumbers{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number =");
		double number1 = scanner.nextDouble();
		System.out.print("Enter second number =");
		double number2 = scanner.nextDouble();
		double number3 = number1;
		number1 = number2;
		number2 = number3;
		System.out.println("the swaped number now is , first number ="+number1+" and second number ="+number2);
		scanner.close();
	}
}
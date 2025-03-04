import java.util.Scanner;
public class quotientandremainder{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number:");
		double number1=scanner.nextDouble();
		System.out.print("Enter the second number:");
		double number2=scanner.nextDouble();
		double quotient=number1%number2;
		double remainder=number1/number2;
		System.out.println("The quotient is ="+quotient+"and the remainder is ="+remainder);
		scanner.close();
	}
}
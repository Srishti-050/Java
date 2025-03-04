import java.util.Scanner;
public class Doubleoperations{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number:");
		double a=scanner.nextDouble();
		System.out.print("Enter second number:");
		double b=scanner.nextDouble();
		System.out.print("Enter third number:");
		double c=scanner.nextDouble();
		double op1=a + b *c;
		double op2=a * b + c;
		double op3=c + a / b;
		double op4=a % b + c;
		System.out.println("The operation1 = "+op1+" operation2 ="+op2+" operation3 = "+op3+" operation4 = "+op4);
		scanner.close();
	}
}
		
		
		
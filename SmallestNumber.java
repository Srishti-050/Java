import java.util.Scanner;
public class SmallestNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any 3 numbers");//taking input from the user
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		if (number1 < number2 && number1 < number3){//comparing values for each case
			System.out.print("Is the first number smallest number is = Yes");//printing the output
		}else if ( number2 < number1 && number2 < number3){
			System.out.print("Is the first number smallest number is = No");
		}else if (number3 < number1 && number3 < number2){
			System.out.print("Is the first number smallest number is = No");
		}
		sc.close();
	}
}

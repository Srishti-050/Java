import java.util.Scanner;
public class LargestNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any 3 numbers : ");//taking inputs from the user
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		if (number1 > number2 && number1 > number3){//checking if the condition in all cases
			System.out.println("Is the first number the largest ? Yes");//printing all the results
			System.out.println("Is the second number the largest? No");
			System.out.println("Is the third number the largest? No");
		}else if (number2 > number1 && number2 > number3){
			System.out.println("Is the first number the largest ? No");
			System.out.println("Is the second number the largest? Yes");
			System.out.println("Is the third number the largest? No");
		}else if (number3 > number1 && number3 > number2){
			System.out.println("Is the first number the largest ? No");
			System.out.println("Is the second number the largest? No");
			System.out.println("Is the third number the largest? Yes");
		}
		sc.close();
	}
}

			
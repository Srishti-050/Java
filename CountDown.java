import java.util.Scanner;
public class CountDown{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number for countdown =");//taking input from user
		int number1 = sc.nextInt();
		while (true) {//loop to print the countdown
			System.out.println(number1);
			number1--;
			if (number1 == 0 ){
				break;//breaking the loop when it reaches 0
			}
		}
		sc.close();
	}
}
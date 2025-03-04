import java.util.Scanner;
public class CheckNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");//Taking input from the user
		int number1 = sc.nextInt();
		if (number1<0){//checking if the number is positive/negative/zero
			System.out.println("The number is negative");//printing all positive outputs
		}else if ( number1==0){
			System.out.println("The number is zero");
		}else{
			System.out.println("The number is positive");
		}
		sc.close();
	}
}
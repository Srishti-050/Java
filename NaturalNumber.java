import java.util.Scanner;
public class NaturalNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number:");//Taking input from user
		int number1 = sc.nextInt();
		if (number1!= 0 ){//cheching if the number is natural
			number1 = number1 * (number1+1)/2;//using the formula to add all the natural numbers
			System.out.println("The sum of all the natural numbers are ="+number1);//printing the result
		}else{
			System.out.print("Enter a natural number");//if the user enters 0
		}
		sc.close();
	}
}
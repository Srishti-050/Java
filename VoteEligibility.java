import java.util.Scanner;
public class VoteEligibility{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age:");
		int age = sc.nextInt();//take age as input
		if (age >= 18){//checking if the user is eligible to code
			System.out.println("Your age is " +age+ "hence you are eligible for voting");
		}
		else{//printing all possible results
			System.out.println("Your age is " +age+ "you are too young to vote");
		}
		sc.close();
	}
}
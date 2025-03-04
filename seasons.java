import java.util.Scanner;
public class seasons{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the month and date:");//Taking month and date as input
		int month = sc.nextInt();
		int date = sc.nextInt();
		if (month>=3 && month<=6){
			if (date>=1 && date<31){
				//Checking the conditions
				System.out.print("It is Spring season");//Printing the results
			}
		}else if(month<=2 && month>0 && month<=12){
			if (date>=1 && date<31){
				//Checking the conditions
				System.out.print("It is not Spring season");//Printing the results
			}
		}
		sc.close();
	}
}
import java.util.Scanner;
public class Salary{
	public static void main(String [] args){
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter the Salary:");
		double salary= scanner.nextDouble();
		System.out.print("Enter the Bonus");
		double bonus= scanner.nextDouble();
		double totalsalary = salary + bonus;
		System.out.println("Your salary = "+salary+"and you bonus="+bonus+",hence your totalsalary = "+totalsalary);
		scanner.close();
	}
}
		
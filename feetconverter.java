import java.util.Scanner;
public class feetconverter{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the distance in feets:");
		int distance=scanner.nextInt();
		double yard = distance/3;
		double miles = distance/5280;
		System.out.println("The distance in yards is = "+yard+"and in miles = "+miles);
		scanner.close();
	}
}
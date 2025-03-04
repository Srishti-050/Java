import java.util.Scanner;
public class squareside{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Perimeter of the Square:");
		int square = scanner.nextInt();
		double side=square/4;
		System.out.println("The side of the Square is = "+side+".");
		scanner.close();
	}
}
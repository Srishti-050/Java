import java.util.Scanner;
public class TriangularPark{
	public static void main( String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter all the sides of the Trinagular park:");
		int side1= sc.nextInt();
		int side2= sc.nextInt();
		int side3= sc.nextInt();
		int triangle= side1+side2+side3;
		int atheletrun= triangle/5;
		System.out.println("Number of line the athelet needs to run = "+atheletrun+"rounds in total");
		sc.close();
	}
}
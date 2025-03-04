import java.util.Scanner;
public class Areaoftriangle{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Base of Triangle:");
		int base = scanner.nextInt();
		System.out.print("Enter the Height of Triangle:");
		int height = scanner.nextInt();
		double pro=base*height;
		double area=0.5*pro;
		double feet=area/30.5;
		double inches=area*0.4;
		System.out.println("Area of triangle in cm-"+area+",in feets-"+feet+",in inches-"+inches+".");
		scanner.close();
	}
}
		
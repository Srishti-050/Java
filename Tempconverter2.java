import java.util.Scanner;
public class Tempconverter2{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit:");
		double fahrenheit=scanner.nextDouble();
		double celcius = fahrenheit-32;
		celcius=celcius*0.6;
		System.out.println("The celcius is ="+celcius+"C");
		scanner.close();
	}
}
		
		
		
		
		
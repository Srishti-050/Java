import java.util.Scanner;
public class tempconverter{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the temperature in celsius:");//Taking input from the user
		double celsius = scanner.nextDouble();
		double Farenheitresult = celsius*1.8 + 32;//converting celsius to Farenheit
		System.out.println("The temperature in Farenheit is = "+Farenheitresult+"F");//printing the result
		scanner.close();
	}
}
		
		
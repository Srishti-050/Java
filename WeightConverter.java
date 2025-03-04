import java.util.Scanner;
public class WeightConverter{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the the weight in pounds =");
		double weight = sc.nextDouble();
		double weight2=weight*2.2;
		System.out.println("The weight in pounds ="+weight+"pounds ,now weight in kilograms"+weight2+"Kg");
		sc.close();
	}
}
import java.util.Scanner;
public class TravelComputation{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = sc.next();
		System.out.print("Enter from city:");
		String fromcity = sc.next();
		System.out.print("Enter Via city :");
		String viacity = sc.next();
		System.out.print("Enter the distance to travel fromcity to viacity and also enter time taken=");
		double distance1 = sc.nextDouble();
		double time1 = sc.nextDouble();
		System.out.print("Enter Final city :");
		String finalcity = sc.next();
		System.out.print("Enter the distance to travel Viacity to Finalcity and also enter time taken=");
		double distance2 = sc.nextDouble();
		double time2 = sc.nextDouble();
		double totaltime = time1+time2;
		double totaldistance = distance1+distance2;
		System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromcity + " to " + finalcity + " via " + viacity +
                         " is " + totaldistance + " km and " +
                         "the Total Time taken is " + totaltime + " minutes");
		sc.close();
	}
}

		
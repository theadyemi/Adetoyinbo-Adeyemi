import java.util.Scanner;
public class Acceleration{

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter starting Velocity");
		int startingVel = userInput.nextInt();
		
		System.out.println("Enter ending Velocity");
		int endingVel = userInput.nextInt();
		
		System.out.println("Enter time span");
		int timeSpan = userInput.nextInt();		

		System.out.println("Average Acceleration is "+ startingVel + " - "+ endingVel +" = "+ (startingVel - endingVel)  +" / "+ timeSpan +" = " + ((startingVel - endingVel) / timeSpan));

		
	}





}
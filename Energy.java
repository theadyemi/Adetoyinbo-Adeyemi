import java.util.Scanner;
public class Energy{

	public static void main(String[] args){

	Scanner userInput = new Scanner(System.in);
	System.out.println("Enter the amount of water in kilograms");
	double amountWater = userInput.nextDouble();

	System.out.println("Enter the initial temperature");
	double initialTemperature = userInput.nextDouble();

	System.out.println("Enter the final temperature");
	double finalTemperature = userInput.nextDouble();

	double finalTemp = amountWater * (finalTemperature - initialTemperature) * 4184;
	
	System.out.println(finalTemp);

	}



}
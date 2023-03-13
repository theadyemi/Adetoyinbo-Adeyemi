import java.util.Scanner;
public class CostOfTrip{

	public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);
	System.out.println("Enter the driving distance");
	int drivingDistance = userInput.nextInt();

	System.out.println("Enter miles per gallon");
	int milesPerGallon = userInput.nextInt();

	System.out.println("Enter price per gallon");
	int pricePerGallon = userInput.nextInt();

	int drivingCost = ((drivingDistance / milesPerGallon)*pricePerGallon);
	System.out.println("$" + drivingCost);
	System.out.println("Cost of driving is "+ drivingDistance +" Divided by "+ milesPerGallon +" Multiplieid by "+ pricePerGallon +" = $"+ drivingCost);



	}









}
import java.util.Scanner;
public class FeetToMeters{

	public static void main(String[] args){

		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a value for feet");
		double feet = userInput.nextDouble();

		double conversion = feet * 0.305;
		System.out.println("Your Conversion of "+ feet +" Feet to Meters is "+ conversion);



	}






}
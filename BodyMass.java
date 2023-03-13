import java.util.Scanner;
public class BodyMass{

	public static void main(String[] args) {

	Scanner userInput = new Scanner(System.in);

	System.out.println("Enter Weight(lb)");
	double weight = userInput.nextInt();
	
	System.out.println("Enter Height(in)");
	double height = userInput.nextInt();
	
	
	double heightConv = 0.0254 * height;
	double heightSq = Math.pow(heightConv, 2);

	double weightConv = 0.45359237 * weight;

	
	System.out.println("Weight to Kg is "+ weightConv);
	System.out.println("Height to m is "+ heightConv);
	
	double BMI = weightConv / heightSq;
	System.out.println("Body Mass Index(BMI) is "+ weightConv +" divided by "+ heightSq +" = "+ BMI);
	}




}
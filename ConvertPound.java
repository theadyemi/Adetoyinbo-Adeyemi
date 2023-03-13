import java.util.Scanner;
public class ConvertPound{

	public static void main(String[] args) {

	Scanner userInput = new Scanner(System.in);

	System.out.println("Enter Weight(lb)");
	double pound = userInput.nextInt();	
		
	double poundConv = 0.45359237 * pound;
	System.out.println(poundConv + "kg");
	System.out.println(pound +" Pound to Kilogram(s) is "+ poundConv +"kg");	
	


	}




}
import java.util.Scanner;
public class Year{
	public static void main(String[] args){

	Scanner userInput = new Scanner(System.in);
	
	double minutesToYear = 60 * 24 * 365;
	System.out.println("Enter Minutes");
	double minutes = userInput.nextDouble();
	
	long years = (long) (minutes / minutesToYear);

	int days = (int) (minutes / 60 / 24) % 365;

	System.out.println((int) minutes +" Minutes is "+ years +" Years and "+ days +" days");
	}


}
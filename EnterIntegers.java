import java.util.Scanner;
public class EnterIntegers{

	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter First Integer");
		int firstInt = userInput.nextInt();
	
		System.out.println("Enter Second Integer");
		int secondInt = userInput.nextInt();
	
		int sqrFirst = firstInt * firstInt;
		int sqrSecond = secondInt * secondInt;
		System.out.println("Square of First Integer is "+ sqrFirst +" and Square of Second Integer is "+ sqrSecond);

		int sum = sqrFirst + sqrSecond;
		System.out.println("Sum of the Squares of First and Second Integers is "+ sum);
		int difference = sqrFirst - sqrSecond;
		System.out.println("Difference between Squares of First and Second Integers is "+ difference);



	}





}
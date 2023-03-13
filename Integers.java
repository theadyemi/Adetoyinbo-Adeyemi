import java.util.Scanner;
public class Integers{
	public static void main(String[] args){

	Scanner reader = new Scanner(System.in);

	
	System.out.println("Enter a number:");
	int integers = reader.nextInt();
	
	if(integers % 2 == 0){  
	System.out.println (integers +" is even");
	}
	else{
	System.out.println (integers +" is odd");
	}
	
	}








}
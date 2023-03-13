import java.util.Scanner;
public class AreaOfTriangle{

	public static void main(String[] args){

	double area;
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Enter Side1 point");
	int side1 = userInput.nextInt();

	System.out.println("Enter Side2 point");
	int side2 = userInput.nextInt();

	System.out.println("Enter Side3 point");
	int side3 = userInput.nextInt();
	int sum = ((side1 + side2 + side3)/2);
	System.out.println(sum);
	System.out.println("The sum of "+ side1 +" + "+ side2 +" + "+ side3 +" divided by 2 = "+ sum);

	area=Math.sqrt(sum*(sum - side1)*(sum - side2)*(sum - side3));
	System.out.println("Area of Triangle is "+ area);



	}


}
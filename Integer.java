public class Integer{  
public static void main(String[] args){  
	int numbers[]={70,35,3,7,2,6,9,15,30,5,6,};  
	System.out.println("Odd Numbers:");  
	for(int i=0;i<numbers.length;i++){  
	if(numbers[i]%2!=0){  
	System.out.println(numbers[i]);  
	}  
	}  
	//Create for Even numbers
	System.out.println("Even Numbers:");  
	for(int i=0;i<numbers.length;i++){  
	//Create for Odd numbers
	if(numbers[i]%2==0){  
	System.out.println(numbers[i]);  
	}  
	}  
}

} 
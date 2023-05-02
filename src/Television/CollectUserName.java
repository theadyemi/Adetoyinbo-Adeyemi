package Television;

import java.util.Scanner;

public class CollectUserName {
    private String collectName;
    public static void main(String[] args) {
        Scanner collectName = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = collectName.nextLine();

        Scanner collectLastName = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = collectLastName.nextLine();


        System.out.println("Dear "+ firstName + ", Thank you for Signing up to our page.");

    }
}

package Television;

import java.util.Scanner;

public class CollectName {
    private String collectName;
    public static void main(String[] args) {
        Scanner collectName = new Scanner(System.in);
        System.out.println("Enter Name");
        String firstName = collectName.nextLine();

        Scanner collectLastName = new Scanner(System.in);
        System.out.println("Enter Surname");
        String Surname = collectLastName.nextLine();


        System.out.println("Dear "+ Surname + ", Thank you for Signing up to our page.");

    }
}

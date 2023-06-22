package PhoneBook;

import java.util.Scanner;



public class Main {
    public static Scanner phoneBookInput = new Scanner(System.in);
    public static final PhoneBook phoneBookApp = new PhoneBook();
    public static void main(String[] args) { mainMenu();}

    private static void mainMenu() {

        Scanner phoneBookInput = new Scanner(System.in);
        System.out.println( """
                What would you like to do?
                
                Enter a corresponding Number to what you want...
                1. Create Contact
                2. Edit Contact
                3. Search Contact
                4. Delete Contact
                5. View all Contact
                6. Exit Application
                """);
        String userInput = phoneBookInput.nextLine();
        switch(userInput.charAt(0)){
            case '1' -> createContact();
            case '2' -> editContact();
            case '3' -> searchContact();
            case '4' -> deleteContact();
            case '5' -> viewAllContact();
            case '6' -> exitApplication();
            default -> mainMenu();
        }

    }

    private static void viewAllContact() {
        System.out.println("Contact List:::");
        System.out.println(String.valueOf(phoneBookApp.contactList()));
        mainMenu();

    }

    private static void createContact() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Enter your Telephone Number");
        String telephoneNumber = input.nextLine();
        System.out.println("Enter your Email Address");
        String email = input.nextLine();
        phoneBookApp.addContact(name, email, telephoneNumber);
        System.out.println("Contact already created for " + name);
        mainMenu();
    }
    private static void editContact() {
        String oldName = input("Please enter a name");
        String newName = input("Please Enter your Telephone Number");
        phoneBookApp.editContactName(oldName, newName);
        display("Number successfully Edited");

    }

    private static void searchContact() {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the contact name");
        String name = input.nextLine();
        System.out.println(phoneBookApp.searchContact(name));

    }

    private static void deleteContact() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter name of contact to be deleted");
        String name = input.nextLine();
        phoneBookApp.removeContact(name);
        System.out.println("Contact successfully deleted");
        mainMenu();

    }
    private static void exitApplication() {


    }

    public static String input(String prompt) {
        display(prompt);
        return phoneBookInput.nextLine();
    }

    public static String display(String message){
        return message;
    }

}


package NewAccount;
import javax.swing.*;
import java.math.BigDecimal;
import java.util.Scanner;

    public class Main {
        private static final Scanner keyboardInput = new Scanner(System.in);
        private static Bank bank = new Bank();
        public static void main(String[] args) {main();}


        private static void main(){
            Scanner userInput = new Scanner(System.in);
            System.out.println("""
                    1. Create Account
                    2. Deposit
                    3. Withdraw
                    4. Transfer
                    """);
            String userChoice = userInput.nextLine();
            switch (userChoice.charAt(0)){
                case '1' -> createNewAccount();
                case '2' -> deposit();
                case '3' -> withdraw();
                case '4' -> transfer();
                case '5' -> checkMyBalance();
                case '6' -> closeApplication();
            }
        }

        private static void withdraw() {

        }

        private static void transfer() {
        }

        private static void checkMyBalance() {
        }

        private static void closeApplication() {
        }

        private static void deposit() {
        }

        public static void createNewAccount(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your first name");
            String firstName = input.nextLine();
            System.out.println("Enter your Last name");
            String lastName = input.nextLine();
            System.out.println("Enter your Telephone Number: ");
            String phoneNum = input.nextLine();
            System.out.println("Enter your pin");
            String pin = input.nextLine();

            bank.createNewAccount(firstName, lastName, phoneNum, pin);
            System.out.println("Account Created Successfully");
            main();


        }


    }

//        private static void mainMenu(){
//            String menu = """
//                1. create account
//                2. deposit
//                3. withdraw
//                4. transfer
//                """;
//            String userChoice = input(menu);
//            switch (userChoice.charAt(0)){
//                case '1' -> createNewAccount();
//                case '2' -> deposit();
//                case '3' -> withdraw();
//                case '4' -> transfer();
//                case '5' -> checkMyBalance();
//                case '6' -> closeMyAccount();
//            }
//        }
//
//        private static void createANewAccount() {
//            String firstName = input("Enter your first name: ");
//            String lastName = input("Enter your last name: ");
//            String phoneNum = input("Enter your Telephone Number: ");
//            String pin = input("Enter your pin; ");
//
//            bank.createNewAccount(firstName, lastName, phoneNum, pin);
//            display("Account Created Successfully");
//            mainMenu();
//        }

//        private static void deposit(){
//            int accountNumber = Integer.parseInt(input("Enter account number: "));
//            int amount = Integer.parseInt(input("Enter your amount:"));
//            bank.depositAmount(accountNumber, amount);
//            display("deposited..");
//            mainMenu();
//        }
//
//        private static void withdraw(){
//            int accountNumber = Integer.parseInt(input("Enter account number: "));
//            String pin = input("Enter your pin: ");
//            int amount = Integer.parseInt(input("Enter amount: "));
//            display("successful");
//            try {
//                bank.withdrawAmount(accountNumber, pin, amount);
//            }catch (IllegalArgumentException error){
//                display(error.getMessage());
//                withdraw();
//            }
//            mainMenu();
//        }
//
//        private static void transfer() {
//            int senderAccountNumber = Integer.parseInt(input("Enter account number: "));
//            int recipientAccountNumber = Integer.parseInt(input("Enter recipient's account number: "));
//            int amount = Integer.parseInt(input("Enter an Amount "));
//            String senderPin = input("Enter your pin: ");
//            bank.transferAmount(senderAccountNumber, senderPin, amount, recipientAccountNumber);
//            display("transaction successful");
//            mainMenu();
//        }
//
//        private static void checkMyBalance() {
//            int accountNumber = Integer.parseInt(input("Enter account number: "));
//            String pin = input("Enter your pin: ");
//            bank.checkMyBalance(accountNumber, pin);
//            mainMenu();
//        }
//        private static void closeMyAccount() {
//            int accountNumber = Integer.parseInt(input("Enter account number: "));
//            String pin = input("Enter your pin: ");
//            bank.closeAccount(accountNumber);
//            display("account closed successfully");
//            mainMenu();
//        }
//
//        public static String input(String prompt){
//            return JOptionPane.showInputDialog(prompt);
//        }
//
//        public static void display(String prompt){
//            JOptionPane.showMessageDialog(null, prompt);
//        }
//    }

//    public void getAccount (){
//        Scanner generate = new Scanner(System.in);
//        System.out.println("Please input your Bank Name");
//        String generateAccount = generate.nextLine();
//        System.out.println("You use a "+ generateAccount + " Account");
//        switch (generateAccount) {
//            case "First Bank" -> generateFirstBank();
//            case "UBA" -> generateUBA();
//            case "Diamond Bank" -> diamondBank();
//            case "Access Bank" -> accessBank();
//        }
//
//    }





//        myBank.createNewAccount("Omo Ase", "Ajegbodo", "0803234969");
//        myBank.getAccount();
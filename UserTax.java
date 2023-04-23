package Television;

import java.util.Scanner;

public class UserTax {


    public static void main(String[] args) {
        firstTaxPayer();
        secondTaxpayer();
        thirdTaxpayer();
    }

    public static double firstTaxPayer(){
            double result=1;
            Scanner tax = new Scanner(System.in);
            System.out.println("Enter name of first taxpayer");
            String firstTaxPayer = tax.nextLine();
            System.out.println("Enter annual earning for " + firstTaxPayer);
            int taxPayerEarnings = tax.nextInt();
            int userInput = taxPayerEarnings;

            if (userInput <= 30000) {
                result = userInput * 15 / (100);
                System.out.println(firstTaxPayer + "'s tax is = " + result);
            }else if (userInput > 30000) {
                result = userInput * 20 / (100);
                System.out.println(firstTaxPayer + "'s tax is = " + result);
            }else System.out.println("Please enter a new number");


        return result;
    }
    public static double secondTaxpayer(){
        double result=1;
        Scanner tax = new Scanner(System.in);
        System.out.println("Enter name of second taxpayer");
        String secondTaxPayer = tax.nextLine();
        System.out.println("Enter annual earning for " + secondTaxPayer);
        int taxPayerEarnings = tax.nextInt();
        int userInput = taxPayerEarnings;

        if (userInput <= 30000) {
            result = userInput * 15 / (100);
            System.out.println(secondTaxPayer + "'s tax is = " + result);
        }else if (userInput > 30000) {
            result = userInput * 20 / (100);
            System.out.println(secondTaxPayer + "'s tax is = " + result);
        }else System.out.println("Please enter a new number");


        return result;
    }

    public static void thirdTaxpayer(){
        double result = 1;
        Scanner tax = new Scanner(System.in);
        System.out.println("Enter name of third taxpayer");
        String thirdTaxPayer = tax.nextLine();
        System.out.println("Enter annual earning for " + thirdTaxPayer);
        int taxPayerEarnings = tax.nextInt();
        int userInput = taxPayerEarnings;

        if (userInput <= 30000) {
            result = userInput * 15 / (100);
            System.out.println(thirdTaxPayer + "'s tax is = " + result);
        }else if (userInput > 30000) {
            result = userInput * 20 / (100);
            System.out.println(thirdTaxPayer + "'s tax is = " + result);
        }else System.out.println("Please enter a new number");



    }
}

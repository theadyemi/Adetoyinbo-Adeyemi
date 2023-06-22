package NewAccount;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {

    private String account;
    private String receiverAccount;
    private String senderAccount;
    private String firstName;
    private String lastName;
    private static String accountNumber;
    private static String phoneNumber;
    private String pin;
    private String name;
    private ArrayList <Account> accounts = new ArrayList<>();


    public void createNewAccount(String firstName, String lastName, String phoneNumber, String pin){
        this.firstName = firstName;
        this.lastName = lastName;
        name = firstName + " " + lastName;
        Bank.phoneNumber = phoneNumber;
        if (!name.equals("") && phoneNumber != ""){
            generateAccountNumber(phoneNumber);
            Account newAccount = new Account(firstName, lastName , phoneNumber, pin);
            accounts.add(newAccount);
            newAccount.getName();
            System.out.println(newAccount.getPhoneNumber());;
            }
        }

    public String generateAccountNumber(String phoneNumber) {
        accountNumber = phoneNumber;
        if (phoneNumber.startsWith("0")){
            accountNumber=phoneNumber.substring(-1, -7);
        }
//        String cleanedNumber = phoneNumber.replaceAll("\\D", "");
//        StringBuilder accountNumberBuilder = new StringBuilder();
//        for (int index = 0; index < cleanedNumber.length(); index++) {
//            accountNumberBuilder.append(cleanedNumber.charAt(index));
//        }
//        accountNumberBuilder.deleteCharAt(0);
//        accountNumber = accountNumberBuilder.toString();


        return accountNumber;
    }

//    public static void main(String[] args) {
//        String okay = generateAccountNumber("09023417494");
//        System.out.println(okay);
//    }

    public int getAccountsRegistered(){
        return accounts.size();
    }

    public Account findRegisteredAccount(int accountNumber){
        return accounts.get(accountNumber-1);
    }

    public BigDecimal checkMyBalance(int accountNumber, String pin){
        Account account = findRegisteredAccount(accountNumber);
        return BigDecimal.valueOf(account.getBalance(pin));
    }

    public void depositAmount(int accountNumber, int amount){
        Account account = findRegisteredAccount(accountNumber);
        account.deposit(amount);
    }
    public void withdrawAmount(int accountNumber, String pin, int amount){

        Account account =  findRegisteredAccount(accountNumber);
        account.withdraw(amount, pin);
    }

    public void closeAccount(int accountNumber){
        Account account = findRegisteredAccount(accountNumber);
        Account replaceElement = new Account(null,null,null, " ");
        accounts.add(accountNumber, replaceElement);
        accounts.remove(account);
    }

    public void transferAmount(int senderAccountNumber, String senderPin, int amount, int recipientAccountNumber){
        Account senderAccount = findRegisteredAccount(senderAccountNumber);
        Account recipientAccount = findRegisteredAccount(recipientAccountNumber);
        senderAccount.withdraw(amount, senderPin);
        recipientAccount.deposit(amount);
    }



    public void withdraw(){
        for(Account account: accounts){
//            account.withdraw(pin, Integer.parseInt(amount));

        }


    }

    public void deposit(){
//        String amount = withdraw.next();
//        if (amount>0){

        }











}


//    public static void main(String[] args) {
//        String phoneNumber = "08023415794";
//        String accountNumber = generateAccountNumber(phoneNumber);
//        System.out.println("Account Number: " + accountNumber);
//    }


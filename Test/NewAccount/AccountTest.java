package NewAccount;//package NewAccount;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class AccountTest {
//    Account newAccount = new Account();
//    @Test
//    public void testThatAccountExist(){
//        newAccount = new Account();
//        assertNotNull(newAccount);
//    }
//
//    @Test
//    public void checkBalanceInAccount(){
//        newAccount.deposit(3000);
////        int newBalance = newAccount.depositIntoAccount(3000);
////        assertEquals(3000, newBalance);
//    }
//
//    @Test
//    public void getBalance(){
//        newAccount.depositIntoAccount(2000);
//        assertEquals(0,newAccount.getBalance("Pin"));
//    }
//
//}

public class AccountTest {
    public static String generateAccountNumber(String phoneNumber) {
        // Remove any non-digit characters from the phone number
        String cleanedNumber = phoneNumber.replaceAll("\\D", "");

        // Generate the account number by concatenating the digits
        StringBuilder accountNumberBuilder = new StringBuilder();
        for (int i = 0; i < cleanedNumber.length(); i++) {
            accountNumberBuilder.append(cleanedNumber.charAt(i));
        }
        String accountNumber = accountNumberBuilder.toString();

        return accountNumber;
    }

    public static void main(String[] args) {
        String phoneNumber = "123-456-7890";
        String accountNumber = generateAccountNumber(phoneNumber);
        System.out.println("Account Number: " + accountNumber);
    }
}
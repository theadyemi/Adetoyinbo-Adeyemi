package NewAccount;

public class Account {
    private int balance;
    private String pin;
    private String name;
    private String phoneNumber;
    private int accountNumber;

    public Account(String firstName, String lastName, String phoneNumber, String pin){
        name = firstName + lastName;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
        this.accountNumber = accountNumber;
    }

    public void setName(String firstName,  String lastName){
        this.name = firstName + " " + lastName;
        System.out.println(this.name);
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = Integer.parseInt(accountNumber);
    }

    public void deposit(int amount) {
        if (amount > 0) balance += amount;
    }

    public int withdraw(int amount, String pin){
        if (!pin.equals(this.pin)){
            if(amount < balance) throw new IllegalArgumentException("Invalid pin... Try again");
            else balance -= amount;
            }
        return balance;
    }

    public void depositIntoAccount(int amount) {
        balance = balance + amount;

    }

    public int getBalance(String pin) {
        if (!pin.equals(this.pin)) throw new IllegalArgumentException("Invalid Pin... try again");
        return balance;
    }

    @Override
    public String toString() {
        return String.format(""" 
                Account name: %s
                Account balance: %s
                """, name, balance);
    }
}

package atm;

public class Account {
    private int accountNumber;
    private int pin;
    private double balance;

    public Account(int accountNumber, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean validatePIN(int enteredPin){
        return this.pin == enteredPin;
    }

    public void deposit(double amount) {
        double v = balance + -amount;
        System.out.println("Deposited:" + amount);
    }

    public boolean withdrawal(double amount){
        if (amount <= balance){
            balance -= amount;
            System.out.println("withdrew: " + amount);
            return true;
        }
        else{
            System.out.println("Insufficient fund");
            return false;
        }
    }

    public double checkBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

}

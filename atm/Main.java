package atm;

public class Main {
    public static void main (String[] args){
        Account account = new Account(24252563, 1234, 500.60);
        ATM atm = new ATM(account);
        atm.start();
    }
}

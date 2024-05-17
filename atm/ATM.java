package atm;

import java.util.Scanner;

public class ATM {
    private Account currentAccount;

    public ATM(Account currentAccount) {
        this.currentAccount = currentAccount;
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter PIN");
        int enteredPin = scanner.nextInt();
        if (currentAccount.validatePIN(enteredPin)){
            boolean quit = false;
            while (!quit) {
                System.out.println("1:Withdraw \n2:Deposit \n3:Check balance \n4:Airtime \n5:Exit" );
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter amount to withdraw:");
                        double withdrawAmount = scanner.nextDouble();
                        currentAccount.withdrawal(withdrawAmount);
                        break;
                    case 2:
                        System.out.println("Enter amount to deposit");
                        double depositAmount = scanner.nextDouble();
                        currentAccount.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.println("Your balance is:" + currentAccount.checkBalance());
                        break;
                    case 4:
                        System.out.println("Enter amount for airtime:");
                        double airtimeAmount = scanner.nextDouble();
                        if (currentAccount.withdrawal(airtimeAmount)){
                            System.out.println("Airtime purchased:" + airtimeAmount);
                        }
                        break;
                    case 5:
                        System.out.println("Thank you for using the ATM.");
                        quit = true;
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            }

        } else {
            System.out.println("Invalid PIN");
        }
        scanner.close();

    }
}

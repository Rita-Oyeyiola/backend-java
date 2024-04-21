package practise;

import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();


        int sum = firstNumber + secondNumber;
        System.out.println("sum:" + sum);

        int multiply = firstNumber * secondNumber;
        System.out.println("multiplication:" + multiply);

        int subtract = firstNumber - secondNumber;
        System.out.println("subtraction:" + subtract);

        int division = firstNumber / secondNumber;
        System.out.println("division:" + division);

    }

}

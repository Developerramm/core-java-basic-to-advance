package flowcontrol;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        System.out.println("java if else statement here below");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        int age = input.nextInt();

        if (age < 12) {
            System.out.println("You are child ");
        } else if (age >= 12 && age <= 18) {
            System.out.println("You are teenager");
        } else {
            System.out.println("You are adult ");
        }

        input.close();
    }

}

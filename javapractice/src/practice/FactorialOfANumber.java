package practice;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = sc.nextInt();

        int ans = 1;

        for (int i = 1; i <= number; i++) {
            ans = ans * i;
        }

        System.out.println("The factorial is " + ans);
        sc.close();
    }

}

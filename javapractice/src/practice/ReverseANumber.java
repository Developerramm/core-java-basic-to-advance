package practice;

import java.util.Scanner;

public class ReverseANumber {

    public static int reverseNumber(int number) {
        int ans = 0;
        int digit;

        while (number != 0) {
            digit = number % 10;
            ans = ans * 10 + digit;
            number = number / 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse it");
        int number = sc.nextInt();

        int ans = reverseNumber(number);

        System.out.println("The reverse number is " + ans);

        sc.close();

    }

}

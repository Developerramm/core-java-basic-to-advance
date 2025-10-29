package practice;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = sc.nextInt();

        int ans = 0;
        int evenAns = 0;
        int oddAns = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenAns += i;
            } else {
                oddAns += i;
            }
        }

        ans = oddAns - evenAns;
        System.out.println(ans);

        sc.close();

    }
}

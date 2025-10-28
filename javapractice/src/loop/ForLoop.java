package loop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("for loop in java ");

        for (int i = 0; i < 5; i++) {
            System.out.println("Ram kumar");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print 1 to n");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }

}

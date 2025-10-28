package loop;

import java.util.Scanner;

public class DowhileLoop {
    public static void main(String[] args) {
        System.out.println("do while loop in java ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print 1 to n");
        int n = sc.nextInt();

        int count = 1;

        do {
            System.out.print(count + " ");
            count++;
        } while (count <= n);

        sc.close();
    }

}

package loop;

import java.util.Scanner;

public class SumOfNnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print sum of n natural number");
        int n = sc.nextInt();

        int sum = 0;
        int count = 1;

        while (count <= n) {
            sum += count;
            count++;
        }

        System.out.println("sum of n natural number is " + sum);

        sc.close();
    }

}

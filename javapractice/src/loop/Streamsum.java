package loop;

import java.util.Scanner;

public class Streamsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;

        while (true) {
            if (num < 0) {
                break;
            }
            sum = sum + num;
            System.out.println("Enter next number ");
            num = sc.nextInt();
        }

        System.out.println("the sum is " + sum);

        sc.close();
    }

}

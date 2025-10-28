package loop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print counting");
        int n = sc.nextInt();

        int num = 1;

        while(num <= n){
            System.out.print(num + " ");
            num++;
        }
        System.out.println();

        sc.close();

    }
}

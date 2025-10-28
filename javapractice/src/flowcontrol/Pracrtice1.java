package flowcontrol;

import java.util.Scanner;

public class Pracrtice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 3 == 0 || number % 5 == 0) {
            System.out.println("Number is divisible by 3 or 5");
        } else {
            System.out.println("Number is not divisible by 3 or 5");
        }

        sc.close();
    }

}

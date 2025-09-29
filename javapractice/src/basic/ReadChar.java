package basic;

import java.util.Scanner;

public class ReadChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        System.out.println("your name is " + name);

        System.out.println("Enter a character : ");
        char ch = input.next().charAt(0);
        System.out.println("You entered charater " + ch);

        int p = input.nextInt();
        String q = input.next();

        System.out.println(p);
        System.out.println(q);

        input.close();
        
    }
}

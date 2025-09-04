import java.util.Scanner;

public class ByteMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte number1 = sc.nextByte();
        byte number2 = sc.nextByte();

        int result = number1 * number2;

        System.out.println(result);

        sc.close();
    }

}

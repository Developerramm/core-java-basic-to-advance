package loop;

public class ExceptMulOf3 {

    public static void main(String[] args) {

        System.out.println("print 1 to 50 except multiple of 3");

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

    }

}

public class DoWhile {

    public static void main(String[] args) {

        int i = 0;

        int sum = 0;

        do{
            i++;
            System.out.print(i + " ");

            sum = sum + i;
            
        }while(i <10);


        System.out.println();
        System.out.println("the sum is " + sum);


    }
}

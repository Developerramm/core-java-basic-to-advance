public class WhileLoop {

    public static void main(String[] args) {

        int count = 10;

        while(count != 0){
            System.out.print(count + " ");
            count--;
        }

        System.out.println();

        int ans = 1;

        int factNumber = 5;

        while(factNumber != 1){
            ans = ans * factNumber;
            factNumber--;
        }

        System.out.println(ans);
        
    }

}

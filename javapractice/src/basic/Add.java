package basic;

public class Add {

    public static int  addTwoNumber(int number1, int number2){
        return number1 + number2;
    }

    public static void main(String[] args) {
        
        System.out.print("The sum of two number is ");
        System.out.println(addTwoNumber(10, 30));

        System.out.println("Another sum of two number is " + addTwoNumber(200, 300));
    }

}

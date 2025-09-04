package method;

public class MethodReturnType {

    static int multiply(int number1,int number2){

        return number1 * number2;
    }

    static String showMyName(String name){
        String name1 = "Your name is " + name;

        return name1;
    }

    public static void main(String[] args) {

        int multiplicationResult = multiply(10, 20);
        System.out.println(multiplicationResult);

        multiplicationResult = multiply(40, 50);
        System.out.println(multiplicationResult);

        String myname = showMyName("Pihu varma");
        System.out.println(myname);
        
    }

}

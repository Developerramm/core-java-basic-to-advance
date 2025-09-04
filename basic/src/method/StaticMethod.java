package method;

public class StaticMethod {

    // non static method
    void sum(){
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println("Result is " + c);
    }

    // static method
    static void add(){
        int a = 20;
        int b = 30;
        int c = a + b;
        System.out.println("The restutl is " + c);
    }

    public static void main(String[] args) {

        // non static method
        StaticMethod staticMethod = new StaticMethod();
        staticMethod.sum();

        System.out.println();
        add();
        
    }

}

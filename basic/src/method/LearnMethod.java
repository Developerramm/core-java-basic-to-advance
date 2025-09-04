package method;

public class LearnMethod {

    static void printCounting(int number){
        for(int i = 1; i<=number; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void printName(String name) {
        System.out.println("Your name is " + name);
    }

    public void printEvenNumber(int number){
        
        for(int i = 2; i<=number; i=i+2){

            System.out.print(i + " ");
        }

    }

    void wishMe(String name,int age){
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }

    public static void main(String[] args) {
        printName("Ram kumar");
        printName("Sarita kumari");
        printName("Sanjay Kumar");
        printName("Geeta kumari");
        System.out.println();

        printCounting(100);

        System.out.println();

        LearnMethod learnMethod = new LearnMethod();
        learnMethod.printEvenNumber(100);

        System.out.println();

        learnMethod.wishMe("Ram kumar", 30);
        learnMethod.wishMe("Amit kumar", 40);
    }

}

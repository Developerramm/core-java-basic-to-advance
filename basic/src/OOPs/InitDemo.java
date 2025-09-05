package OOPs;

public class InitDemo {

    String name;
    int age;

    InitDemo(){
        System.out.println("default constructor");
    }

    InitDemo(String name, int age){
        System.out.println("Parameterized constructor");
        this.name = name;
        this.age = age;
    }

    {
        System.out.println("this is init block");
    }

    

    @Override
    public String toString() {
        return "InitDemo [name=" + name + ", age=" + age + "]";
    }



    public static void main(String[] args) {
        InitDemo initDemo = new InitDemo("ram", 30);

        System.out.println(initDemo);

        InitDemo init = new InitDemo();
        System.out.println(init);
    }

}

package OOPs;


// using this keyword to access instance variable of the current class
public class ThisDemo {

    String name;
    int roll;

    ThisDemo(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

    void showName(String name){
        // String name = "Ram kumar";
        System.out.println(name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        ThisDemo thisDemo = new ThisDemo("Amit", 10);
        System.out.println(thisDemo);

        

    }

}

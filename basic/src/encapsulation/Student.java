package encapsulation;

public class Student {

    // instance data member
    String name = "Ram kumar";

    // member function
    void showName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.showName();

    }

}

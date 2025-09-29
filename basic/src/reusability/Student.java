package reusability;

public class Student {

    String name;
    int roll;


    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }


    public static void main(String[] args) {

        Student student = new Student("Ram kumar", 39);
        System.out.println(student.name + " " + student.roll);


        Address sAddress = new Address();
        sAddress.showAddress();


    }


}

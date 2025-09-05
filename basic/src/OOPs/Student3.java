package OOPs;

public class Student3 {

    String name;

    Student3(){
        System.out.println("Thsi is default constructor");
    }

    Student3(String name){
        this();
        this.name = name;
        System.out.println("Thsi is parameterized constructor");
    }


    public static void main(String[] args) {
        Student3 student3 = new Student3("Ram kumar");
        System.out.println(student3.name);

        Student3 s3 = new Student3();
        System.out.println(s3.name);
    }
}

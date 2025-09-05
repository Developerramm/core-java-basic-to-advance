package OOPs;

public class Student2 {

    void study(){
        System.out.println("Student2.study()");
    }

    void attendenceClass(){
        System.out.println("Student2.attendenceClass()");
        study();
        this.study();
    }

    public static void main(String[] args) {

        Student2 student2 = new Student2();
        student2.attendenceClass();
        
    }

}

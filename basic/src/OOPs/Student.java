package OOPs;

public class Student {

    public static void main(String[] args) {
        StudentDetails studentDetails = new StudentDetails("ram", 20, "age", "Program");
        System.out.println(studentDetails);

        studentDetails.showStudentDetails();
    }

}

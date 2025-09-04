package OOPs;

public class StudentDetails {

    String name;
    int age;
    String section;
    String subject;

    public StudentDetails(String name,int age,String section,String subject){
        this.name = name;
        this.age = age;
        this.section = section;
        this.subject = subject;
    }

    void showStudentDetails(){
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Section is " + section);
        System.out.println("Subject is " + subject);
    }

    @Override
    public String toString() {
        return "StudentDetails [name=" + name + ", age=" + age + ", section=" + section + ", subject=" + subject + "]";
    }


}

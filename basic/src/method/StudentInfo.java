package method;

public class StudentInfo {

    String name;
    int std;
    int roll;
    String schoolName;

    public StudentInfo(String name, int std, int roll, String schoolName) {
        this.name = name;
        this.std = std;
        this.roll = roll;
        this.schoolName = schoolName;
    }


    @Override
    public String toString() {
        return "StudentInfo [name=" + name + ", std=" + std + ", roll=" + roll + ", schoolName=" + schoolName + "]";
    }

    public static void main(String[] args) {

        StudentInfo info = new StudentInfo("ram", 4, 5, "MRD");
        System.out.println(info);
        
    }
}

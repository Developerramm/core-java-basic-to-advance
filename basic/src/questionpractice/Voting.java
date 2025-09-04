package questionpractice;

public class Voting {

    void checkEligibilty(String name, int age) {
        if (age >= 18) {
            System.out.println(name + " is eligible to vote");
        } else {
            System.out.println(name + " is not eligible to vote ");
        }
    }

    public static void main(String[] args) {

        Voting voting = new Voting();

        voting.checkEligibilty("Ram kumar", 30);

        voting.checkEligibilty("Sarita", 16);
    }

}

package encapsulation;

public class Test {

    public static void main(String[] args) {

        UserDetails userDetails = new UserDetails();
        System.out.println(userDetails);
        userDetails.setEmail("Ram@gmail.com");
        userDetails.setPassword("2343434");

        System.out.println(userDetails);
        System.out.println(userDetails.getEmail());
        System.out.println(userDetails.getPassword());

        


    }

}

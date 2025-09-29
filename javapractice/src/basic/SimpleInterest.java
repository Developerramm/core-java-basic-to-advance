package basic;

import java.util.Scanner;

public class SimpleInterest {

    public float simpleInterest(float p, float r, float t){
        return p * r * t / 100.0f;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter principal : ");
        float p = input.nextFloat();

        System.out.println("Enter rate of interest : ");
        float r = input.nextFloat();

        System.out.println("Enter time ");
        float t = input.nextFloat();

        SimpleInterest si = new SimpleInterest();
        float interest = si.simpleInterest(p, r, t);
        System.out.println("Simple interest is " + interest);


        input.close();
        
    }

}

package Chapter1;

import java.util.Scanner;

public class classwork {
    public static void main(String args[]) {
        Scanner Sujal = new Scanner(System.in);

        System.out.print("Enter true for male and false for female :");
        boolean male = Sujal.nextBoolean();
        int age;
        System.out.println("Enter Age:");
        age = Sujal.nextInt();
        if (male) {
            if (age >20) {
                System.out.print("man");
            } else {
                System.out.print("boy");
            }
        } else {
            if (male==false && age>20) {
                System.out.print("woman");
            } else {
                System.out.print("girl");
            }
        }
    }
}


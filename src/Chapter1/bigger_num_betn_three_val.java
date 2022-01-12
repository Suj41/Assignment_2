package Chapter1;

import java.util.Scanner;
public class bigger_num_betn_three_val {
    public static void main (String[] args)
    {
        Scanner Sujal = new Scanner(System.in);
        int first, second, third;
        System.out.println("Enter First :");
        first = Sujal.nextInt();
        System.out.println("Enter Second :");
        second = Sujal.nextInt();
        System.out.println("Enter Third :");
        third = Sujal.nextInt();
        if(first>second && first>third){
        System.out.println("First is grater.");
        } else if (second>third && second>first){
        System.out.println("Second is greater");
    } else{
        System.out.println("Third is greater");
        }
    }
}

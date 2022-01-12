package Chapter1;

import java.util.Scanner;
public class bigger_num_in_two_value {
    public static void main(String[] args){
        int first, second;
        Scanner Sujal= new Scanner(System.in);
        System.out.print("Enter first number : ");
        first = Sujal.nextInt();
        System.out.print("Enter second number : ");
        second = Sujal.nextInt();
       int t=Sujal.nextInt();
        /*  if(first>second){
            System.out.println("first is greater than second.");
        } else if(second>first) {
            System.out.println("second is greater than first.");

        }
        else{
            System.out.println("Invalid Results.");
        }*/
        System.out.println("Greater Value is:"+Math.max(first,second));
    }
}

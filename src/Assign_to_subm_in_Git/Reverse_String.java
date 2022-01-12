package Assign_to_subm_in_Git;

import java.util.Scanner;
class Reverse_String {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println( "Enter the string:");
        String str = sc.next();;
        String reverse = "";
        for (int i = str.length() - 1; i>=0; i--){
            reverse=reverse+ str.charAt(i);
        } if(str.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}

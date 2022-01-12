package Chapter1;

import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class check_vowel_and_constant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Alphabet :");
        char chr =toLowerCase(sc.next().charAt(0));
        if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u')
        {
            System.out.print("Character " + chr + " is Vowel");

        }else{
            System.out.print("Character " +chr+ " is Consonant");
        }
    }
}





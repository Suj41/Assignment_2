package Chapter1;

import java.util.Scanner;
public class Do_while {
    public static void main(String[] args) {
        char choice;
        do{
    Scanner sc=new Scanner(System.in);
            System.out.println("Enter First Number :");
            int first= sc.nextInt();
            System.out.println("Enter Second Number :");
            int second = sc.nextInt();
            int result=first+second;
            System.out.println("Sum is :"+ result);
            System.out.println("Do you want to continue(Y/N):");
            choice = sc.next().toLowerCase().charAt(0);
        }
            while(choice=='y');

    }
}

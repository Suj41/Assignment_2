package Assign_to_subm_in_Git;

import java.util.Scanner;
public class Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int counter=0;

        for (int i=1; i<=number; i++){
            int div = number%i;
            if (div == 0){
                counter++;
            }
        }
        if (counter>2){
            System.out.println("Not Prime Number");
        }
        else
            System.out.println("Prime Number");
    }

    public static class Pyramid_star {
        public static void main(String[] args)
        {
            int rows=5;

            System.out.println("\nThe star pattern is... ");
            for (int i = 1; i <= rows; i++)
            {
                for (int j=rows; j>i; j--)
                {
                    System.out.print(" ");
                }
                for (int k=1; k<=(i * 2) -1; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

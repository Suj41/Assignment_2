package Assign_to_subm_in_Git;

import java.util.Arrays;
import java.util.Scanner;
public class Name_in_acend_order {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a string : ");
            String userInput = scanner.nextLine();

            char[] charArray = userInput.toCharArray();

            Arrays.sort(charArray);
            System.out.println("Sorted string " + String.valueOf(charArray));
        }

    public static class Inverted_Pyramid {
        public static void main(String[] args)
        {
            int rows = 5;
            System.out.println("\nThe star pattern is... ");
            for (int i=rows; i>=1; i--)
            {
                for (int j=1; j<=(i * 2) -1; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
                for (int k=rows; k>=i; k--)
                {
                    System.out.print(" ");
                }
            }
        }
    }
}

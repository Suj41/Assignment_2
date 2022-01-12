package Assign_to_subm_in_Git;

public class Inverse_Square {
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

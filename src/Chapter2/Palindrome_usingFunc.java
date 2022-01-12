package Chapter2;
import java.util.Scanner;
public class Palindrome_usingFunc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number :");
        int num= sc.nextInt();
//        int result;
        int value=findPalindrome(num);
       // System.out.println("");

        if(value==num)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    public static int findPalindrome(int num)
    {
        int qout,rem;
        qout= num/10;
        rem=num%10;
       int result= rem*10+qout;

        return result;

    }
}

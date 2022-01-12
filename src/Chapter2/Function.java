package Chapter2;
import java.util.Scanner;
public class Function {

    public static void main(String[] args) {
        System.out.println("Enter First :");
        Scanner shoes = new Scanner(System.in);
        int first= shoes.nextInt();
        System.out.println("Enter Second :");
        int second = shoes.nextInt();
        int result = addTwoNumber(first, second);
        System.out.println("Sum is "+ result);
    }
    public static int addTwoNumber(int first, int second)
    {
        int result=first+second;
        return result;
        //return first+second;
    }
}

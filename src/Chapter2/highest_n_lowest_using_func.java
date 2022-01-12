package Chapter2;
import java.util.Scanner;
public class highest_n_lowest_using_func {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First :");
        int first = sc.nextInt();
        System.out.println("Enter Second :");
        int second = sc.nextInt();
        System.out.println("Enter Third :");
        int third = sc.nextInt();
        int highest=findHighest(first, second,third);
        System.out.println("Highest Value :"+highest);
        int lowest=findLowest(first,second,third);
        System.out.println("Lowest Value :"+lowest);
    }
    public static int findHighest(int first, int second, int third)
    {
        int highest;
        if(first> second && first> third)
            highest=first;
        else if(second>first && second>third)
            highest=second;
        else
            highest=third;
        return highest;
    }
    public static int findLowest(int first, int second, int third)
    {
        int lowest;
        if(first<second && first< third)
            lowest=first;
        else if(second<first && second<third)
            lowest=second;
        else
            lowest=third;
        return lowest;
    }
}

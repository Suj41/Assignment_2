package Chapter1;

import java.util.Scanner;
public class leap_year {
public static void main(String[] args)
{
Scanner Sujal = new Scanner(System.in);
int year;

System.out.print("Enter Year :");
year = Sujal.nextInt();
if(year%4==0)
{
    System.out.print("Year is leap.");
}
else {
    System.out.print("year is not leap.");
}
}
}

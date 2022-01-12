package Chapter2;

import java.util.Scanner;

public class factorial_using_func {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();


        int value = findFactorial(num);
        System.out.println("Factorial of "+num+" is "+value);
    }

    public static int findFactorial(int num) {
        int fact = 1;

        for(int i =num;i>1;i--){
            fact = fact * i;
        }

        return fact;
    }
}

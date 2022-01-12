import java.util.Scanner;

public class Menudrivenprogram {
    public static void main(String[] args) {

        System.out.println("1.Add two nos ");
        System.out.println("2.Palindrome number");
        System.out.println("3. Simple interest");
        System.out.println("4. Odd even");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice(1,2,3,4):");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter first no: ");
                int first = sc.nextInt();
                System.out.print("Enter second no: ");
                int second = sc.nextInt();
                int result = first + second;
                System.out.print("Sum is" + result);
                break;
            case 2:
                System.out.print("Enter no");
                int num = sc.nextInt();
                int rem = num % 10;
                int quot = num / 10;
                int results = rem * 10 + quot;
                if (num == results)
                    System.out.print("Palindrome");
                else
                    System.out.print("Not Palindrome");
                break;
            case 3:
                System.out.print("Enter principle");
                int principle = sc.nextInt();
                System.out.print("Enter rate");
                int rate = sc.nextInt();
                System.out.print("Enter time");
                int time = sc.nextInt();

                System.out.print("simple interest =" + ((principle * rate * time) / 100));
                break;
            case 4:
                System.out.print("Enter number");
                int number = sc.nextInt();
                if (number % 2 == 0) {
                    System.out.print("it is even");
                } else {
                    System.out.print(" it is odd");
                }
                break;
            default:
                System.out.print("Invalid");

        }
    }
}

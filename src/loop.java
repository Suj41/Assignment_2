import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        Scanner Sujal = new Scanner(System.in);
        System.out.println("Enter Starting Point:");
        int start = Sujal.nextInt();
        System.out.println("Enter End Point:");
        int c = 0;

        int end = Sujal.nextInt();
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Number :" + i);
                c++;

            }

        }
        System.out.println("There are " + c + " numbers");
    }
}

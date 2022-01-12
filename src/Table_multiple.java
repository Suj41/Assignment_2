import java.util.Scanner;
public class Table_multiple {
    public static void main(String[] args) {
        Scanner Sujal = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n= Sujal.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n+"*" + i + "=" + n * i);
        }
    }
}

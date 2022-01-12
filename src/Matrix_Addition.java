import java.util.Scanner;

public class Matrix_Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 2;
        int col = 2;
        int[][] arr = new int[row][col];
        int[][] arr1 = new int[row][col];
        System.out.println("For 1st matrix:-");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the value of "+i+" "+j+":");
               arr[i][j] = sc.nextInt();


                //System.out.print(arr[i][j] + "  ");
            }
           //System.out.println();
        }
        System.out.println("For 2nd matrix:-");
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the value of "+i+" "+j+":");
                arr1[i][j]=sc.nextInt();
              //  System.out.print(arr1[i][j]+"  ");

            }
           // System.out.println();
        }
        System.out.println("For the Result of ADDTION:");
        int[][] res = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i][j] = arr[i][j] + arr1[i][j];
                System.out.print(res[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

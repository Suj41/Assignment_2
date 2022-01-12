

public class Multidimensional_array {
    public static void main(String[] args) {

        int row=2;
        int col=2;
        int[][] arr= new int[row][col];
        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++)
            {
                arr[i][j]=i+1;
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();

        }


    }
}

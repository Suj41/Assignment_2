package searchingHo;

import java.util.Scanner;

public class LinearSrc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,3,4,5,6,7,8,9};
        int searchValue = 50;

        Searching searching = new BinarySrc();

        searching.arr = arr ;
        searching.searchValue = searchValue;

        if(searching.search()){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
    }
}
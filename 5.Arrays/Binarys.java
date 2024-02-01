// binary search program through java without function.. 
// binary search always works on shorted array

import java.util.Scanner;

public class Binarys {

    public static void main(String[] args) {

        int arr[] = {10,30,60,80,120};
        int key = 60;
        int start = 0 , End = arr.length-1; 
        while (start <= End) {

            int mid = start + (End - start) / 2;

            if (arr[mid] == key) {
                System.out.println("the key is at index : "+mid);
                return;
            }

            if (arr[mid] < key) {
                start = mid + 1;   // right

            } else {
                End = mid - 1;  // left
            }
            
        }
        System.out.println("The element was not found");
          
    }
}
// Reverse an array..

import java.util.*;

public class Reverse {

    public static void reverseArray(int[] array) {
        int start = 0 , end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        reverseArray(array);

        for(int i=0; i<array.length ; i++){
            System.out.print(array[i]+" ");
        }
    }

 
}